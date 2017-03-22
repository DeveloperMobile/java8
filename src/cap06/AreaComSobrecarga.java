
package cap06;

/**
 *
 * @author tiago
 */
public class AreaComSobrecarga {
    
    public static void main(String[] args) {
        
        System.out.println("Área de um quadrado..." + calcularArea(3));
        System.out.println("Área de um retangulo.." + calcularArea(3, 2));
        System.out.println("Área de um cubo......." + calcularArea(3, 2, 5));
        
    }
        
    public static double calcularArea(int x) {
        return (x * x);
    }
    
    public static double calcularArea(int x, int y) {
        return (x * y);
    }
    
    public static double calcularArea(int x, int y, int z) {
        return (x * y * z);
    }
    
}
