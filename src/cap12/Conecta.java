
package cap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class Conecta {
    
    public static void main(String[] args) {
        
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        
        try {
            
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "");
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
            connection.clearWarnings();
            
        } catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" + ex.toString());
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados!\n" + ex.toString());
            
        }
        
    }
    
}
