
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ArredondamentoParaBaixo {
    
    public static void main(String[] args) {
        
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova?"));
        JOptionPane.showMessageDialog(null, "Nota original: " + nota
                + "\nArredondada para baixo: " + Math.floor(nota));
        System.exit(0);
        
    }
    
}
