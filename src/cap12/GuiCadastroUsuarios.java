
package cap12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Login
 */
public class GuiCadastroUsuarios extends JFrame {
    
     private JLabel label1, label2, label3;
     private JTextField tfCodigo, tfNome, tfEmail;
     private JButton btGravar, btAlterar, btExcluir, btNovo, btLocalizar, btCancelar, btSair;
     private UsuarioDAO usuarioDAO;
    
    public static void main(String[] args) {
        
        JFrame frame = new GuiCadastroUsuarios();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    public GuiCadastroUsuarios() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label1 = new JLabel("Código");
        label2 = new JLabel("Nome");
        label3 = new JLabel("Email");
        tfCodigo = new JTextField(5);
        tfNome = new JTextField(16);
        tfEmail = new JTextField(16);
        btGravar = new JButton(new ImageIcon("img/gravar.png"));
        btGravar.setToolTipText("Gravar");
        btAlterar = new JButton(new ImageIcon("img/alterar.png"));
        btAlterar.setToolTipText("Alterar");
        btExcluir = new JButton(new ImageIcon("img/excluir.png"));
        btExcluir.setToolTipText("Excluir");
        btNovo = new JButton(new ImageIcon("img/novo.png"));
        btNovo.setToolTipText("Novo");
        btLocalizar = new JButton(new ImageIcon("img/localizar.png"));
        btLocalizar.setToolTipText("Localizar");
        btCancelar = new JButton(new ImageIcon("img/cancelar.png"));
        btCancelar.setToolTipText("Cancelar");
        btSair = new JButton(new ImageIcon("img/sair.png"));
        btSair.setToolTipText("Sair");
        add(label1);
        add(tfCodigo);
        add(label2);
        add(tfNome);
        add(label3);
        add(tfEmail);
        add(btGravar);
        add(btAlterar);
        add(btExcluir);
        add(btNovo);
        add(btLocalizar);
        add(btCancelar);
        add(btSair);
        setTitle("Cadastramento de Filmes");
        setBounds(200, 100, 565, 100);
        setResizable(false);
        setBotoes(true, true, false, false, false, false);
        usuarioDAO = new UsuarioDAO();
        if (!usuarioDAO.bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha na conexão, o sistema será fechado");
            System.exit(0);
        }
    }
    
    private void definirEventos() {
        
        btSair.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                usuarioDAO.bd.close();
                System.exit(0);
            
            }
            
        });
        
        btNovo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                limparCampos();
                setBotoes(false, false, true, false, false, true);
            
            }
            
        });
        
        btCancelar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                limparCampos();
            
            }
            
        });
        
        btGravar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if (tfCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O código não pode ser vazio!");
                    tfCodigo.requestFocus();
                    return;
                }
                
                if (tfNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O nome não pode ser vazio!");
                    tfNome.requestFocus();
                    return;
                }
                
                if (tfEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O email não pode ser vazio!");
                    tfEmail.requestFocus();
                    return;
                }
                
                usuarioDAO.usuario.setCodigo(tfCodigo.getText());
                usuarioDAO.usuario.setNome(tfNome.getText());
                usuarioDAO.usuario.setEmail(tfEmail.getText());
                JOptionPane.showMessageDialog(null, usuarioDAO.atualizar(UsuarioDAO.INCLUSAO));
                limparCampos();
                
            }
            
        });
        
        btAlterar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                usuarioDAO.usuario.setCodigo(tfCodigo.getText());
                usuarioDAO.usuario.setNome(tfNome.getText());
                usuarioDAO.usuario.setEmail(tfEmail.getText());
                JOptionPane.showMessageDialog(null, usuarioDAO.atualizar(UsuarioDAO.ALTERACAO));
                limparCampos();
            
            }
            
        });
        
        btExcluir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                usuarioDAO.usuario.setCodigo(tfCodigo.getText());
                usuarioDAO.localizar();
                
                int n = JOptionPane.showConfirmDialog(null, usuarioDAO.usuario.getNome(),
                        " Excluir o Usuário? ", JOptionPane.YES_NO_OPTION);
                
                if (n == JOptionPane.YES_OPTION) {
                
                    JOptionPane.showMessageDialog(null, usuarioDAO.atualizar(UsuarioDAO.EXCLUSAO));
                    limparCampos();
                    
                }  
            
            }
            
        });
        
        btLocalizar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                atualizarCampos();
            
            }
            
        });
        
    }
    
    private void limparCampos() {
        
        tfCodigo.setText("");
        tfNome.setText("");
        tfEmail.setText("");
        tfCodigo.requestFocus();
        setBotoes(true, true, false, false, false, false);
        
    }
    
    private void atualizarCampos() {
        
        usuarioDAO.usuario.setCodigo(tfCodigo.getText());
        if (usuarioDAO.localizar()) {
            tfCodigo.setText(usuarioDAO.usuario.getCodigo());
            tfNome.setText(usuarioDAO.usuario.getNome());
            tfEmail.setText(usuarioDAO.usuario.getEmail());
            setBotoes(true, true, false, true, true, true);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            limparCampos();
            
        }
        
    }
    
    private void setBotoes(boolean bNovo, boolean bLocalizar, boolean bGravar,
            boolean bAlterar, boolean bExcluir, boolean bCancelar) {
        
        btNovo.setEnabled(bNovo);
        btLocalizar.setEnabled(bLocalizar);
        btGravar.setEnabled(bGravar);
        btAlterar.setEnabled(bAlterar);
        btExcluir.setEnabled(bExcluir);
        btCancelar.setEnabled(bCancelar);
                
    }
    
}
