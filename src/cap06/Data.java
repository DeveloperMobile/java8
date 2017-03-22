
package cap06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Data {
    
    public static DateFormat df = null;
    
    public static String getDia(String data) {
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            df.parse(data);
            return data.substring(0, 2);
            
        } catch (ParseException e) {
            
            JOptionPane.showMessageDialog(null, "Data inválida!");
            
        }
        
        return null;
            
    }
    
    public static String getMes(String data) {
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            df.parse(data);
            return data.substring(3, 5);
            
        } catch (ParseException e) {
            
            JOptionPane.showMessageDialog(null, "Data inválida!");
            
        }
        
        return null;
            
    }
    
    public static String getAno(String data) {
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            df.parse(data);
            return data.substring(6, 10);
            
        } catch (ParseException e) {
            
            JOptionPane.showMessageDialog(null, "Data inválida!");
            
        }
        
        return null;
            
    }
    
}
