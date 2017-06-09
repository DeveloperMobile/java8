
package cap11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class VerificaArquivo {
    
    public static void main(String[] args) {
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("c:/votos/enquete.txt"));
            String texto = br.readLine();
            if (texto.equals("game") || texto.equals("games") || texto.equals("jogo") || texto.equals("jogos")) {
                
                JOptionPane.showMessageDialog(null, "Esse arquivo provavelmente fala sobre jogos");
                
            } else {
             
                JOptionPane.showMessageDialog(null, "Nenhuma palavra encontrada no arquivo");
                
            }
             
        } catch (FileNotFoundException ex) {
        
            JOptionPane.showMessageDialog(null, ex.getMessage());
        
        } catch (IOException ex) {
            
             JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
    }
    
}
