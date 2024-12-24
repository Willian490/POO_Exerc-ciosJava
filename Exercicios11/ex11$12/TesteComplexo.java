import java.util.Scanner;

public class TesteComplexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Complexo 1:");
        System.out.print("Parte real: ");
        double real1 = scan.nextDouble();
        System.out.print("Parte imaginária: ");
        double imaginario1 = scan.nextDouble();

        Complexo complexo1 = new Complexo(real1, imaginario1);

        
        System.out.println("Complexo 2:");
        System.out.print("Parte real: ");
        double real2 = scan.nextDouble();
        System.out.print("Parte imaginária: ");
        double imaginario2 = scan.nextDouble();

        Complexo complexo2 = new Complexo(real2, imaginario2);

        
        Complexo soma = complexo1.somar(complexo2);
        Complexo subtracao = complexo1.subtrair(complexo2);
        Complexo multiplicacao = complexo1.multiplicar(complexo2);

        
        System.out.println(complexo1 + " + " + complexo2 + " = " + soma);
        System.out.println(complexo1 + " - " + complexo2 + " = " + subtracao);
        System.out.println(complexo1 + " * " + complexo2 + " = " + multiplicacao);

        scan.close();
    }
}
