
package cap06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Contagem {
    
    public static void contar() {
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.print(i + " ");
            
            if (i == 10) {
            
                System.out.print("\n");
            
            }
                
        }
        
    }
    
    public static void contar(int fim) {
            
         for (int i = 1; i <= fim; i++) {
                
            System.out.print(i + " ");
            if (i == fim) {
            
                System.out.print("\n");
            
            }
                
        }
            
    }
    
    public static void contar(int inicio, int fim) {
        
        for (int i = inicio; i <= fim; i++) {
            
            System.out.print(i + " ");
            
            if (i == fim) {
            
                System.out.print("\n");
            
            }
            
        }
        
    }
    
    public static void contar(int inicio, int fim, int pausa) {
        
        for (int i = inicio; i <= fim; i++) {
         
            try {
            
                Thread.sleep(pausa * 1000);
                System.out.print(i + " ");
            
            } catch (InterruptedException ex) {
                
                Logger.getLogger(Contagem.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        }
        
    }
    
}
