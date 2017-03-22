
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Login {
    
    public static void main(String[] args) {
        
        int contador = 0;
        
        while (true) {
            
            String login = JOptionPane.showInputDialog("Informe o login");
            String senha = JOptionPane.showInputDialog("Informe a senha");
            
            if (login.equals("tiago") && senha.equals("123456")) {
                
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
                break;
                
            } else {
               
                 contador++;
                
                if (contador == 3) {
                
                   JOptionPane.showMessageDialog(null, "Número de tentativas esgotado.\nTente novamente mais tarde.");
                   break;
                
                } else {
                    
                   JOptionPane.showMessageDialog(null, "Falha, verifique login e senha.\nVocê tem mais " + (3 - contador) + " tentativas");
                    
                }             
               
            }
            
        }
        
        System.exit(0);
        
    }
    
}
