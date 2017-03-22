
package cap06;

/**
 *
 * @author tiago
 */
public class MetodosComRetorno {
    
    public static void main(String[] args) {
        
        System.out.println(MetodosComRetorno.somar(2, 3));
        System.out.println(MetodosComRetorno.mostrarPares(100));
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(3));
        System.out.println(MetodosComRetorno.contarLetrasA("Banana"));
        
    }
    
    public static double somar(double a, double b) {
        
        return a + b;
        
    }
    
    public static String mostrarPares(int valor) {
        
        String retorno = "";
        
        for (int a = 0; a <= valor; a = a + 2) {
            retorno += a + " ";
        }
        
        return retorno;
        
    }
    
    public static String mostrarDiaPorExtenso(int dia) {
        
        String extenso = "Domingo";
        
        switch (dia) {
            case 2: return extenso = "Segunda";
            case 3: return extenso = "Terça";
            case 4: return extenso = "Quarta";
            case 5: return extenso = "Quinta";
            case 6: return extenso = "Sexta";
            case 7: return extenso = "Sábado";
            default: return extenso;
        }
        
    }
    
    public static int contarLetrasA(String palavra) {
        
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        
        for (int a = 0; a < palavra.length(); a++) {
            
            if (palavra.charAt(a) == 'A') {
            
                quantidade++;
            
            }
            
        }
        
        return quantidade;
        
    }
    
}
