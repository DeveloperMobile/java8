
package cap10;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class DiferencaFuso {
    
    public static void main(String[] args) {
        
        ZoneId fusoTK = ZoneId.of("Asia/Tokyo");
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime agoraTokio = ZonedDateTime.now(fusoTK);
        ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
        JOptionPane.showMessageDialog(null, "Tokyo: " + agoraTokio.getHour() + "h" +
                "\nSão Paulo: " + agoraSP.getHour() + "h" +
                "\nDiferença: " + (agoraTokio.getHour() - agoraSP.getHour()) + "h");
        
    }
    
}
