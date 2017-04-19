
package cap08;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Login
 */
public class GuiMenuPrincipal extends JFrame {
    
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miRadio, miLabels, 
            miLista, miListaFoto;
    
    public GuiMenuPrincipal() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        /* Barra de Menu */
        mnBarra = new JMenuBar();
        /* Menu */
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        /* Item de Menu */
        miSair = new JMenuItem("Sair", new ImageIcon("img/sair.png"));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        miRadio = new JMenuItem("Botao de Radio");
        miLabels = new JMenuItem("Labels");
        miLista = new JMenuItem("Lista de Seleção");
        miListaFoto = new JMenuItem("Lista Com Foto");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miRadio);
        mnExemplos.add(miLabels);
        mnExemplos.add(miLista);
        mnExemplos.add(miListaFoto);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
        
    }
    
    private void definirEventos() {
        
        miSair.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.exit(0);
                
            }
            
        });
     
        miBotao.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                /* Aqui vai o código para chamar o exemplo 8.3 */
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
           
            }
            
        });
        
        miCaixaOpcao.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(guiCaixaOpcao);
                contentPane.validate();
                
            }
            
        });
        
        miRadio.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
            
                GuiRadio guiRadio = new GuiRadio();
                contentPane.removeAll();
                contentPane.add(guiRadio);
                contentPane.validate();
            
            }
            
        });
        
        miLabels.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
            
                GuiLabel guiLabel = new GuiLabel();
                contentPane.removeAll();
                contentPane.add(guiLabel);
                contentPane.validate();
                
            }
            
        });
        
        miLista.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                GuiLista guiLista = new GuiLista();
                contentPane.removeAll();
                contentPane.add(guiLista);
                contentPane.validate();
            
            }
            
        });
        
        miListaFoto.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                GuiListaComFotos guiListaComFotos = new GuiListaComFotos();
                contentPane.removeAll();
                contentPane.add(guiListaComFotos);
                contentPane.validate();
            
            }
            
        });
        
    }
    
    public static void abrir() {
        
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, 
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
}
