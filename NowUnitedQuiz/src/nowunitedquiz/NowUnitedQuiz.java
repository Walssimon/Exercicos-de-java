
package nowunitedquiz;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.swing.JOptionPane;


public class NowUnitedQuiz {

   
    public static void main(String[] args) {
     int op = 1;
     int ponto = 0;
  

           String result = JOptionPane.showInputDialog(null,"Quantos  membros tem o now United atualmente (2022)?"
                   + "\n a)13 \nb)16 \nc)15 \nd)18 ","Pergunta 1",-1);
                   String resulta = result.toUpperCase();
                
                    if ("d".equals(result)){
                   ponto = ponto + 1;
                }
              

                result = JOptionPane.showInputDialog(null,"Quem é o nome do menbro brasileiro(a)?"
                   + "\n a)Any \nb)Sofya \nc)Alex \nd)Sabina ","Pergunta 2",-1);
                resulta = result.toUpperCase();
                if ("a".equals(result)){
                    ponto = ponto + 1;
                }
                

                result = JOptionPane.showInputDialog(null,"Qual membro é brigado com Bailey May?"
                   + "\n a)Cristhian \nb)Josh \nc)Lamar \nd)Noah ","Pergunta 3",-1);
                resulta = result.toUpperCase();
                if ("c".equals(result)){
                    ponto = ponto + 1;
                }
            
               result = JOptionPane.showInputDialog(null,"Qauntos membros originais o Now United tem?"
                   + "\n a)14 \nb)12 \nc)16 \nd)10 ","Pergunta 4",-1);
               resulta = result.toUpperCase();
                if ("a".equals(result)){
                    ponto = ponto + 1;
                }

                result = JOptionPane.showInputDialog(null,"Qual o nome do empresario que criou o Now United?"
                   + "\n a)Simon Fuller \nb)Simon Cowell \nc)Simon Civil \nd)Simon o Super Coelho ","Pergunta 5",-1);
                resulta = result.toUpperCase();
                if ("a".equals(result)){
                    ponto = ponto + 1;
                }
                              result = JOptionPane.showInputDialog(null,"Qual o nome do menbro número N°16?"
                   + "\n a)Hina \nb)Savanna \nc)Alex \nd)Nour ","Pergunta 6",-1);
                              resulta = result.toUpperCase();
                if ("d".equals(result)){
                    ponto = ponto + 1;
                }
       
                result = JOptionPane.showInputDialog(null,"Quem é o membro mais velho?"
                   + "\n a)Sabina \nb)Sina \nc)Heyoon \nd)Josh ","Pergunta 7",-1);
                resulta = result.toUpperCase();
                if ("c".equals(result)){
                    ponto = ponto + 1;
                }

                result = JOptionPane.showInputDialog(null,"Qual a primeira musica do Now United"
                   + "\n a)Ikou \nb)When you love somebody \nc)Better \nd)Summer in the city ","Pergunta 8",-1);
                resulta = result.toUpperCase();
                if ("d".equals(result)){
                    ponto = ponto + 1;
                }

                result = JOptionPane.showInputDialog(null,"Qual é a musica com mais view?"
                   + "\n a)Summer in the city \nb)Hoops \nc)How Would Tink That Love \nd)Like That ","Pergunta 9",-1);
                resulta = result.toUpperCase();
                if ("c".equals(result)){
                    ponto = ponto + 1;
                }
 
                result = JOptionPane.showInputDialog(null,"Qual o nome do finado Flamingo do Josh?"
                   + "\n a)Dolcé \nb)Steven \nc)Dave \nd)Jeremy ","Pergunta 10",-1);
                resulta = result.toUpperCase();
                if ("d".equals(result)){
                    ponto = ponto + 1;
                }

                if (ponto <= 4){
                 JOptionPane.showMessageDialog(null,"VOCÊ NÃO DOMINA O ASSUNTO " + ponto);
                         }else if(ponto <= 6) {
                             JOptionPane.showMessageDialog(null,"CONHECIMENTO BÁSICO SOBRE O ASSUNTO " + ponto);    
                         }else if (ponto <=9){
                             JOptionPane.showMessageDialog(null,"QUASE UM MESTRE " + ponto);
                         }else {
                            JOptionPane.showMessageDialog(null,"PARABÉNS VOCÊ TEM PROFUNDOS CONHECIMENTOS SOBRE O ASUNTO " + ponto);
                         }

    }
    
}
