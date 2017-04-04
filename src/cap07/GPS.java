
package cap07;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class GPS {
    
    private String idioma;
    private String rota;
    
    public GPS() {
        
    }
    
    public GPS(String idioma, String rota) {
        
        this.idioma = idioma;
        this.rota = rota;
        
    }
    
    public void mostrar() {
        
        JOptionPane.showMessageDialog(null, "Idioma: " + idioma 
                + "\nRota: " + rota);
        
    }
    
}
