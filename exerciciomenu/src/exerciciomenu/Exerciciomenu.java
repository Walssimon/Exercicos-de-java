
package exerciciomenu;

import java.util.Scanner;


public class Exerciciomenu {

    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        int op= 0;
        do {
        System.out.println("Escolha o numero do Exercício : \n 1- Exercício 1"
                + " \n 2- Exercício 2 \n 3- Exercício 3 \n 4- Exercício 4 \n "
                + "5- Exercício 5 \n 6- Sair");
        op = grava.nextInt();
        
        if (op == 1){
            double fire=50;
            double cel =0;
            
            for(fire = 50; fire <= 150; fire++){
             cel = 5*(fire-32)/9;
            System.out.println(fire +"°F Fahrenheit é igual " + cel + "°C Celsius");
            }
        }else if (op == 2){
          String nome= "";
          int idade = 0;
          int sexo = 0;
          int cont = 0;
        for(cont = 0; cont <=2; cont++){
        System.out.println("Digite um nome :");
        nome = grava.next();
        System.out.println("Digite a idade :");
        idade = grava.nextInt();
        System.out.println("Selecione o Sexo: \n 1-Mulher / 2-Homem");
        sexo = grava.nextInt();
            if (idade >= 21 && sexo == 2){
                System.out.println(nome);
            }
        }           
    }else if (op == 3){
        int sex = 0;
        int op2 = 2;
        int contt = 0;
       
        while(op2 == 2){
        System.out.println("Digite o sexo : \n 1- Mulher 2- Homem");
        sex = grava.nextInt();
        if (sex == 2){
        contt++;        
       }
        System.out.println("Você quer sair ? \n 1-Sim 2-Não");
        op2 = grava.nextInt();
        }
        System.out.println("foram " + contt + " Homens");
    }else if (op == 4){
        double pa = 5000000;
        double pb = 7000000;
        int ano = 0;
        while (pa < pb){
        pa = (pa * 0.03) + pa;
        pb = (pb * 0.02) + pb;
        ano++;
        }
        System.out.println("Durou " + ano + " anos para que um ultrapassase o outro.");
    }else if (op == 5){
       double jo = 1.50;
       double ma = 1.10;
       int ano = 0;
       
        while (ma < jo){
        jo = jo + 0.02;
        ma = ma + 0.03;
        ano++;
        }
        System.out.println("Demorou " + ano + " anos para que maria ficasse maior que o João.");
    }else if (op == 6){
    System.out.println("Saindo...");
}else{ 
System.out.println("Opção Inválida");
op = 0;
     }
        }while(op < 6);
}
}