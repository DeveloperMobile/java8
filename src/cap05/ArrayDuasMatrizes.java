
package cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ArrayDuasMatrizes {
    
    public static void main(String[] args) {
        
        int[][][] cubo = new int[2][3][2];
        // Dados da matriz 1            // Dados da matriz 2
        cubo[0][0][0] = 1;              cubo[0][0][1] = 2;
        cubo[0][1][0] = 3;              cubo[0][1][1] = 4;
        cubo[0][2][0] = 5;              cubo[0][2][1] = 6;
        cubo[1][0][0] = 7;              cubo[1][0][1] = 8;
        cubo[1][1][0] = 9;              cubo[1][1][1] = 10;
        cubo[1][2][0] = 11;             cubo[1][2][1] = 12;
        
        int somaPares = 0, somaImpares = 0;
        
        for (int linha = 0; linha < 2; linha++) {
            
            for (int coluna = 0; coluna < 3; coluna++) {
                
                for (int matriz = 0; matriz < 2; matriz++) {
                    
                    System.out.println(cubo[linha][coluna][matriz]);
                    
                    if (matriz == 1) {
                        
                        somaPares += cubo[linha][coluna][matriz];
                        
                    } else {
                        
                        somaImpares += cubo[linha][coluna][matriz];
                        
                    }
                    
                }
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Soma dos elementos pares: " + somaPares 
                + "\nSoma dos elementos ímpares: " + somaImpares);
        System.exit(0);
        
    }
    
}
