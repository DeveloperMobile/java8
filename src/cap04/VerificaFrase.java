
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class VerificaFrase {
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        
        if (frase.indexOf("sexo") != -1 || frase.indexOf("sexual") != -1) {
         
            JOptionPane.showMessageDialog(null, "Conteúdo Impróprio");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Conteúdo Liberado");
            
        }
        
    }
    
}
