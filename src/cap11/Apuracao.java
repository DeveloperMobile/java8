
package cap11;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Login
 */
public class Apuracao extends JFrame {
    
    private JLabel lbSim, lbNao;
    private JButton btnVer;
    
    public static void main(String[] args) {
        
        JFrame frame = new Apuracao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
    public Apuracao() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Apuração dos votos");
        setSize(320, 110);
        setLayout(new GridLayout(3, 1));
        lbSim = new JLabel("Sim: ");
        lbNao = new JLabel("Não: ");
        btnVer = new JButton("Ver");
        add(btnVer);
        add(lbSim);
        add(lbNao);
        
    }
        
    private void definirEventos() {
        
        btnVer.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    BufferedReader br = new BufferedReader(new FileReader("c:/votos/enquete.txt"));
                    lbSim.setText("Sim: " + br.readLine());
                    lbNao.setText("Não: " + br.readLine());
                    br.close();
                    
                } catch (IOException erro) {
                    
                    JOptionPane.showMessageDialog(null, erro.toString());
                    
                }
            
            }
            
        });
        
    }
    
}
