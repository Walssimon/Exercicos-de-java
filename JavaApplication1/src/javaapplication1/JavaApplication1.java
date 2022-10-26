/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] valor = new String [5];
        
        int [] valor1 = {34,78,23,90,21};
        
        double [] valor2 = {9.4,65,23,31};
        
        char [] valor3 = {'a','b','c','d','e'};
        
        String [] valor4 = {"a","b","c","d","e"};
        String total = "";        
         int [] valor5 = new int[5];
         
         for(int c=0; c<5 ; c++){
         
             String x = JOptionPane.showInputDialog(null,"Digite o valor " + (c+1));
             valor5 [c] = Integer.parseInt(x);
             total = total + valor5[c] + " | ";
         }
            JOptionPane.showMessageDialog(null, total);
            Random gera = new Random();
    
    valor5[c] = gera.nextInt(60);
    }
}