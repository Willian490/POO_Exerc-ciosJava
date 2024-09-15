/*
Exercício 1.13:

Primeiro numero: 7.5

Segundo numero: 3.5
Saída
7.50 + 3.50 = 11.00
7.50 - 3.50 = 4.00
7.50 * 3.50 = 26.25
7.50 / 3.50 = 2.14 */


import java.util.Scanner;

public class Exercicio1$13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double n1;
        double n2;
        double adicao;
        double subtracao;
        double multiplicacao;
        double divisao;

        System.out.print("Primeiro Número:");
        n1 = Double.parseDouble(scan.nextLine());


        System.out.print("\nSegundo Número:");
        n2 = Double.parseDouble(scan.nextLine());
        
        adicao = n1+n2;
        subtracao = n1-n2;
        multiplicacao = n1*n2;
        divisao = n1/n2;


        System.out.printf("\n%.2f + %.2f = %.2f", n1,n2, adicao);
        System.out.printf("\n%.2f - %.2f = %.2f", n1,n2, subtracao);
        System.out.printf("\n%.2f * %.2f = %.2f", n1,n2, multiplicacao);
        System.out.printf("\n%.2f / %.2f = %.2f", n1,n2, divisao);

        scan.close();
    }
}
