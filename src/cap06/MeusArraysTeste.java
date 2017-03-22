
package cap06;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class MeusArraysTeste {
   
    public static void main(String[] args) {
        
        int[] lista1 = { 2, 4, 6, 8, 10 };
        int[] lista2 = { 1, 3, 5, 7, 9, 10 };
        
        switch (MeusArrays.getNumero(lista1, lista2, 10)) {
            
            case 1: 
                JOptionPane.showMessageDialog(null, "Número encontrado em um array!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Número encontrado nos dois arrays!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número não encontrado");
            
        }
        
        int[] lista = MeusArrays.getLista(10);
        for (int i = 0; i < lista.length; i++) {
            
            System.out.print(lista[i] + " ");
            
        }
        
    }
    
}
