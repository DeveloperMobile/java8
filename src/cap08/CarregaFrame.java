
package cap08;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Login
 */
public class CarregaFrame extends JFrame {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("VENDAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiVendas());
        frame.setBounds(0, 0, 500, 300);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                 (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
}
