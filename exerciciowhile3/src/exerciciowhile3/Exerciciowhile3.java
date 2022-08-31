
package exerciciowhile3;

import java.util.Scanner;


public class Exerciciowhile3 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int resp= 1; 
        int cont = 0;
        int result= 0;
        int med= 0;
        
        while (resp == 1){
        System.out.println("Insira a idade de um aluno: ");
            int idade = grava.nextInt();
         System.out.println("Quer cadastrar outro? \n(1/sim)(0/Não)");
            resp = grava.nextInt();
         cont++;
         result = idade + result;
        }
        med = result / cont;
        System.out.println("A média da idade dos alunos é " + med);
    }
}
