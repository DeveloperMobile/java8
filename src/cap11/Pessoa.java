
package cap11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Login
 */
public class Pessoa {
    
    public String codigo, nome, email;
    
    public Pessoa ler(String path) {
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(
                    path + "/" + codigo + ".txt"));
            codigo = br.readLine();
            nome = br.readLine();
            email = br.readLine();
            br.close();
            return this;
            
        } catch (IOException e) {
         
            return null;
            
        }
        
    }
        
   public String gravar(String path) {
       
       try {
           
           File dir = new File(path);
           
           if (!dir.exists()) {
               
               dir.mkdir();
               
           }
           
           PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
           pw.println(codigo);
           pw.println(nome);
           pw.println(email);
           pw.flush();
           pw.close();
           return "Arquivo gravado com sucesso!";
           
       } catch (IOException e) {
           
           return "Falha ao gravar o arquivo: " + e.toString();
           
       }
       
   }
    
}
