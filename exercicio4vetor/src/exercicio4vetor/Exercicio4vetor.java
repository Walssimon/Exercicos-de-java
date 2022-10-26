
package exercicio4vetor;

import java.util.Random;
import javax.swing.JOptionPane;


public class Exercicio4vetor {

    
    public static void main(String[] args) {
        int [] valor = new int[7];
        int result = 0;
        int result1 = 0;
        String total  = "", total1 = "", total2="", total3="";
        
        Random grava = new Random();
        for(int c = 0 ; c <6 ; c++){
        valor[c] = grava.nextInt(70);
        result = valor[c] % 2;
        result1 = valor[c] % 3;
        if (result == 0 && result1 == 0){
        total = total + valor[c] + "  ";
        }else if(result == 0){
        total1 = total1 + valor[c] + "  ";
        }else if (result1 == 0){
        total2 = total2 + valor[c] + "  ";
        } else {
        total3 = total3 + valor[c] + "  ";
        }
        
    }
    JOptionPane.showMessageDialog(null,"Numeros divisiveis por 2: " + total1 + 
            "\nNumeros divisiveis por 3: " + total2 + 
            "\nNumeros divisiveis por 2 e 3: " + total + "\nNumeros não divisiveis: " + total3);
}
}
