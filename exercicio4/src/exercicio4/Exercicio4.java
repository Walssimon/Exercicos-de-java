package exercicio4;

import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double sal, desc1, desc2, desc3, desc4, val1, val2, val3, val4;
        
        System.out.println("Quão é o seu salario?");
        sal = grava.nextDouble();
        
        desc1 = sal * 0.02;
        val1 = sal - desc1;
        desc2 = val1 * 0.06;
        val2 = val1 - desc2;
        desc3 = val2 * 0.07;
        //System.out.println(desc3);
        val3 = val2 - desc3;
     //   System.out.println(val3);
        
       System.out.println("Vc teve o desconto de " + desc1 + " Do VT \n" + " Inclui tambêm " + desc2 + " de VR \n " + " E por último "+ desc3 + " de Imposto de renda " );
        if ( val3 >= 1200){
            desc4 = val3 * 0.15;
            val4 = val3 - desc4;
            System.out.println("E com o desconto adicional do imposto de renda que é: " + desc4 + "\n" + " Meu chave, seu salario liquido é " + val4 + ", Dificil a vida do trabalhador.");
        }else {
            System.out.println("Seu Salario liquido é: " + val3);
        }
        
        
    }
    
}
