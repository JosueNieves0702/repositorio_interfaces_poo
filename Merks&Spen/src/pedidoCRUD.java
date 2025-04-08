import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class pedidoCRUD {
    private Connection conexion;

    private List<Integer> listaIdArticulos = new ArrayList<>();
    private List<Integer> listaCantidades = new ArrayList<>();

    public pedidoCRUD() {
        conexion = Conexion_MySQL.conectar();
    }

    public boolean agregarArticulo(String nombreArticulo, String cantidadStr, JComboBox<String> combArticulo) {
        if (nombreArticulo == null || nombreArticulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un artículo.");
            return false;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
            return false;
        }

        int idArticulo = obtenerIdArticuloPorNombre(nombreArticulo);
        if (idArticulo == -1) {
            JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
            return false;
        }

        int stockDisponible = obtenerStockArticulo(idArticulo);
        if (cantidad > stockDisponible) {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible. Stock actual: " + stockDisponible);
            return false;
        }

        listaIdArticulos.add(idArticulo);
        listaCantidades.add(cantidad);

        JOptionPane.showMessageDialog(null, "Artículo agregado correctamente.");
        return true;
    }

    private int obtenerIdArticuloPorNombre(String nombreArticulo) {
        try {
            String sql = "SELECT id_articulo FROM Articulos WHERE nombre_articulo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreArticulo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_articulo");
                rs.close();
                ps.close();
                return id;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ID del artículo: " + e.getMessage());
        }
        return -1;
    }

    private int obtenerStockArticulo(int idArticulo) {
        try {
            String sql = "SELECT cantidad_articulo FROM Articulos WHERE id_articulo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idArticulo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int stock = rs.getInt("cantidad_articulo");
                rs.close();
                ps.close();
                return stock;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener stock del artículo: " + e.getMessage());
        }
        return 0;
    }

    private int obtenerIdDepartamento(String nombreDepartamento) {
        try {
            String sql = "SELECT id_departamento FROM Departamento WHERE nombre_departamento = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreDepartamento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_departamento");
                rs.close();
                ps.close();
                return id;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ID del departamento: " + e.getMessage());
        }
        return -1;
    }

    private int obtenerIdStatusPorNombre(String nombreStatus) {
        try {
            String sql = "SELECT id_status_pedido FROM Status_pedido WHERE Estatus = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreStatus);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_status_pedido");
                rs.close();
                ps.close();
                return id;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ID del status: " + e.getMessage());
        }
        return -1;
    }

    public boolean crearPedido(String nombreDepartamento, List<Integer> ids, List<Integer> cantidades) {
        try {
            conexion.setAutoCommit(false); // transacción

            // 1. Obtener ID del departamento
            int idDepartamento = obtenerIdDepartamento(nombreDepartamento);
            if (idDepartamento == -1) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return false;
            }

            // 2. Insertar en Pedido_articulos
            String sqlPedido = "INSERT INTO Pedido_articulos (id_departamento, fecha_pedido) VALUES (?, CURDATE())";
            PreparedStatement psPedido = conexion.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS);
            psPedido.setInt(1, idDepartamento);
            psPedido.executeUpdate();

            ResultSet rsPedido = psPedido.getGeneratedKeys();
            int idPedido = -1;
            if (rsPedido.next()) {
                idPedido = rsPedido.getInt(1);
            }
            rsPedido.close();
            psPedido.close();

            if (idPedido == -1) {
                conexion.rollback();
                JOptionPane.showMessageDialog(null, "No se pudo crear el pedido.");
                return false;
            }

            // 3. Obtener ID del status "en proceso"
            int idStatus = obtenerIdStatusPorNombre("en proceso");
            if (idStatus == -1) {
                conexion.rollback();
                JOptionPane.showMessageDialog(null, "No se encontró el estado 'en proceso'.");
                return false;
            }

            // 4. Insertar en Detalle_pedido_articulos y actualizar stock
            String sqlDetalle = "INSERT INTO Detalle_pedido_articulos (id_pedido_articulos, id_articulo, cantidad, id_status_pedido) VALUES (?, ?, ?, ?)";
            String sqlActualizarStock = "UPDATE Articulos SET cantidad_articulo = cantidad_articulo - ? WHERE id_articulo = ?";
            for (int i = 0; i < ids.size(); i++) {
                int idArticulo = ids.get(i);
                int cantidad = cantidades.get(i);

                // Insertar detalle
                PreparedStatement psDetalle = conexion.prepareStatement(sqlDetalle);
                psDetalle.setInt(1, idPedido);
                psDetalle.setInt(2, idArticulo);
                psDetalle.setInt(3, cantidad);
                psDetalle.setInt(4, idStatus);
                psDetalle.executeUpdate();
                psDetalle.close();

                // Actualizar stock
                PreparedStatement psStock = conexion.prepareStatement(sqlActualizarStock);
                psStock.setInt(1, cantidad);
                psStock.setInt(2, idArticulo);
                psStock.executeUpdate();
                psStock.close();
            }

            conexion.commit();
            JOptionPane.showMessageDialog(null, "Pedido creado correctamente.");
            return true;

        } catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                System.out.println("Error en rollback: " + ex.getMessage());
            }
            System.out.println("Error al crear pedido: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al crear el pedido.");
        } finally {
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException ex) {
                System.out.println("Error al restaurar autoCommit: " + ex.getMessage());
            }
        }
        return false;
    }

    public boolean finalizarPedido(String nombreDepartamento) {
        boolean resultado = crearPedido(nombreDepartamento, listaIdArticulos, listaCantidades);
        if (resultado) {
            limpiarPedido();
        }
        return resultado;
    }

    public List<Integer> getListaIdArticulos() {
        return listaIdArticulos;
    }

    public List<Integer> getListaCantidades() {
        return listaCantidades;
    }

    public void limpiarPedido() {
        listaIdArticulos.clear();
        listaCantidades.clear();
    }
    
    public DefaultTableModel obtenerPedidosPorDepartamento(String nombreDepartamento) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Pedido");
    modelo.addColumn("Fecha");
    modelo.addColumn("Estatus");
    
    try {
        // 1. Obtener ID del departamento
        int idDepartamento = obtenerIdDepartamento(nombreDepartamento);
        if (idDepartamento == -1) {
            JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
            return modelo;
        }
        
        // 2. Consulta para obtener los pedidos del departamento
        String sql = "SELECT pa.id_pedido_articulos, pa.fecha_pedido, sp.Estatus " +
                     "FROM Pedido_articulos pa " +
                     "JOIN Status_pedido sp ON pa.id_pedido_articulos IN " +
                     "(SELECT id_pedido_articulos FROM Detalle_pedido_articulos WHERE id_status_pedido = sp.id_status_pedido) " +
                     "WHERE pa.id_departamento = ? " +
                     "GROUP BY pa.id_pedido_articulos, pa.fecha_pedido, sp.Estatus " +
                     "ORDER BY pa.id_pedido_articulos";
        
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idDepartamento);
        ResultSet rs = ps.executeQuery();
        
        // 3. Llenar el modelo con los resultados
        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_pedido_articulos"),
                rs.getDate("fecha_pedido"),
                rs.getString("Estatus")
            };
            modelo.addRow(fila);
        }
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("Error al obtener pedidos por departamento: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al cargar los pedidos.");
    }
    
    return modelo;
}
 public List<Integer> obtenerIdsPedidosPorDepartamento(String nombreDepartamento) {
    List<Integer> idsPedidos = new ArrayList<>();
    
    try {
        // 1. Obtener ID del departamento
        int idDepartamento = obtenerIdDepartamento(nombreDepartamento);
        if (idDepartamento == -1) {
            JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
            return idsPedidos;
        }
        
        // 2. Consulta para obtener los IDs de los pedidos del departamento
        String sql = "SELECT id_pedido_articulos FROM Pedido_articulos " +
                    "WHERE id_departamento = ? ORDER BY id_pedido_articulos";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idDepartamento);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    idsPedidos.add(rs.getInt("id_pedido_articulos"));
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener IDs de pedidos: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al cargar IDs de pedidos.");
    }
    
    return idsPedidos;
} 

 public boolean modificarEstatusPedido(int idPedido, String nuevoEstatus) {
    try {
        // 1. Obtener el ID del nuevo estatus
        int idStatus = obtenerIdStatusPorNombre(nuevoEstatus);
        if (idStatus == -1) {
            JOptionPane.showMessageDialog(null, "Estatus no encontrado.");
            return false;
        }

        // 2. Actualizar el estatus del pedido en la tabla Detalle_pedido_articulos
        String sql = "UPDATE Detalle_pedido_articulos SET id_status_pedido = ? WHERE id_pedido_articulos = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idStatus);
        ps.setInt(2, idPedido);
        int rowsAffected = ps.executeUpdate();
        ps.close();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Estatus del pedido actualizado correctamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el pedido o no se pudo actualizar el estatus.");
            return false;
        }

    } catch (SQLException e) {
        System.out.println("Error al modificar estatus del pedido: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al modificar el estatus del pedido.");
    }
    return false;
}

}
    
    
    



