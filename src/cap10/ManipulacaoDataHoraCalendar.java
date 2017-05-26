
package cap10;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Login
 */
public class ManipulacaoDataHoraCalendar extends JFrame {
    
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;
    
    public static void main(String[] args) {
        
        JFrame janela = new ManipulacaoDataHoraCalendar();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        janela.setLocation((tela.width - janela.getSize().width) / 2,
                (tela.height - janela.getSize().height) / 2);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    public ManipulacaoDataHoraCalendar() {
        
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
           
               DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
               Calendar calendario = Calendar.getInstance();
               calendario.setTime(agora);
               int hora = calendario.get(Calendar.HOUR_OF_DAY);
               int minuto = calendario.get(Calendar.MINUTE);
               int segundo = calendario.get(Calendar.SECOND);
               int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
               String men = "Boa Noite!";
               
               if (hora < 6) {
                   
                   men = "Boa madrugada";
                   
               } else if (hora < 12) {
                   
                   men = "Bom Dia!";
                   
               } else if (hora < 18) {
                   
                   men = "Boa Tarde!";
                   
               }
               
               taTexto.setText("Data Atual " + df.format(agora) +
                       "\nHora Atual " + hora + "h:" + minuto + "m:" + segundo + "s" +
                       "\n" + men);
           
           }
       });
        
    }
    
}
