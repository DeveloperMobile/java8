
package cap07;

import java.io.Serializable;

/**
 *
 * @author tiago
 */
public class Produto implements Serializable, DAO, Estoque {
    
    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void inserir() {
        
    }

    @Override
    public void excluir() {
        
    }

    @Override
    public void localizar() {
        
    }

    @Override
    public void baixar() {
        
    }
    
}
