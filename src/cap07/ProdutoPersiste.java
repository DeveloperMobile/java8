
package cap07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tiago
 */
public class ProdutoPersiste extends Produto {
    
    public String gravar() {
        
        String ret = "Produto armazenado com sucesso";
        
        try {
            
            FileOutputStream file = new FileOutputStream("/home/tiago/Documentos/Produto" + this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            
        } catch (Exception erro) {
            
            ret = "Falha na gravação\n " + erro.toString();
            
        }
        
        return ret;
        
    }
    
    public static Produto ler(int codigo) {
        
        try {
 
            FileInputStream file = new FileInputStream("/home/tiago/Documentos/Produto" + codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto) stream.readObject());
            
        } catch (Exception erro) {
            
            System.out.println("Falha na leitura\n " + erro.toString());
            return null;
            
        }
        
    }
    
}
