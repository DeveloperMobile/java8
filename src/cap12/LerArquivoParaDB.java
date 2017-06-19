
package cap12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class LerArquivoParaDB {
    
    static UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public static void main(String[] args) {
        
       if (usuarioDAO.bd.getConnection()) {
       
            File usuarios = new File("c:/votos/usuarios.txt");
            if (usuarios.exists()) {
               try {
                  lerArq(usuarios);
               } catch (IOException ex) {
                  Logger.getLogger(LerArquivoParaDB.class.getName()).log(Level.SEVERE, null, ex);
               }
            } else {
               JOptionPane.showMessageDialog(null, "Erro ao ler arquivo");
            }
           
       } else {
           
           JOptionPane.showMessageDialog(null, "Erro conectar no banco");
           usuarioDAO.bd.close();
           
       }
        
    }
    
    public static void lerArq(File arquivo) throws IOException {
        
        String linha[] = new String[3];
       
        FileReader reader = new FileReader(arquivo);
        BufferedReader leitor = new BufferedReader(reader);

        for(int i = 0; i < linha.length; i++) {  
            //System.out.println(linha[a]);
            linha[i] = leitor.readLine();
         
            System.out.println(linha[i]);
            usuarioDAO.usuario.setCodigo(linha[i].substring(0, 5));
            usuarioDAO.usuario.setNome(linha[i].substring(7, 20));
            usuarioDAO.usuario.setEmail(linha[i].substring(21, 36));
            System.out.println(usuarioDAO.atualizar(UsuarioDAO.INCLUSAO));
        }  
        
        
        
        leitor.close();

    }
    
}
