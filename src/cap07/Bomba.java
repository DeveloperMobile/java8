
package cap07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Bomba {
    
    private boolean status = false;
    
    public void ligar(long segundos) {
        
        status = true;
        
        for (long i = 0; i < segundos; i++) {
            
            try { Thread.sleep(segundos * 1000); } catch (InterruptedException ex) {}
            
            System.out.println("Faltam " + (segundos - i) + " segundos.");
            
        }
        
        desligar();
        
    }
    
    public void desligar() {
        
        status = false;
        
    }
    
}
