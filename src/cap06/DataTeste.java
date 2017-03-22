
package cap06;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class DataTeste {
    
    public static final String DATA = "19/02/2017";
    
    public static void main(String[] args) {
        
        
        JOptionPane.showMessageDialog(null, "Dia: " + Data.getDia(DATA) 
                + "\nMês: " + Data.getMes(DATA)
                + "\nAno: " + Data.getAno(DATA)); 
        
    }
    
}
