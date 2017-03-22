
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class LanceDeDados {
    
    public static void main(String[] args) {
        
        int lance1 = (int)(Math.random() * 6) + 1; 
        int lance2 = (int)(Math.random() * 6) + 1; 
        int lance3 = (int)(Math.random() * 6) + 1; 
        int total = lance1 + lance2 + lance3;
        
        JOptionPane.showMessageDialog(null, "Números sorteados: " 
                + "\n" + lance1 
                + "\n" + lance2 
                + "\n" + lance3 
                + "\nTotal: " + total);
       
        
    }
    
}
