
package Model;

import javax.swing.JOptionPane;


public class Tela_DAO {
public static String nome;
public static void soliciteoperacao(){
   nome = JOptionPane.showInputDialog(null,"Adição (1) \nSubtração (2) \nMultiplicação (3) \nDivisão (4) \nSair (5) ","solicite Operação",1);
   //String x2=x.toLowerCase(); Minusculo
   //String x2=x.toUpperCase(); Maiusculo
   
   int valor = Integer.parseInt(nome);
   if (valor == 1){
       Model.Classex_DAO.Soma();
   }else if (valor == 2){
       Model.Classex_DAO.Sub();
   }else if (valor == 3){
       Model.Classex_DAO.Mult();
   }else if (valor == 4){
       Model.Classex_DAO.Div();
   }else if (valor == 5){
      JOptionPane.showMessageDialog(null, "Tchal!!!","Sair",1); 
   }else {
   JOptionPane.showMessageDialog(null, "Opção Inválida","Error",-1);
   Model.Tela_DAO.soliciteoperacao();
   }
}
}
