
package cap10;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Login
 */
public class ManipulacaoDataHoraCalc extends JFrame {
    
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;
    
    public static void main(String[] args) {
        
        JFrame janela = new ManipulacaoDataHoraCalc();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        janela.setLocation((tela.width - janela.getSize().width) / 2,
                (tela.height - janela.getSize().height) / 2);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    public ManipulacaoDataHoraCalc() {
        
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
               Calendar calendario1 = Calendar.getInstance();
               Calendar calendario2 = Calendar.getInstance();
               Calendar calendario3 = Calendar.getInstance();
               Calendar calendario4 = Calendar.getInstance();
               
               try {
                
                   Date data1 = df.parse("01/01/2015"); // pode gerar erro(ParseException)
                   calendario1.setTime(data1);
                   
                   Date data2 = df.parse("01/03/2015");
                   calendario2.setTime(data2);
                   
                   long diaData1 = calendario1.getTimeInMillis();
                   long diaData2 = calendario2.getTimeInMillis();
                   long dif = (diaData2 - diaData1) / MILI_SEGUNDOS_POR_DIA;
                   
                   calendario2.add(Calendar.DAY_OF_YEAR, 30);
                   
                   Date trinta = calendario2.getTime();
                   Date data3 = df.parse("31/12/2014");
                   calendario3.setTime(data3);
                   calendario4.setTime(data3);
                   calendario3.add(Calendar.DAY_OF_YEAR, 1);
                   calendario4.roll(Calendar.DAY_OF_YEAR, 1);
                   
                   Date dia1 = calendario3.getTime();
                   Date dia2 = calendario4.getTime();
                   
                   taTexto.setText("Data 1 = " + df.format(data1) 
                           + "\nData 2 = " + df.format(data2) 
                           + "\nDiferenca de dias = " + (dif) 
                           + "\n30 dias apos Data 2 = " + df.format(trinta) 
                           + "\nDia primeiro com add = " + df.format(dia1) 
                           + "\nDia primeiro com roll = " + df.format(dia2));
                   
               } catch (ParseException erro) {
                   
                   JOptionPane.showMessageDialog(null, "Data Inválida " + erro.getErrorOffset());
                   
               }
           
           }
       });
        
    }
    
}
