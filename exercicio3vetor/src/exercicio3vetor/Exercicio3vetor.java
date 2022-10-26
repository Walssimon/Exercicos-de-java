
package exercicio3vetor;

import java.util.Random;
import javax.swing.JOptionPane;


public class Exercicio3vetor {

    
    public static void main(String[] args) {
     int [] valor = new int [5];
     Random gera = new Random ();
    String total = "";
    
     for (int c = 0; c <= 4; c++){
         valor [c] = gera.nextInt(30) -20;
         
         if (valor [c] >= 0){
         total = total + valor [c] + "  ";
         }
         
     }
     JOptionPane.showMessageDialog(null, total);
    }
    
}
