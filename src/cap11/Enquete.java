
package cap11;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Login
 */
public class Enquete extends JFrame {
    
    private JRadioButton rbSim, rbNao;
    private ButtonGroup bg;
    private JButton btnVotar;
    
    int sim = 0, nao = 0;
    
    public static void main(String[] args) {
        
        JFrame frame = new Enquete();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
    public Enquete() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Você é a favor do Aborto?");
        setSize(320, 80);
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        rbSim = new JRadioButton("Sim");
        rbSim.setSelected(true);
        rbNao = new JRadioButton("Não");
        bg = new ButtonGroup();
        bg.add(rbSim);
        bg.add(rbNao);
        btnVotar = new JButton("Votar");
        add(rbSim);
        add(rbNao);
        add(btnVotar);
        
    }
    
    private void definirEventos() {
        
        btnVotar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    gravar();
                    File file = new File("c:/votos/enquete.txt");
                    PrintWriter pw = new PrintWriter(file);
                  
                    if (rbSim.isSelected()) {
                        
                        sim = sim + 1;
                        pw.println(sim);
                        pw.println(nao);
                        
                    } else if (rbNao.isSelected()) {
                        
                        nao = nao + 1;
                        pw.println(sim);
                        pw.println(nao);
                        
                    }
                        
                    pw.close();
                    JOptionPane.showMessageDialog(null, "Votos computados"); 
                    
                } catch (IOException erro) {
                    
                    JOptionPane.showMessageDialog(null, erro.getMessage());
                    
                } catch (NumberFormatException erro) { 
                    
                     JOptionPane.showMessageDialog(null, erro.toString());
                    
                }
                    
                    
            }
            
        });
        
    }
    
    private void gravar() throws FileNotFoundException, IOException {
        
        String path = "c:/votos";
                    
        File dir = new File(path);
                    
        if (!dir.exists()) {
                        
            dir.mkdir();
                        
        }
                    
        FileWriter fw = new FileWriter(path + "/enquete.txt");
        fw.flush();
        fw.close();
        
    }
    
}
