
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Acrescimo {
    
    public static void main(String[] args) {
        
        
        
        try {
         
            while (true) {
            
               
               double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
               
               if (valor == 0) {
                   
                   break;
                   
               }
                   
               double percentual = valor * 0.12;
               double valorComAcrescimo = valor + percentual;
               JOptionPane.showMessageDialog(null, "O valor com acréscimo é R$ " + valorComAcrescimo 
                       + "\nValor arredondado R$ " + Math.round(valorComAcrescimo));
               
            }
            
        } catch (NumberFormatException erro) {
            
            JOptionPane.showMessageDialog(null, "Informe apenas caracters numéricos!");
            
        }
        
    }
    
}
