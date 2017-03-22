
package cap07;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class UsaProduto {
    
    public static void main(String[] args) {
        
        // teste de gravação
        ProdutoPersiste produto = new ProdutoPersiste();
        produto.setCodigo(2);
        produto.setDescricao("Sabonete");
        JOptionPane.showMessageDialog(null, produto.gravar());
        // teste de leitura
        Produto p = ProdutoPersiste.ler(2);
        JOptionPane.showMessageDialog(null, "Código: " + p.getCodigo() 
                + "\nDescrição: " + p.getDescricao());
        
    }
    
}
