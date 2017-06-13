
package cap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class ConsultaFilmes {
    
    public static void main(String[] args) {
        
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        
        try {
            
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "");
            String sql = "SELECT codigo, titulo FROM Filmes WHERE codigo > ? AND codigo < ? ORDER BY codigo";
            PreparedStatement statement = connection.prepareStatement(sql);
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
            connection.close();
            
        } catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" + ex.toString());
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados!\n" + ex.toString());
            
        }
        
    }
    
}
