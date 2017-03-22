
package cap05;

/**
 *
 * @author tiago
 */
public class ArrayBidimensional {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        matriz[0][0] = 120;   matriz[1][0] = 232; matriz[2][0] = 201;
        matriz[0][1] = 129;   matriz[1][1] = 111; matriz[2][1] = 187;
        matriz[0][2] = 128;   matriz[1][2] = 247; matriz[2][2] = 123;
        
        for (int linha = 0; linha < matriz.length; linha++) {
            
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                
                System.out.println("[" + linha + "," + coluna + "] = " + matriz[linha][coluna]);
                
            }
            
        }
        
    }
    
}
