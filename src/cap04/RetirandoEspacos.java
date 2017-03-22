
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class RetirandoEspacos {
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        frase = "     " + frase + "     ";
        JOptionPane.showMessageDialog(null, 
                "\nCom espaços: " + "-" + frase + "-" 
                + "\nSem espaços: " + "-" + frase.trim() + "-" );
        System.exit(0);
    }
    
}
