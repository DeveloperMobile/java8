
package cap10;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author tiago
 */
public class NovoManipulaData {
    
    public static void main(String[] args) {
        
        LocalDate nascimento = LocalDate.of(1960, Month.MARCH, 21);
        LocalDate morte = LocalDate.of(1994, Month.MAY, 1);
        Period periodo = Period.between(nascimento, morte);
        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        String dataHora = agora.format(dtf);
        System.out.println(dataHora);
        
        LocalDateTime hoje = LocalDateTime.now();
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(new Locale("pt", "br"));
        dataHora = hoje.format(dtf);
        System.out.println(dataHora);
        
        LocalDate dataAtual = LocalDate.now();
        LocalDate vencimento = dataAtual.plusDays(10);
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String novaData = vencimento.format(dtf);
        System.out.println(novaData);
        
        Instant inicio = Instant.now();
        for (int a = 0; a < 999999999; a++);
        Instant fim = Instant.now();
        System.out.println(inicio);
        System.out.println(fim);
        
        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilisegundos = duracao.toMillis();
        System.out.println(duracaoEmMilisegundos);
        
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoNY = ZoneId.of("America/New_York");
        ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
        ZonedDateTime agoraNY = ZonedDateTime.now(fusoNY);
        System.out.println(agoraSP);
        System.out.println(agoraNY);
        
    }
    
}
