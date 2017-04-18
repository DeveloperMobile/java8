
package cap08;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiLabel extends JPanel {
    
    private JLabel label1, label2, label3, label4;
    private ImageIcon imageIcon1;
    
    public GuiLabel() {
        
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(new GridLayout(4, 1));
        imageIcon1 = new ImageIcon("img/java.png");
        setBackground(new Color(100, 220, 100));
        label1 = new JLabel("   Aprendendo", JLabel.LEFT);
        label1.setForeground(Color.white);
        label2 = new JLabel(imageIcon1);
        label3 = new JLabel("Inserir   ", JLabel.RIGHT);
        label3.setForeground(Color.blue);
        label4 = new JLabel("Labels e Imagens", imageIcon1, JLabel.CENTER);
        label4.setFont(new Font("Serif", Font.BOLD, 20));
        label4.setForeground(Color.black);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        
    }
    
}
