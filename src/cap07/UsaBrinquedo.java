package cap07;

/**
 *
 * @author tiago
 */
public class UsaBrinquedo {
    
    public static void main(String[] args) {
        
        Brinquedo brinquedo = new Brinquedo("Quebra-Cabeça", 10l);
        brinquedo.setFaixaEtaria("6 a 10");
        System.out.println("Nome: " + brinquedo.getNome() 
                + "\nFaixa Etária: " + brinquedo.getFaixaEtaria() 
                + "\nPreço: " + brinquedo.getPreco());
        
    }
    
}
