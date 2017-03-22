
package cap03;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class UsoDoThrows {
    
    public static void main(String[] args) throws IOException {
        
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        try {
            
            FileWriter file = new FileWriter("/home/tiago/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
            
        } catch (FileNotFoundException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta /home/tiago/temp existe!");
            
        }
        
        
    }
    
}
