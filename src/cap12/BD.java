
package cap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Login
 */
public class BD {
    
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DBNAME = "banco";
    private final String URL = "jdbc:mysql://192.168.0.49:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "developer";
    
    /**
     * Método que faz a conexão com o banco de dados retorna true se houve
     * sucesso, ou false em caso negativo */
    public boolean getConnection() {
        
        try {
            
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, "root", "developer");
            System.out.println("Conectou");
            return true;
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Driver não encontrado!\n" + ex.toString());
        
        } catch (SQLException ex) {
            
            System.out.println("Problemas na conexão com a fonte de dados!\n" + ex.toString());
            
        }
        
        return false;
        
    }
    
    public void close() {
        
        try {
            
            connection.close();
            System.out.println("Desconectou");
            
        } catch (SQLException ex) {}
        
    }    
    
}
