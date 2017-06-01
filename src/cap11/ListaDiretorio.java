
package cap11;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class ListaDiretorio {
    
    public static void main(String[] args) {
        
        String path = JOptionPane.showInputDialog("Forneça o camionho "
                + "do diretõrio (utilize / entre os diretórios)");
        File dir = new File(path);
        
        if (dir.isDirectory()) {
            
            System.out.println("Conteúdo do diretório " + path);
            String[] s = dir.list();
            
            for (int i = 0; i < s.length; i++) {
                
                System.out.println(s[i]);
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, path + " não é um diretório válido");
            
        }
        
    }
    
}
