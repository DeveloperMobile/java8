
package cap02;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ITBI {

    public static void main(String[] args) {
        
        String aux;
        float valorTransacao, valorVenal, percentual, valorImposto, maiorValor;
        
        try {
            
            aux = JOptionPane.showInputDialog("Entre com o valor da transação");
            valorTransacao = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o valor venal");
            valorVenal = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o percentual de imposto");
            percentual = Float.parseFloat(aux);
            
            if (valorTransacao > valorVenal) {
                
                maiorValor = valorTransacao;
                
            } else {
                
                maiorValor = valorVenal;
                
            }
            valorImposto = maiorValor * (percentual / 100);
           
            JOptionPane.showMessageDialog(null, "Valor do imposto a ser pago: " + valorImposto);
                
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas dados numéricos " + e.getMessage());
            
        }
        
        System.exit(0);
        
    }
    
}
