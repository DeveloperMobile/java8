
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class If {
    
    public static void main(String[] args) {
        
        Object[] op = { "Masculino", "Feminino" };
        String resp = (String) JOptionPane.showInputDialog(null, 
                "Selecione o sexo:\n", "Pesquisa", 
                JOptionPane.PLAIN_MESSAGE, 
                null, op, "Masculino");
        
        if (resp == null) {
            
            JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
            
        }
        
        if ("Masculino".equals(resp)) {
            
            JOptionPane.showMessageDialog(null, "Você é homem.");
            
        }
        
        if ("Feminino".equals(resp)) {
            
            JOptionPane.showMessageDialog(null, "Você é mulher.");
            
        }
        
        System.exit(0);
        
    }
    
}
