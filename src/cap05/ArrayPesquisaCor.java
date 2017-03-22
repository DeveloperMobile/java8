
package cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ArrayPesquisaCor {
    
    public static void main(String[] args) {
        
        String[] cores = { "verde", "amarelo", "azul", "vermelho", "preto" };
        String cor = JOptionPane.showInputDialog("Forneça uma cor");
        String mensagem = "Cor não encontrada";
        
        for (String elemento : cores) {
            
            if (elemento.equals(cor)) {
                
                mensagem = "Cor encontrada";
                break;
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
        
    }
    
}
    
