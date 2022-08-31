
package exerciciowhile4;

import java.util.Scanner;

public class Exerciciowhile4 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int quant = 1;
        int val = 0;
        
        System.out.println("Quantas vezes quer que repita? ");
        quant = grava.nextInt();
        
        while (quant != val){
        System.out.println("Isso é um teste");
        val= val + 1;
    }
    }
    
}
