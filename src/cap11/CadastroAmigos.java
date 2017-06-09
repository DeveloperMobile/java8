
package cap11;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class CadastroAmigos extends JFrame {
    
    private JLabel lbNome;
    private JTextField tfNome;
    private JButton btnInserir;
    
    public static void main(String[] args) {
        
        JFrame frame = new CadastroAmigos();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                (tela.height - frame.getSize().height) / 2);
        frame.setSize(260, 80);
        frame.setVisible(true);
        
    }
    
    public CadastroAmigos() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Cadastro de Amigos");
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        lbNome = new JLabel("Nome");
        tfNome = new JTextField(10);
        btnInserir = new JButton("Inserir");
        add(lbNome);
        add(tfNome);
        add(btnInserir);
        
    }
    
    private void definirEventos() {
        
        btnInserir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                 
                     File dir = new File("c:/meusamigos");
               
                     if (!dir.exists()) {
                     
                         dir.mkdir();
                   
                     }
            
                     if (tfNome.getText().equals("")) {
                         
                         JOptionPane.showMessageDialog(null, "Informe o nome do amigo!");
                         tfNome.requestFocus();
                         
                     } else {
                      
                         PrintWriter pw = new PrintWriter(new File(dir, "/amigos.txt"));
                         pw.println(tfNome.getText());
                         pw.flush();    
                         pw.close();
                     
                     JOptionPane.showMessageDialog(null, "Amigo armazenado!");
                         
                     }
            
                } catch (FileNotFoundException erro) {
                    
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado! " + erro.toString());
                    
                }
                
            }
            
        });
        
    }
    
}
