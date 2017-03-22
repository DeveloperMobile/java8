
package cap06;

/**
 *
 * @author tiago
 */
public class Senha {
    
    public static String getSenha() {
        
        String senha = "";
        
        for (int i = 0; i < 8; i++) {
            
            int pass = (int) (Math.random() * 8); 
            senha += String.valueOf(pass);
            
        }
        
        return senha;
        
    }
    
}
