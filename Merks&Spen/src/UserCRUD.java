import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
