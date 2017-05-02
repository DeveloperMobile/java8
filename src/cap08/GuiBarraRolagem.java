
package cap08;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import java.text.NumberFormat;

/**
 *
 * @author Login
 */
public class GuiBarraRolagem extends JPanel {
    
    private JScrollBar scrollBar1;
    private JLabel lbCentrimetros, lbPolegadas;
    
    public GuiBarraRolagem() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        scrollBar1 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 105);
        lbPolegadas = new JLabel("0 Polegadas", JLabel.CENTER);
        lbCentrimetros = new JLabel("0.00 Centímetros", JLabel.CENTER);
        scrollBar1.setBounds(25, 20, 180, 25);
        lbPolegadas.setBounds(35, 50, 150, 25);
        lbCentrimetros.setBounds(35, 80, 150, 25);
        add(scrollBar1);
        add(lbCentrimetros);
        add(lbPolegadas);
        
    }
    
    private void definirEventos() {
        
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
            
                lbPolegadas.setText(scrollBar1.getValue() + " Polegadas");
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumIntegerDigits(2);
                nf.setMaximumIntegerDigits(2);
                double cm = scrollBar1.getValue() * 2.54;
                lbCentrimetros.setText(nf.format(cm) + " Centrímetros");
            
            }
            
        });
        
    }
    
}
