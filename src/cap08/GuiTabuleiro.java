
package cap08;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiTabuleiro extends JPanel {
    
    private JTextField[] fields = new JTextField[64];
    
    public GuiTabuleiro() {
        
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes() {
        
        GridLayout gridLayout = new GridLayout(8, 8);
        setLayout(gridLayout);
        for (int i = 0; i < 8; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 8; i < 16; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 16; i < 24; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 24; i < 32; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 32; i < 40; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 40; i < 48; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 48; i < 56; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           }
            
        }
        
        for (int i = 56; i < 64; i++) {
            
           if (i % 2 == 0) {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.black);
               add(fields[i]);
               
           } else {
               
               fields[i] = new JTextField();
               fields[i].setBackground(Color.white);
               add(fields[i]);
               
           }
            
        }
        
    }
    
}
