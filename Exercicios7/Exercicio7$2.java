import java.util.Scanner;

public class Exercicio7$2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        double raio;

        System.out.printf("Raio:");
        raio = Double.parseDouble(scan.nextLine());
        
        System.out.printf("\nArea = %.2f", areaCirculo(raio));
        System.out.printf("\nCircunferencia = %.2f", circunferencia(raio));
        
        

        scan.close();
    }

    
    public static double areaCirculo(double raio){

        return 3.1416*raio*raio;
    }
    public static double circunferencia(double raio){

        return 2*3.1416*raio;
    }
}
