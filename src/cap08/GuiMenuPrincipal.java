
package cap08;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
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
    
    private JDesktopPane contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miRadio, miLabels, 
            miLista, miListaFoto, miCombo, miAreaTexto, miDialogoMensagem,
            miDialogoConfirmacao, miDialogoOpcao, miBarraRolagem, miBarraProgresso,
            miAbas, miFrameInterno;
    private ImageIcon imageIcon;
    
    public GuiMenuPrincipal() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = new JDesktopPane();
        setContentPane(contentPane);
        /* Imagem */
        imageIcon = new ImageIcon("img/sair.png");
        /* Barra de Menu */
        mnBarra = new JMenuBar();
        /* Menu */
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        /* Item de Menu */
        miSair = new JMenuItem("Sair", imageIcon);
        miSair.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        miRadio = new JMenuItem("Botao de Radio");
        miLabels = new JMenuItem("Labels");
        miLista = new JMenuItem("Lista de Seleção");
        miListaFoto = new JMenuItem("Lista Com Foto");
        miCombo = new JMenuItem("JComboBox");
        miAreaTexto = new JMenuItem("Area de Texto");
        miDialogoMensagem = new JMenuItem("Dialog Mensagem");
        miDialogoConfirmacao = new JMenuItem("Dialogo Confirmação");
        miDialogoOpcao = new JMenuItem("Dialogo Opção");
        miBarraRolagem = new JMenuItem("Barra de Rolagem");
        miBarraProgresso = new JMenuItem("Barra de Progresso");
        miAbas =  new JMenuItem("Abas");
        miFrameInterno = new JMenuItem("Frame Interno");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miRadio);
        mnExemplos.add(miLabels);
        mnExemplos.add(miLista);
        mnExemplos.add(miListaFoto);
        mnExemplos.add(miCombo);
        mnExemplos.add(miAreaTexto);
        mnExemplos.add(miDialogoMensagem);
        mnExemplos.add(miDialogoConfirmacao);
        mnExemplos.add(miDialogoOpcao);
        mnExemplos.add(miBarraRolagem);
        mnExemplos.add(miBarraProgresso);
        mnExemplos.add(miAbas);
        mnExemplos.add(miFrameInterno);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
        
    }
    
    private void definirEventos() {
        
        miSair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
     
        miBotao.addActionListener((ActionEvent e) -> {
            /* Aqui vai o código para chamar o exemplo 8.3 */
            GuiBotao botao = new GuiBotao();
            contentPane.removeAll();
            contentPane.add(botao);
            contentPane.validate();
        });
        
        miCaixaOpcao.addActionListener((ActionEvent e) -> {
            GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
            contentPane.removeAll();
            contentPane.add(guiCaixaOpcao);
            contentPane.validate();
        });
        
        miRadio.addActionListener((ActionEvent ae) -> {
            GuiRadio guiRadio = new GuiRadio();
            contentPane.removeAll();
            contentPane.add(guiRadio);
            contentPane.validate();
        });
        
        miLabels.addActionListener((ActionEvent e) -> {
            GuiLabel guiLabel = new GuiLabel();
            contentPane.removeAll();
            contentPane.add(guiLabel);
            contentPane.validate();
        });
        
        miLista.addActionListener((ActionEvent e) -> {
            GuiLista guiLista = new GuiLista();
            contentPane.removeAll();
            contentPane.add(guiLista);
            contentPane.validate();
        });
        
        miListaFoto.addActionListener((ActionEvent e) -> {
            GuiListaComFotos guiListaComFotos = new GuiListaComFotos();
            contentPane.removeAll();
            contentPane.add(guiListaComFotos);
            contentPane.validate();
        });
        
        miCombo.addActionListener((ActionEvent e) -> {
            GuiCombo guiCombo = new GuiCombo();
            contentPane.removeAll();
            contentPane.add(guiCombo);
            contentPane.validate();
        });
        
        miAreaTexto.addActionListener((ActionEvent e) -> {
            GuiAreaDeTexto guiAreaDeTexto = new GuiAreaDeTexto();
            contentPane.removeAll();
            contentPane.add(guiAreaDeTexto);
            contentPane.validate();
        });
        
        miDialogoMensagem.addActionListener((ActionEvent e) -> {
            GuiDialogoMensagem guiDialogoMensagem = new GuiDialogoMensagem();
            contentPane.removeAll();
            contentPane.add(guiDialogoMensagem);
            contentPane.validate();
        });
        
        miDialogoConfirmacao.addActionListener((ActionEvent e) -> {
            GuiDialogoConfirmacao guiDialogoConfirmacao = new GuiDialogoConfirmacao();
            contentPane.removeAll();
            contentPane.add(guiDialogoConfirmacao);
            contentPane.validate();
        });
        
        miDialogoOpcao.addActionListener((ActionEvent e) -> {
            GuiDialogoOpcao guiDialogoOpcao = new GuiDialogoOpcao();
            contentPane.removeAll();
            contentPane.add(guiDialogoOpcao);
            contentPane.validate();
        });
        
        miBarraRolagem.addActionListener((ActionEvent e) -> {
            GuiBarraRolagem guiBarraRolagem = new GuiBarraRolagem();
            contentPane.removeAll();
            contentPane.add(guiBarraRolagem);
            contentPane.validate();
        });
        
        miBarraProgresso.addActionListener((e) -> {
        
            GuiBarraProgresso guiBarraProgresso = new GuiBarraProgresso();
            contentPane.removeAll();
            contentPane.add(guiBarraProgresso);
            contentPane.validate();
            
        });
        
        miAbas.addActionListener((ActionEvent e) -> {
            
            GuiAbas guiAbas = new GuiAbas();
            contentPane.removeAll();
            contentPane.add(guiAbas);
            contentPane.validate();
            
        });
        
        miFrameInterno.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                GuiFrameInterno guiFrameInterno = new GuiFrameInterno();
                contentPane.removeAll();
                contentPane.add(guiFrameInterno);
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
