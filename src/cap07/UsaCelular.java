
package cap07;

/**
 *
 * @author tiago
 */
public class UsaCelular {
    
    public static void main(String[] args) {
        
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
        celular1.numero = "11 5431-2342";
        celular2.numero = "11 9123-5678";
        celular3.numero = "11 5765-3897";
        Celular.empresa = "Empresa Genérica do Brasil";
        System.out.println(celular1.numero + " " + celular1.empresa);
        System.out.println(celular2.numero + " " + celular2.empresa);
        System.out.println(celular3.numero + " " + celular3.empresa);
        
    }
    
}
