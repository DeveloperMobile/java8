
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class InstrucaoThrows {
    
    public static void main(String[] args) {
        
        try {
            
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            
            if (idade < 18) {
                
                throw new Exception("Menor de Idade, entrada não permitida!!");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!");
                
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, erro.toString());
            
        }
        
    }
    
}
