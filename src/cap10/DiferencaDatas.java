
package cap10;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class DiferencaDatas {
    
    public static void main(String[] args) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        
        LocalDate dataInicial = LocalDate.of(2014, Month.NOVEMBER, 11);
        LocalDate dataFinal = LocalDate.of(2015, Month.JANUARY, 1);
        Period periodo = Period.between(dataInicial, dataFinal);
        JOptionPane.showMessageDialog(null, "Data inicial: " + dtf.format(dataInicial) + 
                "\nData Final: " + dtf.format(dataFinal) + 
                "\nEntre as datas fornecidas existem " + periodo.getYears() + " ano(s), " +
                periodo.getMonths() + " mes(es) e " + periodo.getDays() + "dia(s)");
        
    }
    
}
