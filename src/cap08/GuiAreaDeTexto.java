
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiAreaDeTexto extends JPanel {
    
    private JTextField tfCampo;
    private JTextArea taTexto;
    private JScrollPane scrollPane;
    private JButton btLimpar;
    private final static String novaLinha = "\n";
    
    public GuiAreaDeTexto() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        tfCampo = new JTextField();
        taTexto = new JTextArea(5, 20); // desnecessário por causa do setBounds
        taTexto.setEditable(false);
        btLimpar = new JButton(new ImageIcon("img/borracha.png"));
        scrollPane = new JScrollPane(taTexto);
        tfCampo.setBounds(25, 15, 150, 25);
        scrollPane.setBounds(25, 45, 300, 120);
        btLimpar.setBounds(25, 170, 50, 50);
        add(tfCampo);
        add(scrollPane);
        add(btLimpar);
        
    }
    
    private void definirEventos() {
        
        tfCampo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                tfCampo.selectAll();
                taTexto.append(tfCampo.getText() + novaLinha);
                taTexto.setCaretPosition(taTexto.getDocument().getLength());
                
            }
            
        });
        
        btLimpar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                tfCampo.setText("");
                taTexto.setText("");
            
            }
            
        });
        
    }
    
}
