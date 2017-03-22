
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class BuscaLetraNaFrase {
    
    public static void main(String[] args) {
        
        String frase = "Livro Java 8 - Ensino didático";
        char caractere = 'a';
        JOptionPane.showMessageDialog(null, "Frase: " + frase 
                + "\nÍndices: " + frase.indexOf(caractere) 
                + ", " + frase.indexOf(caractere, 10) 
                + ", " + frase.indexOf("Ensino") 
                + ", " + frase.indexOf("Java", 15));
        System.exit(0); 
        
    }
    
}
