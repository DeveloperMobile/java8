
package cap07;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class PessoaPolimorfa {
    
    @SuppressWarnings("null")
    public static void main(String[] args) {
        

        Pessoa pessoa = null;
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número de 1 a 4"));
        
        switch (tipo) {
            case 1: pessoa = new Pessoa(); break;
            case 2: pessoa = new PessoaFisica(); break;
            case 3: pessoa = new PessoaJuridica(); break;
            case 4: pessoa = new Funcionario(); break;
            default:{
                JOptionPane.showMessageDialog(null, "Tipo desconhecido");
                System.exit(0);
            }
        }
        
        pessoa.mostrarClasse();
        
    }
    
}
