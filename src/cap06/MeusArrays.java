
package cap06;

/**
 *
 * @author tiago
 */
public class MeusArrays {
    
    public static int getNumero(int[] lista1, int[] lista2, int numero) {
        
        boolean flag1 = false; 
        boolean flag2 = false;
        
        for (int i = 0; i < lista1.length; i++) {
            
            if (numero == lista1[i]) {
                
                flag1 = true;
                break;
                
            }
                
        }
        
        for (int i = 0; i < lista2.length; i++) {
            
            if (numero == lista2[i]) {
                
                flag2 = true;
                break;
                
            }
            
        }
        
        if ((flag1 && !flag2) || (!flag1 && flag2)) {
            
            return 1;
            
        } else if (flag1 && flag2) {
            
            return 2;
            
        }
            
        return 0;
        
    }
    
    public static int[] getLista(int tamanho) {
        
        int[] lista = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            
            lista[i] = (int)(Math.random() * 1000);
            
        }
        
        return lista;
            
    }
    
}
