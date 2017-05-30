
package cap10;

import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class TempoEspera {
    
    public static void main(String[] args) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        Instant inicio = Instant.now();
        
        for (int i = 0; i < 20; i++) {
            
            System.out.println(i+1);
            
            try {
            
                Thread.sleep(1000);
            
            } catch (InterruptedException ex) {}
            
        }
        
        Instant fim = Instant.now();
        
        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilis = duracao.toMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(duracaoEmMilis);
        
        JOptionPane.showMessageDialog(null, "Chegada: " + inicio +
                "\nSaida: " + fim +
                "\nTempo de espera = " + calendar.get(Calendar.MINUTE) + " min e " + calendar.get(Calendar.SECOND) + " seg");
        
    }
    
}
