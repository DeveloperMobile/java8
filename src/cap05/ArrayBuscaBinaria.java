
package cap05;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ArrayBuscaBinaria {
    
    public static void main(String[] args) {
        
        int[] n = new int[10000];
        
        for (int i = 0; i < n.length; i++) {
            
            n[i] = (int)(Math.random() * 1000);
            
        }
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        
        String r = "Valor não encontrado";
        
        for (int i = 0; i < n.length; i++) {
            
            if (n[i] == valor) {
                
                r = "Valor encontrado na posição " + i;
                break;
                
            }
            
        }
        
        System.out.println(r);
        
        Arrays.sort(n);
        int pos = Arrays.binarySearch(n, valor);
        System.out.println("Nova posição orenada: " + pos);
        
    }
    
}
