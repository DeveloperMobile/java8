
package cap08;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Login
 */
public class GuiVendas extends JPanel {
    
    private JLabel lbValorVenda, lbPrecoFinalVanda;
    private JTextField tfValorVenda, tfPrecoFinalVenda;
    private JRadioButton rbDinheiro, rbCheque, rbCartao;
    private ButtonGroup buttonGroup;
    
    public GuiVendas() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        lbValorVenda = new JLabel("Valor da venda:");
        lbValorVenda.setBounds(15, 15, 200, 20);
        
        tfValorVenda = new JTextField();
        tfValorVenda.setBounds(125, 15, 100, 20);
        
        lbPrecoFinalVanda = new JLabel("Preço Final da Venda:");
        lbPrecoFinalVanda.setBounds(15, 135, 200, 20);
        
        tfPrecoFinalVenda = new JTextField();
        tfPrecoFinalVenda.setBounds(150, 135, 180, 20);
        tfPrecoFinalVenda.setEditable(false);
        
        rbDinheiro = new JRadioButton("Dinheiro");
        rbDinheiro.setSelected(true);
        rbCheque = new JRadioButton("Cheque");
        rbCartao = new JRadioButton("Cartão");
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbDinheiro);
        buttonGroup.add(rbCheque);
        buttonGroup.add(rbCartao);
        rbDinheiro.setBounds(15, 45, 75, 20);
        rbCheque.setBounds(15, 75, 70, 20);
        rbCartao.setBounds(15, 105, 70, 20);
        
        add(lbValorVenda);
        add(tfValorVenda);
        add(rbDinheiro);
        add(rbCheque);
        add(rbCartao);
        add(lbPrecoFinalVanda);
        add(tfPrecoFinalVenda);
        
    }
    
    private void definirEventos() {
        
        try {
            
            rbDinheiro.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    double valor = Double.parseDouble(tfValorVenda.getText());
                    double desconto = valor * 0.05;
                    tfPrecoFinalVenda.setText(String.valueOf(valor - desconto));
                    
                }
                
            });
            
            rbCheque.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                    
                   double valor = Double.parseDouble(tfValorVenda.getText());
                   double desconto = valor * 0.05;
                   tfPrecoFinalVenda.setText(String.valueOf(valor + desconto));
                    
                }
                
            });
            
            rbCartao.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                
                    double valor = Double.parseDouble(tfValorVenda.getText());
                    double desconto = valor * 0.10;
                    tfPrecoFinalVenda.setText(String.valueOf(valor + desconto));
                
                }
                
            });
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Informe apenas carateres numéricos!\n" + e.getMessage());
            
        }
        
    }
    
}
