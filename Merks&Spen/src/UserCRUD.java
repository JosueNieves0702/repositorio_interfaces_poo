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
    
    
    public boolean creararticulo(String nomarticulo, String numstock){
        
        String insertSQL="INSERT INTO Articulos (Nombre_articulo, cantidad_articulo) VALUES (?,?)";
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nomarticulo);
            ps.setString(2, numstock);//En Java está como "numstock y en la BD está "cantidad_articulo"
            return ps.executeUpdate()>0;
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al crear el artículo"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
    
    }//Fin de la creación de artículo
    
    
    
    
    public boolean eliminararticulo(String id_articulo){
        
        String insertSQL="DELETE FROM Articulos WHERE id_articulo=?";//? como parámetro que luego se obtendrá
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, id_articulo);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute la eliminación
            System.out.println("Error al eliminar el registro con ese id"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ELIMINACIÓN de artículo
    
  
    
    
    
}//Fin clase UserCRUD
