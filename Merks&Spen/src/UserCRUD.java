import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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
}
