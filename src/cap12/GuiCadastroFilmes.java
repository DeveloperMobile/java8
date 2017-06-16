
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
public class GuiCadastroFilmes extends JFrame {
    
    private JLabel label1, label2, label3, label4, label5;
    private JButton btGravar, btAlterar, btExcluir, btNovo, btLocalizar, btCancelar, btSair;
    private JTextField tfCodigo, tfTitulo, tfGenero, tfProdutora, tfDatcom;
    private FilmesDAO filmes;
    
     public static void main(String[] args) {
        
        JFrame frame = new GuiCadastroFilmes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    public GuiCadastroFilmes() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label1 = new JLabel("Código");
        label2 = new JLabel("Título");
        label3 = new JLabel("Gênero");
        label4 = new JLabel("Produtora");
        label5 = new JLabel("Data de Compra  ");
        tfCodigo = new JTextField(10);
        tfTitulo = new JTextField(35);
        tfGenero = new JTextField(10);
        tfProdutora = new JTextField(15);
        tfDatcom = new JTextField(8);
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
        add(tfTitulo);
        add(label3);
        add(tfGenero);
        add(label4);
        add(tfProdutora);
        add(label5);
        add(tfDatcom);
        add(btNovo);
        add(btLocalizar);
        add(btGravar);
        add(btAlterar);
        add(btExcluir);
        add(btCancelar);
        add(btSair);
        setTitle("Cadastramento de Filmes");
        setBounds(200, 100, 610, 125);
        setResizable(false);
        setBotoes(true, true, false, false, false, false);
        filmes = new FilmesDAO();
        if (!filmes.bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha na conexão, o sistema será fechado");
            System.exit(0);
        }
        
    }
    
    private void definirEventos() {
        
        btSair.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                filmes.bd.close();
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
                
                if (tfTitulo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O título não pode ser vazio!");
                    tfTitulo.requestFocus();
                    return;
                }
                
                if (tfGenero.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O gênero não pode ser vazio!");
                    tfGenero.requestFocus();
                    return;
                }
                
                if (tfProdutora.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "A produtora não pode ser vazia!");
                    tfProdutora.requestFocus();
                    return;
                }
            
                if (tfDatcom.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "A data de compra não pode ser vazia!");
                    tfDatcom.requestFocus();
                    return;
                }
                
                filmes.filme.setCodigo(tfCodigo.getText());
                filmes.filme.setTitulo(tfTitulo.getText());
                filmes.filme.setGenero(tfGenero.getText());
                filmes.filme.setProdutora(tfProdutora.getText());
                filmes.filme.setDataCompra(tfDatcom.getText());
                JOptionPane.showMessageDialog(null, filmes.atualizar(FilmesDAO.INCLUSAO));
                limparCampos();
                
            }
            
        });
        
        btAlterar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                filmes.filme.setCodigo(tfCodigo.getText());
                filmes.filme.setTitulo(tfTitulo.getText());
                filmes.filme.setGenero(tfGenero.getText());
                filmes.filme.setProdutora(tfProdutora.getText());
                filmes.filme.setDataCompra(tfDatcom.getText());
                JOptionPane.showMessageDialog(null, filmes.atualizar(FilmesDAO.ALTERACAO));
                limparCampos();
            
            }
            
        });
        
        btExcluir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                filmes.filme.setCodigo(tfCodigo.getText());
                filmes.localizar();
                
                int n = JOptionPane.showConfirmDialog(null, filmes.filme.getTitulo(),
                        " Excluir o Filme? ", JOptionPane.YES_NO_OPTION);
                
                if (n == JOptionPane.YES_OPTION) {
                
                    JOptionPane.showMessageDialog(null, filmes.atualizar(FilmesDAO.EXCLUSAO));
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
        tfTitulo.setText("");
        tfGenero.setText("");
        tfProdutora.setText("");
        tfDatcom.setText("");
        tfCodigo.requestFocus();
        setBotoes(true, true, false, false, false, false);
        
    }
    
    private void atualizarCampos() {
        
        filmes.filme.setCodigo(tfCodigo.getText());
        if (filmes.localizar()) {
            tfCodigo.setText(filmes.filme.getCodigo());
            tfTitulo.setText(filmes.filme.getTitulo());
            tfGenero.setText(filmes.filme.getGenero());
            tfProdutora.setText(filmes.filme.getProdutora());
            tfDatcom.setText(filmes.filme.getDataCompra());
            setBotoes(true, true, false, true, true, true);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Filme não encontrado!");
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
