
package cap09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Login
 */
public class GuiMudarCorBotao extends JFrame {
    
    private JButton btnMudarCor;
    
    public static void main(String[] args) {
        
        JFrame frame = new GuiMudarCorBotao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
     public GuiMudarCorBotao() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        
        
        setTitle("Evento da caixa de texto");
        setSize(250, 100);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, 
                (tela.height - this.getSize().height) / 2);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btnMudarCor = new JButton("Mudar Cor");
        btnMudarCor.setBackground(Color.yellow);
        add(btnMudarCor);
    }
    
    private void definirEventos() {
        
        btnMudarCor.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                btnMudarCor.setBackground(Color.orange);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnMudarCor.setBackground(Color.yellow);
            }
            
        });
        
    }
    
}
