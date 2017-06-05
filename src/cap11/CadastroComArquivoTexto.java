
package cap11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class CadastroComArquivoTexto extends JFrame {
    
    private JLabel label1, label2, label3;
    private JButton btAbrir, btGravar, btLimpar;
    private JTextField tfCodigo, tfNome, tfEmail;
    private Pessoa pessoa;
    
    public static void main(String[] args) {
        
        JFrame frame = new CadastroComArquivoTexto();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
    public CadastroComArquivoTexto() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    public void inicializarComponentes() {
        
        setTitle("Cadastro usando arquivo texto");
        setBounds(250, 50, 340, 160);
        setBackground(new Color(150, 150, 150));
        label1 = new JLabel("Codigo");
        label2 = new JLabel("Nome");
        label3 = new JLabel("Email");
        btAbrir = new JButton("Abrir");
        btGravar = new JButton("Gravar");
        btLimpar = new JButton("Limpar");
        tfCodigo = new JTextField();
        tfNome = new JTextField();
        tfEmail = new JTextField();
        setLayout(null);
        label1.setBounds(10, 15, 40, 20);
        label2.setBounds(10, 40, 45, 20);
        label3.setBounds(10, 65, 45, 20);
        btAbrir.setBounds(10, 100, 75, 20);
        btGravar.setBounds(95, 100, 75, 20);
        btLimpar.setBounds(180, 100, 75, 20);
        tfCodigo.setBounds(60, 15, 55, 20);
        tfNome.setBounds(60, 40, 255, 20);
        tfEmail.setBounds(60, 65, 255, 20);
        add(label1);
        add(label2);
        add(label3);
        add(btAbrir);
        add(btGravar);
        add(btLimpar);
        add(tfCodigo);
        add(tfNome);
        add(tfEmail);
        pessoa = new Pessoa();
        
    }
    
    private void definirEventos() {
        
        btLimpar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
               tfCodigo.setText("");
               tfNome.setText("");
               tfEmail.setText("");
            
            }
            
        });
        
        btGravar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if (tfCodigo.getText().equals("")) {
                    
                    JOptionPane.showMessageDialog(null, "O código não pode estar vazio!");
                    tfCodigo.requestFocus();
                    
                } else if (tfNome.getText().equals("")) {
                    
                    JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!");
                    tfNome.requestFocus();
                    
                } else  if (tfEmail.getText().equals("")) {
                    
                    JOptionPane.showMessageDialog(null, "O email não pode estar vazio!");
                    tfEmail.requestFocus();
                    
                } else {
                    
                    pessoa.codigo = tfCodigo.getText();
                    pessoa.nome = tfNome.getText();
                    pessoa.email = tfEmail.getText();
                    JOptionPane.showMessageDialog(null, pessoa.gravar("c:/temp"));
                    
                }
            
            }
            
        });
        
        btAbrir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                pessoa.codigo = JOptionPane.showInputDialog("Forneça o codigo a abrir:");
                pessoa = pessoa.ler("c:/temp");
                if (pessoa != null) {
                    
                    tfCodigo.setText(pessoa.codigo);
                    tfNome.setText(pessoa.nome);
                    tfEmail.setText(pessoa.email);
                    
                }
            
            }
            
        });
        
    }
        
    
}
