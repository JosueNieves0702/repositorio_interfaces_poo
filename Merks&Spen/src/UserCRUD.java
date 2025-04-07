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
    
    public ResultSet buscarporid(int id){
        String sqlBuscar= "SELECT * FROM Articulos WHERE id_articulo=?";//?--> parámetro pendiente
        
        
        //Si hay error no se romperá y capturará los errores
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();//devuelve un ResultSet
            
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute la consulta
            System.out.println("Error al buscar por id"+e.getMessage());//Las excepciones son para observar donde está el error
            return null;
        }
            
        
        
    }//Fin del Método para Consultar por id
    
    
    
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
            
            ps.setString(1, nomarticulo);//En Java está como "nomarticulo y en la BD está "Nombre_articulo"
            ps.setString(2, numstock);//En Java está como "numstock y en la BD está "cantidad_articulo"
            return ps.executeUpdate()>0;
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al crear el artículo"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
    
    }//Fin de la CREACIÓN del artículo
    
   
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
        
    }//Fin de la ELIMINACIÓN del artículo
    
    
    public boolean modificarnombrearticulo(String nombre_articulo, String id_articulo){
        
        String insertSQL="UPDATE Articulos SET Nombre_articulo=? WHERE id_articulo=?";
        //String insertSQL="UPDATE Articulos SET nombre=? WHERE id_usuario=?";
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nombre_articulo);
            ps.setString(2, id_articulo);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al modificar el nombre del artículo"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN del nombre del artículo
    
    
     public boolean modificarcantidadarticulo(String cantidad_articulo, String id_articulo){
        
        String insertSQL="UPDATE Articulos SET cantidad_articulo=? WHERE id_articulo=?";
        //String insertSQL="UPDATE Articulos SET nombre=? WHERE id_usuario=?";
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, cantidad_articulo);
            ps.setString(2, id_articulo);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al modificar la cantidad del artículo"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN de la cantidad del artículo
    
  
    
    
    
}//Fin clase UserCRUD
