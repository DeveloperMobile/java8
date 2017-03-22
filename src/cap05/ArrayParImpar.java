
package cap05;

/**
 *
 * @author tiago
 */
public class ArrayParImpar {
    
    public static void main(String[] args) {
        
        int par[] = new int[10];
        int impar[] = new int[10];
    
        for (int i = 0; i < 10; i++) {
            
            int numero = (int)(Math.random() * 20) + 1;
            
            if (numero % 2 == 0) {
                
               par[i] = numero;
                
            } else {
                
                impar[i] = numero;
                
            }
                
            
        }
        
        for (int i = 0; i < par.length; i++) {
            
            System.out.println("Par: " + par[i]);
            
        }
            
        
        for (int i = 0; i < impar.length; i++) {
            
            System.out.println("Impar: " + impar[i]);
            
        }
        
    }
    
}
