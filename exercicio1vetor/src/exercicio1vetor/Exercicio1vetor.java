
package exercicio1vetor;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio1vetor {

    public static void main(String[] args) {
        int [] valor1 = new int[5];
        Random gera = new Random(); 
        String total = "";
        
        for (int c = 0; c <=4; c++){
            valor1[c] = gera.nextInt(80);
            total = total + valor1[c] + " | ";            
        }            
        JOptionPane.showMessageDialog(null, total);
    }
    
}
