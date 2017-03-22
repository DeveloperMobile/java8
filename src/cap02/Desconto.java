package cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Desconto {
    
    public static void main(String[] args) {
        
        String s;
        BufferedReader br;
        float valorProduto, valorDoDesconto, percentualDeDesconto, valorComDesconto;
        
        try {
            
            System.out.println("Informe o valor do produto");
            br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
            valorProduto = Float.parseFloat(s);
            
            System.out.println("Informe o valor do desconto");
            br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
            percentualDeDesconto = Float.parseFloat(s);
            
            valorDoDesconto = valorProduto * (percentualDeDesconto / 100);
            valorComDesconto = valorProduto - valorDoDesconto;
            
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor do produto com desconto: " + valorComDesconto);
            
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "Houve erro na entrada de dados " + e.getMessage());
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas valores numéricos " + e.getMessage());
            
        }
        
    }
    
}
