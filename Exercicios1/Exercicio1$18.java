
import java.util.Scanner;

public class Exercicio1$18 {
    public static void main(String[] args){
        Scanner scan = new  Scanner(System.in);

        double D;
        double d;
        double A;
        
        System.out.println("Diagonal maior:");
        D = Double.parseDouble(scan.nextLine());

        System.out.println("\nDiagonal menor:");
        d = Double.parseDouble(scan.nextLine());

        A = (D*d)/2;

        System.out.printf("\nArea = %.2f ", A);

        scan.close();
    }
}
