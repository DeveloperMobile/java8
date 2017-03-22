package cap06;

/**
 *
 * @author tiago
 */
public class UsaMetodosComArray {
    
    public static void main(String[] args) {
        
        double[] numeros = { 12.4, 3.4, 9, 7.3, 6.6 };
        double maior = MetodosComArray.buscarMaior(numeros);
        System.out.println(maior);
    
        String[] nomes = { "Ivone", "Carlos", "Lila", "Alzira", 
            "Bruno", "Fabio", "Rita" };
        String[] retorno = MetodosComArray.ordenarPalavras(nomes);
        for (int i = 0; i < retorno.length; i++) {
            
            System.out.println(retorno[i]);
            
        }
        
    }
    
}
