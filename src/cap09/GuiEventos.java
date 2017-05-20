
package cap09;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Login
 */
public class GuiEventos extends JFrame {
    
    JButton btMudarCor;
    JTextField tfCaixa1, tfCaixa2;
    int posicaoEsquerda = 100, posicaoTopo = 100;
    
    public static void main(String[] args) {
        
        JFrame janela = new GuiEventos();
        janela.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {}

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("A janela foi minimizada!");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("A janela foi restaurada!");
            }

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
            
        });
        
        janela.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("A janela foi redimensionada!");
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("A janela foi movida!");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("A janela tornou-se visível!");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("A janela tornou-se oculta!");
            }
            
        });
        
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    public GuiEventos() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Controle de Eventos");
        setSize(250, 150);
        setLocation(posicaoEsquerda, posicaoTopo);
        setLayout(new GridLayout(3, 1));
        btMudarCor = new JButton("Eventos do Botao");
        tfCaixa1 = new JTextField();
        tfCaixa2 = new JTextField();
        btMudarCor.setBackground(Color.gray);
        add(btMudarCor);
        add(tfCaixa1);
        add(tfCaixa2);
        
    }
    
    private void definirEventos() {
        
        btMudarCor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("O botão do mouse foi pressionado e solto!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("O botão do mouse foi pressionado!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("O botão do mouse foi solto!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btMudarCor.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btMudarCor.setBackground(Color.gray);
            }
            
        });
        
        btMudarCor.addMouseMotionListener(new MouseMotionListener() {
           
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse foi arrastado em " + e.getX() + " , " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse se moveu em " + e.getX() + " , " + e.getY());
            }
            
        });
        
        tfCaixa1.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 38) // Seta direcional para cima
                    posicaoTopo = posicaoTopo - 5;
                if (e.getKeyCode() == 40) // seta direcional para baixo
                    posicaoTopo = posicaoTopo + 5;
                if (e.getKeyCode() == 37) // seta direcional para esquerda
                    posicaoEsquerda = posicaoEsquerda - 5;
                if (e.getKeyCode() == 39) // seta direcional para direita
                    posicaoEsquerda = posicaoEsquerda + 5;
                setLocation(posicaoEsquerda, posicaoTopo);
            }

            @Override
            public void keyReleased(KeyEvent e) {}
            
        });
        
        tfCaixa2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("A caixa 2 recebeu o foco!");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("A caixa 2 perdeu o foco!");
            }
            
        });
        
        tfCaixa2.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Um caractere foi inserido!");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Um caractere foi removido!");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("O conteúdo de um atributo mudou!");
            }
            
        });
        
    }
    
}
