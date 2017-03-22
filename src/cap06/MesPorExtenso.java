
package cap06;

/**
 *
 * @author tiago
 */
public class MesPorExtenso {
    
    public static String getMesPorExtenso(int mes, int idioma) {
        
        String mesExtenso = null;
        
        switch (mes) {
            case 1: 
            if (idioma == 1) {
                mesExtenso = "Janeiro";
            } else {
                mesExtenso = "January";
            }
            break;
            case 2:
                if (idioma == 1) {
                mesExtenso = "Fevereiro";
            } else {
                mesExtenso = "February";
            }
            break;
            case 3:
                if (idioma == 1) {
                mesExtenso = "Março";
            } else {
                mesExtenso = "March";
            }
            break;
            case 4:
                if (idioma == 1) {
                mesExtenso = "Abril";
            } else {
                mesExtenso = "April";
            }
            break;
            case 5:
                if (idioma == 1) {
                mesExtenso = "Maio";
            } else {
                mesExtenso = "May";
            }
            break;
            case 6:
            if (idioma == 1) {
                mesExtenso = "Junho";
            } else {
                mesExtenso = "June";
            }
            break;
            default:
                if (idioma == 1) {
                mesExtenso = "Mês desconhecido!";
            } else {
                mesExtenso = "Unknown month!";
            }
            break;
        }
        
        return mesExtenso;
        
    }
    
}
