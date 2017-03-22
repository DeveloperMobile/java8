
package cap06;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class EntradaDeDadosComMetodos {
    
    static String aux = "";
    
    public static int lerNumeroInt(int minimo, int maximo, String men) {
        
        int n = 0;
        
        while (true) {
            
            try {
                
                aux = JOptionPane.showInputDialog(men);
                n = Integer.parseInt(aux);
                
                if (n < minimo || n > maximo) {
                    
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida !!");
                    
                } else {
                    
                    break; // encerra o loop infinito
                    
                }
                
            } catch (NumberFormatException erro) {
                
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos !!\n" + erro.toString());
                
            }
            
        }
        
        return (n);
        
    }
 
    public static float lerNumeroFloat(float minimo, float maximo, String men) {
        
        float n = 0;
        
        while (true) {
            
            try {
                
                aux = JOptionPane.showInputDialog(men);
                n = Float.parseFloat(aux);
                
                if (n < minimo || n > maximo) {
                    
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida !!");
                    
                } else {
                    
                    break; // encerra o loop infinito
                    
                }
                
            } catch (NumberFormatException erro) {
                
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos !!\n" + erro.toString());
                
            }
            
        }
        
        return (n);
        
    }
    
    public static double lerNumeroDouble(double minimo, double maximo, String men) {
        
        double n = 0;
        
        while (true) {
            
            try {
                
                aux = JOptionPane.showInputDialog(men);
                n = Double.parseDouble(aux);
                
                if (n < minimo || n > maximo) {
                    
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida !!");
                    
                } else {
                    
                    break; // encerra o loop infinito
                    
                }
                
            } catch (NumberFormatException erro) {
                
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos !!\n" + erro.toString());
                
            }
            
        }
        
        return (n);
        
    }
    
    public static String lerString(String men) {
        
        aux = JOptionPane.showInputDialog(men);
        return (aux);
        
    }
    
    public static char selecionarOpcao(String men) {
        
        Object[] op = { "Sim", "Não" };
        char opcao = 'N';
        String resp = (String) JOptionPane.showInputDialog(null,
                men + "\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE,
                null, op, "Sim");
        
        if (resp == "Sim") {
            
            opcao = 'S';
            
        }
        
        return opcao;
    }
    
}
