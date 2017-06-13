
package cap12;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Login
 */
public class ConsultaFilmesComBD {
    
    public static void main(String[] args) {
        
        BD bd = new BD();
        
        if (bd.getConnection()) {
            
            try {
                
               String sql = "SELECT codigo, titulo FROM Filmes WHERE codigo > ? AND codigo < ? ORDER BY codigo";
               PreparedStatement statement = bd.connection.prepareStatement(sql);
               statement.setString(1, "03120");
               statement.setString(2, "03140");
               ResultSet resultSet = statement.executeQuery();
               System.out.println("CÓDIGO    TÍTULO");
               System.out.println("------    ------------------------------------------");
               
               while (resultSet.next()) {
                 String codigo = resultSet.getString("codigo");
                 String titulo = resultSet.getString("titulo");
                 System.out.println(codigo + "     " + titulo);
               }
            
               resultSet.close();
               statement.close();
               bd.close();
               
            } catch (SQLException erro) {
                
                System.out.println(erro.toString());
                
            }
            
        } else {
            
            System.out.println("Erro ao conectar!");
            
        }
        
    }
    
}
