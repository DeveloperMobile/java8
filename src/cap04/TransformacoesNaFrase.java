
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class TransformacoesNaFrase {
    
    public static void main (String[] args) {
        
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        JOptionPane.showMessageDialog(null, "Frase: " + frase 
                + "\nTodas em Maiúsculas: " + frase.toUpperCase()
                + "\nTodas em Minúsculas: " + frase.toLowerCase());
        System.exit(0);
             
    }
    
}
