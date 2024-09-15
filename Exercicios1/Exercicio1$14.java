import java.util.Scanner;

public class Exercicio1$14{
    
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        

        double lado;
        double perimetro;
        double area;

        System.out.print("Digite um número:");
        lado = Double.parseDouble(scan.nextLine());

        perimetro = lado*4;
        area = lado *lado;

        System.out.printf("Perimetro = %.2f\n", perimetro);
        System.out.printf("Area = %.2f ", area);

        scan.close();

    }
}