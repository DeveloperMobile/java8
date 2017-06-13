
package cap12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Login
 */
public class ConsultaSQL extends JFrame {
    
    private JLabel label1;
    private JTextField tfSQL;
    private JButton btnExecutar;
    private JScrollPane scrollTable;
    private JTable table;
    private BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    
    public static void main(String[] args) {
        
        JFrame frame = new ConsultaSQL();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    public ConsultaSQL() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setLayout(null);
        setTitle("Aprendendo consultas com SQL");
        setBounds(200, 200, 600, 500);
        setResizable(false);
        label1 = new JLabel("Digite o comando SQL:");
        label1.setBounds(50, 10, 200, 25);
        tfSQL = new JTextField(50);
        tfSQL.setBounds(50, 35, 500, 25);
        btnExecutar = new JButton("Executar");
        btnExecutar.setBounds(50, 70, 100, 25);
        scrollTable = new JScrollPane();
        scrollTable.setBounds(50, 100, 500, 300);
        add(scrollTable);
        add(label1);
        add(tfSQL);
        add(btnExecutar);
        bd = new BD();
        
    }
    
    private void definirEventos() {
        
        btnExecutar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if (tfSQL.getText().equals("")) {
                    return;
                }
            
                try {
                 
                    if (!bd.getConnection()) {
                    
                        JOptionPane.showMessageDialog(null, "Falha na conexão, o sistema será fechado!");
                        System.exit(0);
                        
                    }
                    
                    statement = bd.connection.prepareStatement(tfSQL.getText());
                    resultSet = statement.executeQuery();
                    DefaultTableModel tableModel = new DefaultTableModel(
                            new String[]{}, 0);
                    
                    int qtdeColunas = resultSet.getMetaData().getColumnCount();
                    
                    for (int indice = 1; indice <= qtdeColunas; indice++) {
                       
                        tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
                    
                    }
                    
                    table = new JTable(tableModel);
                    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                    
                    while (resultSet.next()) {
                        
                        try {
                            
                            String[] dados = new String[qtdeColunas];
                            
                            for (int i = 1; i <= qtdeColunas; i++) {
                            
                                dados[i - 1] = resultSet.getString(i);
                                System.out.println(resultSet.getString(i));
                            
                            }
                            
                            dtm.addRow(dados);
                            System.out.println();
                            
                        } catch (SQLException erro) {}
                        
                        scrollTable.setViewportView(table);
                        
                    }
                    
                    resultSet.close();
                    statement.close();
                    bd.close();
                    
                } catch (Exception erro) {
                    
                    JOptionPane.showMessageDialog(null, "Comando SQL inválido! " + erro.toString());
                    
                }
                    
            }
            
        });
        
    }
    
}
