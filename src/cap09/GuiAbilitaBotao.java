
package cap09;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiAbilitaBotao extends JFrame {
    
    JButton btMudarCor;
    JTextField tfCaixa1, tfCaixa2, tfCaixa3;
    
    public static void main(String[] args) {
        
        JFrame frame = new GuiAbilitaBotao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
     public GuiAbilitaBotao() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        
        
        setTitle("Evento da caixa de texto");
        setSize(300, 300);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tela.width - this.getSize().width) / 2, 
                (tela.height - this.getSize().height) / 2);
        setLayout(new GridLayout(4, 1));
        tfCaixa1 = new JTextField();
        tfCaixa2 = new JTextField();
        tfCaixa3 = new JTextField();
        btMudarCor = new JButton("Enviar");
        btMudarCor.setEnabled(false);
        add(tfCaixa1);
        add(tfCaixa2);
        add(tfCaixa3);
        add(btMudarCor);
    }
    
    private void definirEventos() {
        
       tfCaixa3.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
               
           }

           @Override
           public void focusLost(FocusEvent e) {
               
               if (!tfCaixa1.getText().equals("") && !tfCaixa2.getText().equals("") 
                       && !tfCaixa3.getText().equals("")) {
                   
                   btMudarCor.setEnabled(true);
                   
               }
               
           }
           
       });
        
    }
    
}
