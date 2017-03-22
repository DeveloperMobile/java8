package cap06;

import java.util.Arrays;

/**
 *
 * @author tiago
 */
public class MetodosComArray {
    
    /**
     Recebe um array de números e retorna o maior deles, deve conter
     pelo menos um elemento no array se não gera erro.
     
     @param numeros = os números a serem comparados
     @return = o maior valor 
     */
    public static double buscarMaior(double[] numeros) {
        
        double maior = numeros[0];
        
        for (int i = 0; i < numeros.length; i++) {
            
            maior = Math.max(maior, numeros[i]);
            
        }
        
        return maior;
        
    }
    
    /**
     recebe um array de palabras e retorna em orde crescente
     
     @param palavras = as palavras a serem ordenadas
     @return = o array ordenado 
     */
    public static String[] ordenarPalavras(String[] palavras) {
        
        Arrays.sort(palavras);
        return palavras;
        
    }
    
}
