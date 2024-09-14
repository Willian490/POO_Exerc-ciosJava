 import java.util.Scanner;

 public class Exercicio1$17 {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
 
         double B;        
         double b;
         double h;
         double A;    
 
         System.out.println("Informe o valor da base maior do trapézio:");
         B = Double.parseDouble(scan.nextLine());
         
         System.out.println("\nInforme o valor da base menor do trapézio:");
         b = Double.parseDouble(scan.nextLine());
 
         System.out.println("\nInforme o valor da altura do Trapézio:");
         h = Double.parseDouble(scan.nextLine());
 
         A = ((B+b)*h)/2;
         
         System.out.printf("\nArea = %.2f", A);
         
         
         
         
 
         scan.close();
     }
 }
 