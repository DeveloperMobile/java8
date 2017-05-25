
package cap10;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Login
 */
public class ManipulacaoDataHoraFormatoSimples extends JFrame {
    
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;
    
    public static void main(String[] args) {
        
        JFrame janela = new ManipulacaoDataHoraFormatoSimples();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        janela.setLocation((tela.width - janela.getSize().width) / 2,
                (tela.height - janela.getSize().height) / 2);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    public ManipulacaoDataHoraFormatoSimples() {
        
        inicializarComponentes();
        definirEventos();
        
    }
    
    private void inicializarComponentes() {
        
        setTitle("Manipulação de Datas e Horas");
        setBounds(100, 100, 300, 200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto, "Center");
        add(btMostrar, "North");
        agora = new Date();
        
    }
    
    private void definirEventos() {
        
       btMostrar.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
           
               String formato = "dd/MM/yyyy, hh:mm:ss";
               DateFormat dateFormat = new SimpleDateFormat(formato);
               taTexto.setText("Data Normal: " + agora +
                     "\nData Formatada: " + dateFormat.format(agora));
           
           }
       });
        
    }
    
}
