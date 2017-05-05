
package cap08;

import java.awt.Color;
import javax.swing.JInternalFrame;

/**
 *
 * @author Login
 */
public class GuiFrameInterno extends JInternalFrame {
    
    public GuiFrameInterno() {
        
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Usando Frame Interno");
        setSize(300, 100);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.orange);
        setVisible(true);
        
    }
    
}
