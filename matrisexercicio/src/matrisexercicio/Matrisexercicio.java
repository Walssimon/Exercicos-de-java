
package matrisexercicio;

import javax.swing.JOptionPane;

public class Matrisexercicio {

    
    public static void main(String[] args) {
        int [][] m = new int [2][2];
        int [][] n = new int [2][2];
        int [][] dif = new int [2][2];
        int [][] mult = new int [2][2];
        int [][] soma = new int [2][2];
        String total1 = "",total2 = "",total3 = "";
        
        for (int l = 0; l < 2 ; l++){
            for (int c = 0 ; c < 2; c++){
            String x = JOptionPane.showInputDialog(null,"Insira um numero da linha " + l + " e da coluna " + c + " da matris M");
            m[l][c] = Integer.parseInt(x);            
            }
        }
         for (int l = 0; l < 2 ; l++){
            for (int c = 0 ; c < 2; c++){
            String x = JOptionPane.showInputDialog(null,"Insira um numero da linha " + l + " e da coluna " + c + " da matris N");
            n[l][c] = Integer.parseInt(x);            
            }
        }       
        for(int l = 0; l < 2; l++){
        for(int c = 0; c < 2; c++){
        dif[l][c] = m[l][c] - n[l][c];
        mult[l][c] = m[l][c] * n[l][c];
        soma[l][c] = m[l][c] + n[l][c];
        total1 = total1 + dif[l][c] +  " ";
        total2 = total2 + soma[l][c] + " ";
        total3 = total3 + mult[l][c] + " ";
        }
        total1 = total1 + "\n";
        total2 = total2 + "\n";
        total3 = total3 + "\n";
        }
        JOptionPane.showMessageDialog(null,"o resultado das operações é :" + "\n" + total1 + "\n" + total2 + "\n" + total3);
    
    }
    
}
