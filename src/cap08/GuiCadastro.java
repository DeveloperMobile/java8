
package cap08;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiCadastro extends JPanel {
    
    private JLabel lbNome, lbEndereco, lbSexo, lbEstadoCivil;
    private JTextField tfNome, tfEndereco;
    private JComboBox comboSexo, comboEstadoCivil;
    private JTextArea taVisualizar;
    private JButton btnMostrar, btnLimpar;
    private JPanel pnCadastro;
    
    public GuiCadastro() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(new BorderLayout());
        
        pnCadastro = new JPanel(new GridLayout(5, 2));
        
        lbNome = new JLabel("Nome:");
        lbEndereco = new JLabel("Endereço:");
        lbSexo = new JLabel("Sexo:");
        lbEstadoCivil = new JLabel("Estado Civil:");
        
        tfNome = new JTextField();
        tfEndereco = new JTextField();
        
        comboSexo = new JComboBox(new String[]{ "Masculino", "Feminino" });
        comboEstadoCivil = new JComboBox(new String[]{ "Casado", "Solteiro" });
        
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        
        taVisualizar = new JTextArea();
        
        pnCadastro.add(lbNome);
        pnCadastro.add(tfNome);
        pnCadastro.add(lbEndereco);
        pnCadastro.add(tfEndereco);
        pnCadastro.add(lbSexo);
        pnCadastro.add(comboSexo);
        pnCadastro.add(lbEstadoCivil);
        pnCadastro.add(comboEstadoCivil);
        pnCadastro.add(btnMostrar);
        pnCadastro.add(btnLimpar);
        
        add(pnCadastro, BorderLayout.NORTH);
        add(taVisualizar);
        
    }
    
    private void definirEventos() {
        
        btnMostrar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                taVisualizar.setText(tfNome.getText() + "\n" +
                        tfEndereco.getText() + "\n" +
                        comboSexo.getSelectedItem().toString() + "\n" +
                        comboEstadoCivil.getSelectedItem().toString() + "\n");
            
            }
            
        });
        
        btnLimpar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                tfNome.setText("");
                tfEndereco.setText("");
                comboSexo.setSelectedIndex(0);
                comboEstadoCivil.setSelectedIndex(1);
                taVisualizar.setText("");
            
            }
            
        });
        
    }
    
}
