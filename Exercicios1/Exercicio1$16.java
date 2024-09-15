
 import java.util.Scanner;


 public class Exercicio1$16 {
     public static void main(String[] args){
         Scanner scan = new Scanner (System.in);
 
         double a;
         double b;
         double h;
 
         System.out.println("Insira a base do triângulo:");
         b = Double.parseDouble(scan.nextLine());
 
         System.out.println("Insira a altura do triângulo:");
         h = Double.parseDouble(scan.nextLine());
         
         a = (b*h)/2;
 
         System.out.printf("\n Area = %.2f", a);
 
         scan.close();
     }
 }
 