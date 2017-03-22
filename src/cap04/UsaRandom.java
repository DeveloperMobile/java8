
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class UsaRandom {
    
    public static void main(String[] args) {
        
        String senha = "";
        
        for (int i = 1; i <= 10; i++) {
            
            int num = (int)(Math.random() * 100);
            senha += num;
            
        }
        
        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);
        
        for (int cartao = 1; cartao <= 4; cartao++) {
            
            String numerosCartao = "";
            
            for (int numCartao = 1; numCartao <= 6; numCartao++) {
                
                int num = (int)(Math.random() * 100);
                numerosCartao += num + "  ";
                
            }
                
            JOptionPane.showMessageDialog(null, "Números do cartão: " + cartao 
                    + "\n" + numerosCartao);
        }
        
    }
    
}
