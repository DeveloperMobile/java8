package cap07;

/**
 *
 * @author tiago
 */
public class Funcionario extends PessoaFisica {
    
    private String cartao;

    public String getCartao() {
    
        return cartao;
    
    }

    public void setCartao(String cartao) {
    
        this.cartao = cartao;
    
    }

    @Override
    public void mostrarClasse() {
    
        System.out.println("Classe Funcionário");
    
    }
    
}
