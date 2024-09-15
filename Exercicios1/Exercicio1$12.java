import java.util.Scanner;

public class Exercicio1$12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double valor;

        System.out.print("Entre com um valor qualquer:");
        valor = Double.parseDouble(scan.nextLine());

        System.out.printf("\n%f\n", valor);
        System.out.printf("%.2f\n", valor);
        System.out.printf("%.3f\n", valor);

        scan.close();
        
    }

}


