
import java.util.Scanner;

public class Exercicio1$15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lado;
        double altura;
        double P;
        double A;

        System.out.print("Valor da largura do Retângulo:");
        lado = Double.parseDouble(scan.nextLine());

        System.out.print("Valor da altura do Retângulo:");
        altura = Double.parseDouble(scan.nextLine());
            
        P = (2*lado) + (2*altura);
        A = lado*altura;

        System.out.printf("\nPerimetro = %.2f", P);
        System.out.printf("\nArea = %.2f", A);        

        scan.close();

        

    }
}
