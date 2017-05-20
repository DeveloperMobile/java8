
package cap09;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Login
 */
public class GuiPosicaoImagem extends JFrame {
    
     private JButton btnMostrar, btnOcultar;
    private JLabel imagem;
    
     public static void main(String[] args) {
        
        JFrame frame = new GuiPosicaoImagem();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
     public GuiPosicaoImagem() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        
        
        setTitle("Evento da caixa de texto");
        setSize(500, 500);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, 
                (tela.height - this.getSize().height) / 2);
        setLayout(null);
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(5, 5, 100, 25);
        btnOcultar = new JButton("Ocultar");
        btnOcultar.setBounds(115, 5, 100, 25);
        imagem = new JLabel(new ImageIcon("img/foto1.png"));
        //imagem.setBounds(5, 45, 128, 128);
        imagem.setVisible(false);
        add(btnMostrar);
        add(btnOcultar);
        add(imagem);
    }
    
    private void definirEventos() {
        
        btnMostrar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                int x = (int)(Math.random() * 1);
                int y = (int)(Math.random() * 1) ;
                imagem.setBounds(x, y, 128, 128);
                imagem.setVisible(true);
                
            }
            
        });
        
        btnOcultar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                imagem.setVisible(false);
            }
            
        });
        
    }
    
}
