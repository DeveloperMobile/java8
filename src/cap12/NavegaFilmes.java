
package cap12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class NavegaFilmes extends JFrame {
    
    private JLabel label1, label2, label3, label4, label5;
    private JButton btProximo, btAnterior, btPrimeiro, btUltimo, btMais10, btMenos10, btSair;
    private JTextField tfCodigo, tfTitulo, tfGenero, tfProdutora, tfDatcom;
    private BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    
    public static void main(String[] args) {
        
        JFrame frame = new NavegaFilmes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    public NavegaFilmes() {
        
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
        btProximo = new JButton(new ImageIcon("img/proximo.png"));
        btProximo.setToolTipText("Próximo");
        btAnterior = new JButton(new ImageIcon("img/anterior.png"));
        btAnterior.setToolTipText("Anterior");
        btPrimeiro = new JButton(new ImageIcon("img/primeiro.png"));
        btPrimeiro.setToolTipText("Primeiro");
        btUltimo = new JButton(new ImageIcon("img/ultimo.png"));
        btUltimo.setToolTipText("Ultimo");
        btMais10 = new JButton(new ImageIcon("img/mais.png"));
        btMais10.setToolTipText("+10");
        btMenos10 = new JButton(new ImageIcon("img/menos.png"));
        btMenos10.setToolTipText("-10");
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
        add(btPrimeiro);
        add(btAnterior);
        add(btProximo);
        add(btUltimo);
        add(btMais10);
        add(btMenos10);
        add(btSair);
        setTitle("Navegando na tabela de Filmes");
        setBounds(200, 400, 620, 125);
        setResizable(false);
        bd = new BD();
        if (!bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado!");
            System.exit(0);
        }
        carregarTabela();
        atualizarCampos();
        
    }
    
    private void definirEventos() {
        
        btProximo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    resultSet.next();
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        });
        
         btAnterior.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    resultSet.previous();
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        });
        
          btPrimeiro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    resultSet.first();
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        });
          
         btUltimo.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    resultSet.last();
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        });
         
         btMais10.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    resultSet.relative(10);
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        });
         
         btMenos10.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                try {
                    
                    if (resultSet.getRow() > 10) {
                        
                        resultSet.relative(-10);
                        
                    } else {
                        
                        resultSet.first();
                        
                    }
                    
                    atualizarCampos();
                    
                } catch (SQLException erro) {}
            
            }
            
        }); 
         
          btSair.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
               System.exit(0);
            
            }
            
        });
         
    }
    
    private void carregarTabela() {
        
        String sql = "select * from filmes";
        
        try {
            
            statement = bd.connection.prepareCall(sql);
            resultSet = statement.executeQuery();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro! " + erro.toString());
            
        }
        
    }
    
    private void atualizarCampos() {
        
        try {
            
            if (resultSet.isAfterLast()) {
                
                resultSet.last();
                
            }
            
            if (resultSet.isBeforeFirst()) {
                
                resultSet.first();
                
            }
            
            tfCodigo.setText(resultSet.getString("codigo"));
            tfTitulo.setText(resultSet.getString("titulo"));
            tfGenero.setText(resultSet.getString("genero"));
            tfProdutora.setText(resultSet.getString("produtora"));
            tfDatcom.setText("" + resultSet.getDate("datacompra"));
            
        } catch (SQLException erro) {}
        
    }
    
}
