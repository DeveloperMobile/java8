
package cap07;

/**
 *
 * @author tiago
 */
public class UsaTelevisor {
    
    public static void main(String[] args) {
        
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(150);
        Televisor tv3 = new Televisor(150, 3);
        
        tv1.mostrar();
        tv2.mostrar();
        tv3.mostrar();
        
    }
    
}
