
package cap07;

/**
 *
 * @author tiago
 */
public class UsaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setRg("26.654.678-x");
        funcionario.setCartao("RH845");
        
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
        
    }
    
}
