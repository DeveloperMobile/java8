
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Menu {
    
    public static void main(String[] args) {
        
        int item = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite uma opção:\n" 
                + "1 - Exercício 1\n"
                + "2 - Exercício 2\n"
                + "3 - Exercício 3\n"
                + "4 - Exercício 4"));
        
        switch (item) {
            case 1: Desconto.main(null); break;
            case 2: Resistencia.main(null); break;
            case 3: Login.main(null); break;
            case 4: Tabuada.main(null); break;
        }
        
        System.exit(0);
        
    }
    
}
