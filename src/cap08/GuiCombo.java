
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiCombo extends JPanel {
    
    private JComboBox cbEstados;
    private JLabel lbEstados;
    private JButton btMostrar;
    
    public GuiCombo() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        String[] cbEstadosItens = { "Espírito Santo", "Minas Gerais", "Rio de Janeiro", "São Paulo" };
        cbEstados = new JComboBox(cbEstadosItens);
        lbEstados = new JLabel("Estados do Sudeste:");
        btMostrar = new JButton("Mostrar");
        lbEstados.setBounds(25, 15, 150, 25);
        cbEstados.setBounds(25, 40, 150, 25);
        btMostrar.setBounds(25, 75, 100, 25);
        add(lbEstados);
        add(cbEstados);
        add(btMostrar);
        
    }
    
    private void definirEventos() {
        
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                JOptionPane.showMessageDialog(null, "Índice Selecionado: " + cbEstados.getSelectedIndex() 
                        + "\nTexto Selecionado: " + cbEstados.getSelectedItem());
            
            }
            
        });
        
    }
    
}
