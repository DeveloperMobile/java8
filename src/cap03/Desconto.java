/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Desconto {
    
    public static void main(String[] args) {
        
        try {
            
            String produto = (String) JOptionPane.showInputDialog("Informe nome do produto");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
            double valorComDesconto = 0;
             
            if (valor < 0) {
                
                JOptionPane.showMessageDialog(null, "Informe um valor maior que 0");
                System.exit(0);
                
            }
                
            
            if (valor >= 50 && valor < 200) {
                
                valorComDesconto = valor - (valor * 0.05);
                
            } else if (valor >= 200 && valor < 500) {
                
                valorComDesconto = valor - (valor * 0.06);
                
            } else if (valor >= 500 && valor < 1000) {
                
                valorComDesconto = valor - (valor * 0.07);
                
            } else if (valor >= 1000) {
                
                valorComDesconto = valor - (valor * 0.08);
                
            } 
            
            JOptionPane.showMessageDialog(null, "Nome do produto: " + produto + 
                    "\nValor original do produto: " + valor +
                    "\nValor do produto com esconto: " + valorComDesconto);
            
        } catch (NumberFormatException erro) {
            
            JOptionPane.showMessageDialog(null, "Não foi fornecido um valor válido!\n" + erro.getMessage());
            
        }
        
    }
    
}
