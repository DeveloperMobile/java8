
package cap08;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Login
 */
public class GuiAbas extends JPanel {
    
    private JTabbedPane tpAbas;
    private JButton[] botoes = new JButton[15];
    
    public GuiAbas() {
        
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        for (int i = 0; i < 15; i++) {
            
            botoes[i] = new JButton("Botão " + (i + 1));
            
        }
        /* Panel 1 */
        JPanel panel1 = new JPanel(new GridLayout(5, 1));
        
        for (int i = 0; i < 5; i++) {
            
            panel1.add(botoes[i]);
            
        }
        /* Panel 2 */
        JPanel panel2 = new JPanel(new FlowLayout());
        
        for (int i = 5; i < 10; i++) {
            
            panel2.add(botoes[i]);
            
        }
        /* Panel 3 */
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(botoes[10], BorderLayout.NORTH);
        panel3.add(botoes[11], BorderLayout.WEST);
        panel3.add(botoes[12], BorderLayout.CENTER);
        panel3.add(botoes[13], BorderLayout.EAST);
        panel3.add(botoes[14], BorderLayout.SOUTH);
        /* Abas */
        tpAbas = new JTabbedPane();
        tpAbas.add("Gridlyout", panel1);
        tpAbas.add("FlowLayout", panel2);
        tpAbas.add("BorderLayout", panel3);
        tpAbas.setBounds(0, 0, 300, 200);
        add(tpAbas);
        
    }
    
}
