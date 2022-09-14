
package exerciciosoptionpg;

import javax.swing.JOptionPane;

public class Exerciciosoptionpg {

    public static void main(String[] args) {
        int op = 0;
        
        do{
          String x = JOptionPane.showInputDialog(null,"Selecione o exercício:\n 1 - Media Aluno \n 2 - Dizímo \n 3 - Juntar Palavras \n 4 - Operações Matemágicas \n 5 - Sairrrrr ", "Opções", -1);
            op = Integer.parseInt(x);
            
            if (op == 1){
        double media = 0;
      
     String nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
      
     String valor = JOptionPane.showInputDialog(null,"Digite uma nota do primeiro Bimeste: ");
     int n1 = Integer.parseInt(valor);
     
     valor = JOptionPane.showInputDialog(null,"Digite uma nota do segundo Bimeste: ");
     int n2 = Integer.parseInt(valor);
     
     valor = JOptionPane.showInputDialog(null,"Digite uma nota do terceiro Bimeste: ");
     int n3 = Integer.parseInt(valor);
     
     media = (n1 + n2 + n3) / 3;
     
     JOptionPane.showMessageDialog(null,"Olá! "+ nome + " sua média é : "+ media,"Juizo Final" ,2);
            }else if (op == 2){
            String valor = JOptionPane.showInputDialog(null,"Um valor: ");
                double real = Double.parseDouble(valor);
                
                double dez= 0;
                dez = real * 0.10;
                JOptionPane.showMessageDialog(null,"10% de  "+ real + "  é "+ dez,"Dizímo" ,3);
                
            }else if (op == 3){
                String t1 = JOptionPane.showInputDialog(null,"Digite Algo: ");
                String t2 = JOptionPane.showInputDialog(null,"Digite Algo de novo: ");
                String t3 = JOptionPane.showInputDialog(null,"Digite Algo a ultima vez: ");
                
                JOptionPane.showMessageDialog(null, t1 + " " + t2 + " " + t3);
            }else if (op == 4){
            String valor = JOptionPane.showInputDialog(null,"Digite um valor: ");
                 int n1 = Integer.parseInt(valor);
     
             valor = JOptionPane.showInputDialog(null,"Digite outro valor: ");
                int n2 = Integer.parseInt(valor);
                
                JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1+n2) +
                "\n" + n1 + " * " + n2 + " = " + (n1*n2) +
                "\n" + n1 + " % " + n2 + " = " + (n1/n2) +
                "\n" + n1 + " - " + n2 + " = " + (n1-n2));
            }else if (op == 5){
            JOptionPane.showMessageDialog(null, "Saindo...", "IXI BOY", 2);
            }else{
            JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro_404", 0);
            } 
    
    
    }while (op !=5);
}
}
