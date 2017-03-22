
package cap02;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Media {

    public static void main(String[] args) {
        
        String aux;
        float nota1, nota2, trabalho, media;
        String status;
        
        try {
            
            aux = JOptionPane.showInputDialog("Entre com o a primeira nota");
            nota1 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o a segunda nota");
            nota2 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o a nota do trabalho");
            trabalho = Float.parseFloat(aux);
            
            media = (nota1 + nota2 + trabalho) / 3;
            
            if (media > 6) {
                
                status = "Aprovado";
                
            } else {
                
                status = "Reprovado";
                
            }
           
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nStatus: " + status);
                
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas dados numéricos " + e.getMessage());
            
        }
        
        System.exit(0);
        
    }
    
}
