
package cap08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiLista extends JPanel {
    
    private JButton btCalcular;
    private JLabel lbValor;
    private JTextField tfValor; 
    private JTextField tfValorDesconto;
    private JList liDesconto;
    private JScrollPane spLista;
    
    public GuiLista() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        String[] liDescontoItens = { "10%", "20%", "30%", "40%", "50%" };
        btCalcular = new JButton("Calcular");
        lbValor = new JLabel("Valor");
        tfValor = new JTextField(5);
        liDesconto = new JList(liDescontoItens);
        tfValorDesconto = new JTextField(5);
        spLista = new JScrollPane(liDesconto);
        btCalcular.setToolTipText("Faz o cálculo");
        btCalcular.setMnemonic(KeyEvent.VK_C);
        lbValor.setBounds(35, 05, 100, 25);
        tfValor.setBounds(35, 30, 100, 25);
        spLista.setBounds(35, 60, 100, 55);
        btCalcular.setBounds(35, 120, 90, 25);
        tfValorDesconto.setBounds(35, 150, 100, 25);
        add(btCalcular);
        add(lbValor);
        add(tfValor);
        add(spLista);
        add(tfValorDesconto);
        
    }
    
    private void definirEventos() {
        
        btCalcular.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if (tfValor.getText().equals("")) {
                    tfValor.requestFocus();
                    return;
                }
                
                try {
                    
                    float valor = Float.parseFloat(tfValor.getText());
                    if (liDesconto.getSelectedIndex() == -1) {
                        JOptionPane.showMessageDialog(null, "Selecione um item da lista");
                        return;
                    }
                    
                    float desconto = 0.9f;
                    if (liDesconto.getSelectedIndex() == 1) {
                        desconto = 0.8f;
                    } else if (liDesconto.getSelectedIndex() == 2) {
                        desconto = 0.7f;
                    } else if (liDesconto.getSelectedIndex() == 3) {
                        desconto = 0.6f;
                    } else if (liDesconto.getSelectedIndex() == 4) {
                        desconto = 0.5f;
                    }
                    
                    tfValorDesconto.setText("" + valor * desconto);
                    
                } catch (NumberFormatException erro) {
                    
                    JOptionPane.showMessageDialog(null, "Forneça apenas valores numéricos\n" 
                            + erro.getMessage());
                    tfValor.requestFocus();
                    
                }
                
            }
            
        });
        
    }
    
}
