package exercico2vetor;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercico2vetor {

   
    public static void main(String[] args) {
    
        double [] valor = new double [10];
        Random gera = new Random();
        String total = "";
        int cont = 0;
        double soma = 0;
        for (int c = 0; c <=9; c++){
            valor [c] = gera.nextInt (30) -20;
            total = total + valor [c] + " | ";
            
            if (valor[c] < 0) {
            cont++;
            }
            
            else {
            soma = soma + valor[c]; 
        }
        
        }
        
        JOptionPane.showMessageDialog(null, total + " \n Existem "+ cont +
        " numeros negativos" + "\n A soma dos seus valores é : " + soma);
    }
    
}
