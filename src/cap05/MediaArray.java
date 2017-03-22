
package cap05;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class MediaArray {
    
    public static void main(String[] args) {
        
        float[] notas = new float[5];
        float media = 0, notaSoma = 0;

        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1ª nota"));
        notas[0] = nota1;
        
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2ª nota"));
        notas[1] = nota2;
        
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 3ª nota"));
        notas[2] = nota3;
        
        float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 4ª nota"));
        notas[3] = nota4;
        
        float nota5 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 5ª nota"));
        notas[4] = nota5;
            
            
        Arrays.sort(notas);
        
        for (int i = 0; i < notas.length; i++) {
            
            notaSoma += notas[i];
            
        }
        
        media = notaSoma / 5;
        
        JOptionPane.showMessageDialog(null, "Nota 1: " + notas[0] 
                + "\nNota 2: " + notas[1] 
                + "\nNota 3: " + notas[2] 
                + "\nNota 4: " + notas[3] 
                + "\nNota 5: " + notas[4] 
                + "\nMédia: " + media);
        
        System.exit(0);
        
    }
    
}
