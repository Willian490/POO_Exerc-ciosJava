import java.util.Scanner;

public class Exercicio1$7{
    
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        

        int lado;
        int perimetro;
        int area;

        System.out.println("Digite um número:");
        lado = Integer.parseInt(scan.nextLine());

        perimetro = lado*4;
        area = lado *lado;

        System.out.printf("Perimetro = %d\n", perimetro);
        System.out.println("Area = " + area);

        scan.close();

    }
}