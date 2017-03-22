
package cap05;

/**
 *
 * @author tiago
 */
public class ArrayCores {
    
    public static void main(String[] args) {
        
        int[][] pixels = new int[40][40];
        
        for (int linha = 0; linha < 40; linha++) {
            
            for (int coluna = 0; coluna < 40; coluna++) {
                
                int valor = (int)(Math.random() * 255);
                pixels[linha][coluna] = valor;
                System.out.println(pixels[linha][coluna]);
                
            }
            
        }
        
        
    }
    
}
