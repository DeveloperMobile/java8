
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ArredondamentoParaCima {
    
    public static void main(String[] args) {
        
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros"));
        float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        
        JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros
                + "\nQuantidade Calculada: " + qtdeOnibus
                + "\nQuantidade de Ônibus necessária: " + (int)Math.ceil(qtdeOnibus));
        System.exit(0);
        
    }
    
}
