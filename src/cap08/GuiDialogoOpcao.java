
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiDialogoOpcao extends JPanel {
    
    private JButton btAbrir;
    private JLabel lbResposta;
    
    public GuiDialogoOpcao() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        lbResposta = new JLabel("");
        btAbrir = new JButton("Abrir");
        btAbrir.setBounds(25, 30, 100, 25);
        lbResposta.setBounds(25, 60, 200, 25);
        add(btAbrir);
        add(lbResposta);
        
    }
    
    private void definirEventos() {
        
        btAbrir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String[] escolha = { "Masculino", "Feminino" };
                int resp = JOptionPane.showOptionDialog(null, "Escolha o sexo", 
                        "Sexo", 0, JOptionPane.INFORMATION_MESSAGE, 
                        new ImageIcon("img/sexo.png"), escolha, escolha[0]);
                lbResposta.setText("Sexo Escolhido: " + escolha[resp]);
            
            }
            
        });
        
    }
    
}
