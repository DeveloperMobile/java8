
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Resistencia {
    
    public static void main(String[] args) {
        
        try {
     
            int total, maior, menor;
            int r1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira resistência"));
            int r2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda resistência"));
            int r3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira resistência"));
            int r4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quarta resistência"));
            
            total = r1 + r2 + r3 + r4;
            menor = r1;
            
            if (r2 < menor) { menor = r2; }
            if (r3 < menor) { menor = r3; }
            if (r4 < menor) { menor = r4; }
            
            maior = r1;
            
            if (r2 > maior) { maior = r2; }
            if (r3 > maior) { maior = r3; }
            if (r4 > maior) { maior = r4; }
            
            JOptionPane.showMessageDialog(null, "Resistências fornecidas:\n" + r1 + ", " + r2 + ", " + r3 + ", " + r4 + 
                    "\nA maior resistência é: " + maior +
                    "\nA menor resistência é: " + menor);
            
        } catch (NumberFormatException erro) {
            
            JOptionPane.showMessageDialog(null, "Informe apenas caracteres numéricos!\n" + erro.getMessage());
            
        }
        
    }
    
}
