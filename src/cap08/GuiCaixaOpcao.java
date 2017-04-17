
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiCaixaOpcao extends JPanel {
    
    private JButton btVerificar, btMarcar, btDesmarcar;
    private JCheckBox ckIngles, ckInformatica;
    
    public GuiCaixaOpcao() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        btVerificar = new JButton("Verificar");
        btMarcar = new JButton("Marcar");
        btDesmarcar = new JButton("Desmarcar");
        ckIngles = new JCheckBox("Inglês");
        ckInformatica = new JCheckBox("Informática");
        setLayout(null);
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20, 70, 100, 20);
        ckIngles.setBounds(15, 15, 100, 25);
        ckInformatica.setBounds(15, 40, 100, 25);
        btMarcar.setBounds(20, 100, 100, 20);
        btDesmarcar.setBounds(20, 130, 100, 20);
        
    }
    
    private void definirEventos() {
        
        btMarcar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            
            }
            
        });
        btDesmarcar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);
                
            }
            
        });
        btVerificar.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String selecao = "Selecionados: ";
                
                if(ckIngles.isSelected()) {
                    
                    selecao += "\nInglês";
                    
                }
                if (ckInformatica.isSelected()) {
                    
                    selecao += "\nInformática";
                    
                }
                JOptionPane.showMessageDialog(null, selecao);
            }
            
        });
        
    }
    
}
