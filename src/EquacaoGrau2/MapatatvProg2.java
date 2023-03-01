
package EquacaoGrau2;

import java.util.Scanner;

public class MapatatvProg2 {
   private static int a, b, c;
   
   
 private  static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    
    }

   
    public static void main(String[] args) {
        
       
     Scanner scan = new Scanner(System.in);
        
        
      System.out.println("Digite o valor de 'a': ");
       a = scan.nextInt();
       

 while(a == 0){
             System.out.println("O valor de 'a' não pode ser igual a '0': ");
             System.out.println("Digite novamente um valor para 'a': " );
             a =  scan.nextInt();
             
         }
      System.out.println("Digite o valor de 'b' : ");
        b = scan.nextInt();
         
         
      System.out.println("Digite o valor de 'c' : ");
        c = scan.nextInt();
         
      System.out.println("Resolvendo Delta... ");
         
    try {
        double delta = calcularDelta(a, b, c);
    
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        
        System.out.println("O valor do delta é "+delta);
        System.out.println("A raiz  de x1 é: "+x1);
        System.out.println("A raiz de x2 é: "+x2);
    } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }

   }
}
