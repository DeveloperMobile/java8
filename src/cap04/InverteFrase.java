
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class InverteFrase {
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Informe a frase");
        String fraseInvertida = "";
        
        for (int i = frase.length() - 1;  i >= 0; i--) {
            
            char c = frase.charAt(i);
            fraseInvertida += c;
            
        }
        
        JOptionPane.showMessageDialog(null, "Frase fornecida: " + frase 
                + "\nFrase de trás pra frente: " + fraseInvertida);
        
        System.exit(0);
        
    }
    
}
