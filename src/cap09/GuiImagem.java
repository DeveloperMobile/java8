
package cap09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Login
 */
public class GuiImagem extends JFrame {
    
    private JButton btnImagem;
    private JLabel imagem;
    
     public static void main(String[] args) {
        
        JFrame frame = new GuiImagem();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
     public GuiImagem() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        
        
        setTitle("Evento da caixa de texto");
        setSize(300, 200);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, 
                (tela.height - this.getSize().height) / 2);
        setLayout(new BorderLayout());
        btnImagem = new JButton("Passe o Mouse");
        imagem = new JLabel(new ImageIcon("img/foto1.png"));
        imagem.setVisible(false);
        add(btnImagem, BorderLayout.NORTH);
        add(imagem, BorderLayout.CENTER);
    }
    
    private void definirEventos() {
        
        btnImagem.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                imagem.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imagem.setVisible(false);
            }
            
        });
        
    }
    
}
