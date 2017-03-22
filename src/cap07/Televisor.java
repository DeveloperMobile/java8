
package cap07;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Televisor {
    
    private int volume;
    private int canal;
    
    public Televisor() {
        
    }
    
    public Televisor(int volume) {
        
        this.volume = volume;
        
    }
    
    public Televisor(int volume, int canal) {
        
        this.volume = volume;
        this.canal = canal;
        
    }
        
    public void aumentarVolume() {
        
        if (volume < 100) {
            
            volume++;
            
        }
        
    }
    
    public void diminuirVolume() {
        
        if (volume > 0) {
         
            volume--;
            
        }
        
    }
    
    public void aumentarCanal() {
        
        if (canal < 1000) {
         
            canal++;
            
        }
        
    }
    
    public void reduzirCanal() {
        
        if (canal > 0) {
            
            canal--;
            
        }
        
    }
    
    public void mostrar() {
        
        JOptionPane.showMessageDialog(null, "Volume: " + getVolume()
                + "\nCanal: " + getCanal());
        
    }

    public int getVolume() {
    
        return volume;
    
    }

    public void setVolume(int volume) {
    
        try {
            
            if (volume >= 0 && volume <= 100) {
                
                this.volume = volume;
                
            } else {
                
                throw new Exception("Volume fora da faixa permitida, deve ser um valor entre 0 e 100.");
                
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
            
        }
            
    }

    public int getCanal() {
    
        return canal;
    
    }

    public void setCanal(int canal) {
    
        try {
            
            if (canal >=0 && canal <= 100) {
            
               this.canal = canal;
            
            } else {
                
                throw new Exception("Canal fora da faixa permitida, deve ser um valor entre 0 e 100.");
                
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
            
        }
    
    }
        
}
