
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class PedacoesDaFrase {
    
    public static void main(String[] args) {
        
        try {
            
            String frase = JOptionPane.showInputDialog("Forneça uma frase");
            JOptionPane.showMessageDialog(null, "Frase " + frase 
                    + "\n(0,2): " + frase.substring(0, 2) 
                    + "\n(3,8): " + frase.substring(3, 8) 
                    + "\n(9,11): " + frase.substring(9, 11) 
                    + "\n(12,14): " + frase.substring(12, 14));
            
        } catch (StringIndexOutOfBoundsException erro) {
            
            JOptionPane.showMessageDialog(null, "A frase deve ter pelomenos 15 caracteres \n" + erro.toString());
            
        }
        
        System.exit(0);
        
    }
    
}
