
package cap10;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class HoraFuncionamento {
    
    private static Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;
    
    public static void main(String[] args) {
        
        agora = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(agora);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        String diaSemana = "";
               
        switch(diaDaSemana) {
            case 1: diaSemana = "Domingo"; break;
            case 2: diaSemana = "Segunda"; break;
            case 3: diaSemana = "Terça"; break;
            case 4: diaSemana = "Quarta"; break;
            case 5: diaSemana = "Quinta"; break;
            case 6: diaSemana = "Sexta"; break;
            case 7: diaSemana = "Sábado"; break;
        }
               
        String men = diaSemana + "-" + hora + "h - Expediente encerrado";
             
        if (hora >= 8 && hora <= 17) {
                   
            men = diaSemana + " - " + hora + "h - Estamos atendendo";
                   
        } 
               
        JOptionPane.showMessageDialog(null, men);
        
    }
    
}
