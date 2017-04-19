
package cap08;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Login
 */
public class GuiListaComFotos extends JPanel {
    
    private JList lsFotos;
    private DefaultListModel dlm;
    private ImageIcon imagem1;
    private JScrollPane sp;
    private JLabel lbImagem;
    
    public GuiListaComFotos() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        dlm = new DefaultListModel();
        for (int i = 1; i <= 5; i++) {
            dlm.addElement("Foto" + i);
        }
        lsFotos = new JList(dlm);
        sp = new JScrollPane(lsFotos);
        sp.setBounds(50, 40, 70, 150);
        imagem1 = new ImageIcon();
        lbImagem = new JLabel(imagem1);
        lbImagem.setBounds(150, 30, 180, 180);
        add(sp);
        add(lbImagem);
        
    }
    
    private void definirEventos() {
        
        lsFotos.addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
            
                imagem1 = new ImageIcon("img/" + lsFotos.getSelectedValue() + ".png");
                lbImagem.setIcon(imagem1);
            
            }
            
        });
        
    }
    
}
