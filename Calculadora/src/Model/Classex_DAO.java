
package Model;

import javax.swing.JOptionPane;


public class Classex_DAO {
    public static double valor1= 0;
    public static double valor2= 0;
    public static String operacao= "";
    public static double res= 0;
    
    
    public static void Soma(){
    String val1 = JOptionPane.showInputDialog(null,"Insira seu Primeiro valor: ","Valor 1",-1);
    valor1 = Integer.parseInt(val1);
    val1 = JOptionPane.showInputDialog(null,"Insira seu Segundo valor: ","Valor 2",-1);
    valor2 = Integer.parseInt(val1);
    
    res = valor1 + valor2; 
    operacao ="Soma";
    
    JOptionPane.showMessageDialog(null,"O resultado da "+ operacao + " é " + res,"Resultado",1);
    Model.Tela_DAO.soliciteoperacao();
    }
    public static void Sub(){
    String val1 = JOptionPane.showInputDialog(null,"Insira seu Primeiro valor: ","Valor 1",-1);
    valor1 = Integer.parseInt(val1);
    val1 = JOptionPane.showInputDialog(null,"Insira seu Segundo valor: ","Valor 2",-1);
    valor2 = Integer.parseInt(val1);
    
    res = valor1 - valor2;
    operacao ="Subtração";
    JOptionPane.showMessageDialog(null,"O resultado da "+ operacao + " é " + res,"Resultado",1);
    Model.Tela_DAO.soliciteoperacao();
    }
    public static void Mult(){
    String val1 = JOptionPane.showInputDialog(null,"Insira seu Primeiro valor: ","Valor 1",-1);
    valor1 = Integer.parseInt(val1);
    val1 = JOptionPane.showInputDialog(null,"Insira seu Segundo valor: ","Valor 2",-1);
    valor2 = Integer.parseInt(val1);
    
    res = valor1 * valor2;
    operacao ="Multiplicação";
    JOptionPane.showMessageDialog(null,"O resultado da "+ operacao + " é " + res,"Resultado",1);
    Model.Tela_DAO.soliciteoperacao();
    }
    public static void Div(){
    String val1 = JOptionPane.showInputDialog(null,"Insira seu Primeiro valor: ","Valor 1",-1);
    valor1 = Integer.parseInt(val1);
    val1 = JOptionPane.showInputDialog(null,"Insira seu Segundo valor: ","Valor 2",-1);
    valor2 = Integer.parseInt(val1);
    res = valor1 / valor2;
    operacao ="Divisão";
    JOptionPane.showMessageDialog(null,"O resultado da "+ operacao + " é " + res,"Resultado",1);
    Model.Tela_DAO.soliciteoperacao();
    }
}
