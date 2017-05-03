
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tiago
 */
public class GuiBotao extends JPanel {
    
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;
    
    public GuiBotao() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        /* Image Icon */     
        imageIcon1 = new ImageIcon("img/java.png");
        /* Buttons */
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50, 20, 140, 38);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btMensagem);
        add(btTeimoso);
        
    }
    
    private void definirEventos() {
        
        btMensagem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
            
                JOptionPane.showMessageDialog(null, "Botão Mensagem");
                
            }
            
        });
        
        btTeimoso.addActionListener(new ActionListener() {
           
            
            @Override
            public void actionPerformed(ActionEvent ae) {
            
                JOptionPane.showMessageDialog(null, "Botão Teimoso!");
                
            }
            
        });
        
        btTeimoso.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}

            @Override
            public void mouseEntered(MouseEvent me) {
            
                btTeimoso.setBounds(50, 120, 100, 25);
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
                btTeimoso.setBounds(50, 70, 100, 25);
            
            }
            
        });
        
    }
    
}
