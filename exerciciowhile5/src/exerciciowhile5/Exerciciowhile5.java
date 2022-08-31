
package exerciciowhile5;


public class Exerciciowhile5 {

    public static void main(String[] args) {
      int val1= 0;
      int val2= 0;
      int val3 = 1000;
      
      while (val2 != val3){
        val2++;
        val1 = val2 + val1;
        
        System.out.println(val1);
    }
    }
}
