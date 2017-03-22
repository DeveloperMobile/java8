
package cap06;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ChamaMetodos {
    
    public static void main(String[] args) {
        
        String nome = EntradaDeDadosComMetodos.lerString("Forneça seu nome");
        int idade = EntradaDeDadosComMetodos.lerNumeroInt(0, 120, "Forneça sua idade");
        float altura = EntradaDeDadosComMetodos.lerNumeroFloat(0, 2.5f, "Forneça sua altura");
        double peso = EntradaDeDadosComMetodos.lerNumeroDouble(0, 300, "Forneça seu pesso");
        char op = EntradaDeDadosComMetodos.selecionarOpcao("Você gosta de Java?");
        JOptionPane.showMessageDialog(null, "Nome: " + nome 
                + "\nIdade: " + idade 
                + "\nAltura: " + altura 
                + "\nPeso: " + peso 
                + "\nOpção selecionada: " + op);
        
    }
    
}
