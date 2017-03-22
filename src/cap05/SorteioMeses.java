
package cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class SorteioMeses {
    
    public static void main(String[] args) {
        
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                  "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro" };
        
        int mes = (int)(Math.random() * 11);
        
        switch (mes) {
            case 0: JOptionPane.showMessageDialog(null, meses[0]); break;
            case 1: JOptionPane.showMessageDialog(null, meses[1]); break;
            case 2: JOptionPane.showMessageDialog(null, meses[2]); break;
            case 3: JOptionPane.showMessageDialog(null, meses[3]); break;
            case 4: JOptionPane.showMessageDialog(null, meses[4]); break;
            case 5: JOptionPane.showMessageDialog(null, meses[5]); break;
            case 6: JOptionPane.showMessageDialog(null, meses[6]); break;
            case 7: JOptionPane.showMessageDialog(null, meses[7]); break;
            case 8: JOptionPane.showMessageDialog(null, meses[8]); break;
            case 9: JOptionPane.showMessageDialog(null, meses[9]); break;
            case 10: JOptionPane.showMessageDialog(null, meses[10]); break;
            case 11: JOptionPane.showMessageDialog(null, meses[11]); break;
            case 12: JOptionPane.showMessageDialog(null, meses[12]); break;
        }
        
    }
    
}
