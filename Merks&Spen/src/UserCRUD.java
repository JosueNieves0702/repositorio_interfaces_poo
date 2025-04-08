import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserCRUD {
    private Connection conexion;
    
    //Constructor de la clase que arranca la conexión a BD
    public UserCRUD(){
        conexion = Conexion_MySQL.conectar();
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    public String Login(String departamento, String contraseña){
        String tipoUsuario = null;
        String Login = "SELECT U.Tipo_usuario FROM Usuarios U "+
                       "INNER JOIN Departamento D ON U.id_departamento = D.id_departamento "+
                       "WHERE D.Nombre_departamento = ? AND U.Contraseña = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(Login);
            ps.setString(1, departamento);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tipoUsuario = rs.getString("Tipo_usuario");
            }
            rs.close();
            ps.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    return tipoUsuario;
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    public int obtenerIdDepartamento(String nombreDepartamento) {
        int id = -1;
        try (Connection conn = Conexion_MySQL.conectar()) {
            String sql = "SELECT id_departamento FROM Departamento WHERE LOWER(Nombre_departamento) = LOWER(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombreDepartamento.trim());
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_departamento");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ID del departamento: " + e.getMessage());
        }
        return id;
    }

    public int crearDepartamento(String nombreDepartamento) {
        try (Connection conn = Conexion_MySQL.conectar()) {
            // Primero verificamos si ya existe
            String checkSql = "SELECT id_departamento FROM Departamento WHERE LOWER(Nombre_departamento) = LOWER(?)";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setString(1, nombreDepartamento.trim());
            ResultSet rs = checkPs.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("id_departamento"); // Ya existe, retornamos su ID
            }
            
            // Si no existe, lo creamos
            String insertSql = "INSERT INTO Departamento (Nombre_departamento) VALUES (?)";
            PreparedStatement insertPs = conn.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
            insertPs.setString(1, nombreDepartamento.trim());
            
            int filasAfectadas = insertPs.executeUpdate();
            if (filasAfectadas > 0) {
                ResultSet generatedKeys = insertPs.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Retornamos el ID del nuevo departamento
                }
            }
            return -1;
        } catch (SQLException e) {
            System.out.println("Error al crear departamento: " + e.getMessage());
            return -1;
        }
    }
    
    //Agregar
    public boolean insertarUsuario(String nombreDepartamento, String contraseña, String tipo_usuario) {
        // Primero obtenemos o creamos el departamento
        int idDepartamento = obtenerIdDepartamento(nombreDepartamento);
        if (idDepartamento == -1) {
            // Si no existe, lo creamos
            idDepartamento = crearDepartamento(nombreDepartamento);
            if (idDepartamento == -1) {
                return false; // No se pudo crear el departamento
            }
        }
        
        try (Connection conn = Conexion_MySQL.conectar()) {
            String sql = "INSERT INTO Usuarios (id_departamento, Contraseña, Tipo_usuario) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idDepartamento);
            ps.setString(2, contraseña);
            ps.setString(3, tipo_usuario);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
            return false;
        }
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------
    
    // Método para actualizar usuario (MODIFICAR)
    public boolean actualizarUsuario(int idUsuario, String nuevoDepartamento, String nuevaContraseña, String nuevoTipo) {
        int idDepartamento = obtenerIdDepartamento(nuevoDepartamento);
        if (idDepartamento == -1) {
            idDepartamento = crearDepartamento(nuevoDepartamento);
            if (idDepartamento == -1) return false;
        }

        String sql = "UPDATE Usuarios SET id_departamento = ?, Contraseña = ?, Tipo_usuario = ? WHERE id_usuario = ?";

        try (Connection conn = Conexion_MySQL.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idDepartamento);
            ps.setString(2, nuevaContraseña);
            ps.setString(3, nuevoTipo);
            ps.setInt(4, idUsuario);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------
    
    // Método para buscar usuario por ID (CONSULTAR POR ID)
    public ResultSet buscarPorID(int id) throws SQLException {
        Connection conn = Conexion_MySQL.conectar();
        String sql = "SELECT U.id_usuario, D.Nombre_departamento as Nombre, U.Contraseña, U.Tipo_usuario as Tipo " +
                     "FROM Usuarios U INNER JOIN Departamento D ON U.id_departamento = D.id_departamento " +
                     "WHERE U.id_usuario = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeQuery();
    }
    
    // Método para obtener todos los usuarios registrados en el sistema
   public ResultSet obtenerTodos() throws SQLException {
        Connection conn = Conexion_MySQL.conectar();
        String sql = "SELECT U.id_usuario, D.Nombre_departamento as Nombre, U.Contraseña, U.Tipo_usuario as Tipo " +
                     "FROM Usuarios U INNER JOIN Departamento D ON U.id_departamento = D.id_departamento";
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }

    //----------------------------------------------------------------------------------------------------------------------------------
   
   public boolean eliminarUsuario(int idUsuario) {
        try (Connection conn = Conexion_MySQL.conectar()) {
            String sql = "DELETE FROM Usuarios WHERE id_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }
   
   //----------------------------------------------------------------------------------------------------------------------------------
   
   public boolean InsertArticulo(String nombre, int cantidad){
       String insertSQL = "INSERT INTO Articulos(Nombre_articulo, cantidad_articulo) VALUES(?,?)";
       try{
           PreparedStatement ps = conexion.prepareStatement(insertSQL);
           ps.setString(1, nombre);
           ps.setInt(2, cantidad);
           return ps.executeUpdate()>0;
       }
       catch(SQLException e){
           System.out.print("Error al crear el articulo "+e.getMessage());
           return false;
       }
   }
   
   public boolean ActualizarPorID(String nombre, int cantidad, int id){
       String updateSQL = "UPDATE Articulos SET Nombre_articulo = ?, cantidad_articulo = ? WHERE id_articulo = ?";
       try{
           PreparedStatement ps = conexion.prepareStatement(updateSQL);
           ps.setString(1, nombre);
           ps.setInt(2, cantidad);
           ps.setInt(3, id);
           return ps.executeUpdate()>0;
       }
       catch(SQLException e){
           System.out.print("Error al actualizar el articulo "+e.getMessage());
           return false;
       }
   }
   
   public ResultSet buscarPorIDArticulo(int id){ //SELECT dentro de MySQL Workbench
        String sqlBuscar = "SELECT * FROM Articulos WHERE id_articulo = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar); //Aginación de la sentencia y parámetros para su ejecución
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.print("Error al buscar por ID"+e.getMessage());
            return null;
        }
    }
   
    public ResultSet obtenerTodosArticulo(){
        String sqlBuscarTodo = "SELECT * FROM Articulos";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscarTodo);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.print("Error al buscar todos los artículos "+e.getMessage());
            return null;
        }
    }
    
    public boolean EliminarPorIDArticulo(int id){
        String deleteSQL = "DELETE FROM Articulos WHERE id_articulo = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(deleteSQL);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.print("Error al eliminar el articulo "+e.getMessage());
            return false;
        }
    }
}
