
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Tabuada {
    
    public static void main(String[] args) {
        
        try {
 
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
            
            JOptionPane.showMessageDialog(null, 
                    numero + "x1=" + (numero * 1) + "\n" +
                    numero + "x2=" + (numero * 2) + "\n" +
                    numero + "x3=" + (numero * 3) + "\n" +
                    numero + "x4=" + (numero * 4) + "\n" +
                    numero + "x5=" + (numero * 5) + "\n" +
                    numero + "x6=" + (numero * 6) + "\n" +
                    numero + "x7=" + (numero * 7) + "\n" +
                    numero + "x8=" + (numero * 8) + "\n" +
                    numero + "x9=" + (numero * 9) + "\n" +
                    numero + "x10=" + (numero * 10));
            
        } catch (NumberFormatException erro) {
            
            JOptionPane.showMessageDialog(null, "Informe apenas caracteres numéricos.\n" + erro.getMessage());
            
        }
        
    }
    
}
