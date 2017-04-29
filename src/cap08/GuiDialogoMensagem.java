
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Login
 */
public class GuiDialogoMensagem extends JPanel {
    
    private ImageIcon imageIcon1;
    private JComboBox cbCaixas;
    
    public GuiDialogoMensagem() {
        
        inicializarComponentes();
        definirEventos();
        
    }
        
    private void inicializarComponentes() {
        
        setLayout(null);
        imageIcon1 = new ImageIcon("img/estrela.png");
        String[] cbCaixasItens = { "Pergunta", "Informação", "Alerta", "Erro",
             "Definida pelo usuário", "Somente Mensagem"};
        cbCaixas = new JComboBox(cbCaixasItens);
        cbCaixas.setBounds(25, 40, 150, 25);
        add(cbCaixas);
        
    }
        
    private void definirEventos() {
        
        cbCaixas.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
               switch (cbCaixas.getSelectedIndex()) {
                   case 0: 
                       JOptionPane.showMessageDialog(null, "Estou aprendendo Java?",
                               "Pergunta", JOptionPane.QUESTION_MESSAGE);
                       break;   
                   case 1:
                       JOptionPane.showMessageDialog(null, "Gravação OK.",
                               "Informação", JOptionPane.INFORMATION_MESSAGE);
                       break;   
                   case 2: 
                       JOptionPane.showMessageDialog(null, "Cuidado!",
                               "Alerta", JOptionPane.WARNING_MESSAGE);
                       break;   
                   case 3: 
                       JOptionPane.showMessageDialog(null, "Ocorreu algum erro!",
                               "Erro", JOptionPane.QUESTION_MESSAGE);
                       break;   
                   case 4: 
                       JOptionPane.showMessageDialog(null, "Usando uma imagem",
                               "Personalizado", JOptionPane.INFORMATION_MESSAGE,
                               imageIcon1);
                       break;   
                   case 5: 
                       JOptionPane.showMessageDialog(null, "Caixa de mensagem simples",
                               "Somente mensagem", JOptionPane.PLAIN_MESSAGE);
                       break;   
               }
            
            }
            
        });
        
    }
    
}
