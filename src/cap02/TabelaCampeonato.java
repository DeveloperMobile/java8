
package cap02;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class TabelaCampeonato {

    public static void main(String[] args) {
        
        float lider, lanterna;
        int jogos;
        Scanner sc;
        
        try {
            
            System.out.println("Entre com os pontos do primeiro colodado");
            sc = new Scanner(System.in);
            lider = sc.nextFloat();
            
            System.out.println("Entre com os pontos do lanterna");
            sc = new Scanner(System.in);
            lanterna = sc.nextFloat();
            
            jogos = (int) (lider - lanterna) / 3;
            System.out.println("Número de jogos para alcançar ou ultrapassar o líder: " + jogos);
                
        } catch (NumberFormatException e) {
            
            System.out.println("Houve erro na conversão, digite apenas dados numéricos " + e.getMessage());
            
        }
        
    }
    
}
