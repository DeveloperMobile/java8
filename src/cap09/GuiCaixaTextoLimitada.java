
package cap09;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiCaixaTextoLimitada extends JFrame {
    
    private JLabel lbDigite;
    private JTextField tfDigite;
    
    public static void main(String[] args) {
        
        JFrame frame = new GuiCaixaTextoLimitada();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public GuiCaixaTextoLimitada() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        
        
        setTitle("Evento da caixa de texto");
        setSize(250, 100);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, 
                (tela.height - this.getSize().height) / 2);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        lbDigite = new JLabel("Digite algo: ");
        tfDigite = new JTextField(10);
        add(lbDigite);
        add(tfDigite);
        
    }
    
    private void definirEventos() {
        
        tfDigite.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                
                int tamanho = tfDigite.getText().length();
                if (tamanho < 10) {
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite apenas 10 carcteres!");
                }
             
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
            
        });
        
    }
    
}
