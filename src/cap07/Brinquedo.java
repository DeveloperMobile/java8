
package cap07;

/**
 *
 * @author tiago
 */
public class Brinquedo {
    
    private String nome;
    private String faixaEtaria;
    private float preco;
    
    public Brinquedo() {
        
    }
    
    public Brinquedo(String nome) {
        
        this.nome = nome;
        
    }
    
    public Brinquedo(String nome, float preco) {
        
        this.nome = nome;
        this.preco = preco;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        switch(faixaEtaria) {
            case "0 a 2": this.faixaEtaria = faixaEtaria; break;
            case "3 a 5": this.faixaEtaria = faixaEtaria; break;
            case "6 a 10": this.faixaEtaria = faixaEtaria; break;
            case "acima de 10": this.faixaEtaria = faixaEtaria; break;
            default: System.out.println("Faixa Etária inválida");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
