
package cap10;

import cap06.Data;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class CompraParcelada {
    
    public static void main(String[] args) {
        
         final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;
         Date agora = new Date();
        
        long tempo = agora.getTime();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.MEDIUM); 
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra!"));
        int parcela = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de parcelas"));
        double valorParcelado = valor / parcela;
        if (parcela == 3) {
            
             Date parcela1 = new Date(agora.getTime() + (MILI_SEGUNDOS_POR_DIA * 30));
             Date parcela2 = new Date(parcela1.getTime() + (MILI_SEGUNDOS_POR_DIA * 30));
             Date parcela3 = new Date(parcela2.getTime() + (MILI_SEGUNDOS_POR_DIA * 30));
             
             JOptionPane.showMessageDialog(null, "1ª Parcela: " + formato.format(parcela1) + " - " + valorParcelado + 
                     "\n2ª Parcela: " + formato.format(parcela2) + " - " + valorParcelado +
                     "\n3ª Parcela: " + formato.format(parcela3) + " - " + valorParcelado);
            
        }
        
    }
    
}
