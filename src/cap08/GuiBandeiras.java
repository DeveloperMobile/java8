
package cap08;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiBandeiras extends JPanel {
    
    private JComboBox<String> comboPaises;
    private ImageIcon icon1, icon2, icon3, icon4, icon5;
    private JLabel lbBandeira, lbContinente;
    private String[] itens = { "Alemanha", "Brasil", "China", "Espanha", "Portugal" };
    
    public GuiBandeiras() {
        
        inicializarComponentes();
        definirEventos();
        
    }
        
    private void inicializarComponentes() {
        
        setLayout(null);
        
        icon1 = new ImageIcon("img/germany.png");
        icon2 = new ImageIcon("img/brazil.png");
        icon3 = new ImageIcon("img/china.png");
        icon4 = new ImageIcon("img/spain.png");
        icon5 = new ImageIcon("img/portugal.png");
        
        comboPaises = new JComboBox<>(itens);
        comboPaises.setBounds(15, 15, 100, 20);
        
        lbBandeira = new JLabel(icon1);
        lbBandeira.setBounds(15, 40, 48, 48);
        
        lbContinente = new JLabel("Europa");
        lbContinente.setBounds(15, 90, 100, 20);
        
        add(comboPaises);
        add(lbBandeira);
        add(lbContinente);
        
    }
    
    private void definirEventos() {
        
       comboPaises.addItemListener(new ItemListener() {
           
           @Override
           public void itemStateChanged(ItemEvent e) {
           
               int item = comboPaises.getSelectedIndex();
               
               switch (item) {
                   case 0:
                       lbBandeira.setIcon(icon1);
                       lbContinente.setText("Europa");
                       break;
                   case 1:
                       lbBandeira.setIcon(icon2);
                       lbContinente.setText("America do Sul");
                       break;
                   case 2:
                       lbBandeira.setIcon(icon3);
                       lbContinente.setText("Asia");
                       break;
                   case 3:
                       lbBandeira.setIcon(icon4);
                       lbContinente.setText("Europa");
                       break;
                   case 4:
                       lbBandeira.setIcon(icon5);
                       lbContinente.setText("Europa");
                       break;
                       
               }
           
           }
           
       });
        
    }
    
}
