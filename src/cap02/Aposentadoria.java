
package cap02;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Aposentadoria {

    public static void main(String[] args) {
        
        String aux;
        byte idade, contribuicao;
        String sexo;
            
        aux = JOptionPane.showInputDialog("Informe a idade");
        idade = Byte.parseByte(aux);
            
        aux = JOptionPane.showInputDialog("Informe o tempo de contribuição");
        contribuicao = Byte.parseByte(aux);
            
        aux = JOptionPane.showInputDialog("Informe o sexo(F ou M)");
        sexo = aux;
            
        switch (sexo) {
            case "F":
                if (sexo.equals("F") && idade >= 60 && contribuicao >= 30) {
            
                    JOptionPane.showMessageDialog(null, "Voçê já tem direito a aposentadoria!");
            
                } else {
            
                    JOptionPane.showMessageDialog(null, "Faltam: " + (30 - contribuicao) + " anos de contribuição para se aposentar");
            
                }
                break;
            case "M":
                if (sexo.equals("M") && idade >= 65 && contribuicao >= 35) {
            
                    JOptionPane.showMessageDialog(null, "Voçê já tem direito a aposentadoria!");
            
                } else {
            
                    JOptionPane.showMessageDialog(null, "Faltam: " + (35 - contribuicao) + " anos de contribuição para se aposentar");
            
                }
        }
        
        System.exit(0);
        
    }
    
}
