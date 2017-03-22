
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class GeradorSenha {
    
    public static void main(String[] args) {
        
        String senha = "";
        
        while (true) {
        
            int sorteio = (int)(Math.random() * 10) + 1;
            
            if (sorteio >=5 && sorteio <= 10) {
            
               for (int i = 0; i < sorteio; i++) {
                
                   senha += String.valueOf((int)(Math.random() * 9) + 1);
                
               }
            
               JOptionPane.showMessageDialog(null, "Número sorteado: " + sorteio 
                      + "\nSenha gerada: " + senha);
            
               break;
               
            }
            
        }
         
        
    }
    
}
