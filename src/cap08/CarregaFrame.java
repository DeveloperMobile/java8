
package cap08;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Login
 */
public class CarregaFrame extends JFrame {
    
    private Container contentPane;
    private JMenuBar mnBar;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miPaises, miTabuleiro, miCadastro, miVendas;
    
    
    public static void main(String[] args) {
        
        CarregaFrame carregaFrame = new CarregaFrame();
        carregaFrame.inicializarComponentes();
        
    }
    
    public void inicializarComponentes() {
        
        JFrame frame = new JFrame("MENU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 500, 300);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                 (tela.height - frame.getSize().height) / 2);
        
        contentPane = frame.getContentPane();
        
        mnBar = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnExemplos = new JMenu("Exemplos");
        
        mnBar.add(mnArquivo);
        mnBar.add(mnExemplos);
        
        miSair = new JMenuItem("Sair");
        mnArquivo.add(miSair);
        
        miPaises = new JMenuItem("Paises");
        miTabuleiro = new JMenuItem("Tabuleiro");
        miCadastro = new JMenuItem("Cadastro");
        miVendas = new JMenuItem("Vendas");
        mnExemplos.add(miPaises);
        mnExemplos.add(miTabuleiro);
        mnExemplos.add(miCadastro);
        mnExemplos.add(miVendas);
        
        frame.setJMenuBar(mnBar);
        
        definirEventos();
        
        frame.setVisible(true);
        
        
        
    }
    
    private void definirEventos() {
     
        miSair.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                System.exit(0);
            
            }
            
        });
        
        miPaises.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                contentPane.removeAll();
                contentPane.add(new GuiBandeiras());
                contentPane.validate();
           
            }
            
        });
        
        miTabuleiro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                contentPane.removeAll();
                contentPane.add(new GuiTabuleiro());
                contentPane.validate();
           
            }
            
        });
        
        miCadastro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                contentPane.removeAll();
                contentPane.add(new GuiCadastro());
                contentPane.validate();
           
            }
            
        });
        
        miVendas.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                contentPane.removeAll();
                contentPane.add(new GuiVendas());
                contentPane.validate();
           
            }
            
        });
        
    }
    
}
