
package cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Estacionamento {
    
    public static void main(String[] args) {
        
        String[] vagas = new String[10];
        
        while (true) {
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: "
                    + "\n1 - Entrada" 
                    + "\n2 - Saída" 
                    + "\n3 - Listar situação atual" 
                    + "\n4 - Encerrar o programa"));
            
            if (opcao == 1) {
                
                int vaga = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da vaga"));
                String placa = JOptionPane.showInputDialog("Informe a placa do carro");
                vagas[vaga] = placa;
                
            } else if (opcao == 2) {
                
                int vaga = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da vaga"));
                String placa = "";
                vagas[vaga] = placa;
                
            } else if (opcao == 3) {
                
                String status = "";
                
                for (int i = 0; i < vagas.length; i++) {
                    
                    status += vagas[i] + ", ";
                    
                }
                    
                JOptionPane.showMessageDialog(null, status);
                
            } else if (opcao == 4) {
                
                break;
                
            }
            
        }
            
        
    }
    
}
