
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int velop, veloc, media;
        
        System.out.println("Qual a velocidade que o carro estava? ");
        veloc = grava.nextInt();
        System.out.println("Qual a velocidade permitida na via? ");
        velop = grava.nextInt();
        
        media = veloc - velop ;
        
        if(media <= 0){
        System.out.println("T� andando numa vel� bacana, sem multa pra vc");
    } else if (media <= 10){
        System.out.println("T� andando numa vel� acima do esperado, R$80,00 conto de puni��o, pra voc� ficar esperto");
    } else if (media <= 39){
        System.out.println("T� andando numa vel� bem altinha, R$ 120,00 de multinha ae, vacil�o");
    } else{
        System.out.println("� o Toreto ? R$200,00 de multa, voc� n�o esta num filme dirige direito");
        

    
    }
    }
}

