
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
public class SomaArquivo {
    
    public static void main(String[] args) {
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("c:/votos/enquete.txt"));
            String n1 = br.readLine();
            String n2 = br.readLine();
            int soma1 = Integer.parseInt(n1);
            int soma2 = Integer.parseInt(n2);
            
            JOptionPane.showMessageDialog(null, "Total: " + (soma1 + soma2) + " voto(s)");
            
        } catch (FileNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado \n" + ex.getMessage());
       
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro \n" + ex.getMessage());
            
        }
        
    }
    
}
