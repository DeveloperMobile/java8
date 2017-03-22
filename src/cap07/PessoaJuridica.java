
package cap07;

/**
 *
 * @author tiago
 */
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public String getCnpj() {
    
        return cnpj;
    
    }

    public void setCnpj(String cnpj) {
    
        this.cnpj = cnpj;
    
    }

    @Override
    public void mostrarClasse() {
    
        System.out.println("Classe PessoaJuridica");
    
    }
    
}
