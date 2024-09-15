// Exercício 1.26:
// Escreva um programa que peça para o usuário fornecer uma temperatura em graus Celsius. O
// programa deve calcular a temperatura correspondente em graus Fahrenheit. O resultado do cálculo
// deve ser armazenado em uma variável. No final, o programa deve exibir ao usuário o valor obtido.
// Lembrando que:
// • F = 1,8C +32
// • Onde:
// – F é a temperatura em graus Fahrenheit;
// – C é a temperatura em graus Celsius.
// Arquivo com a solução: Exercicio1$26.java
// Entrada
// Temperatura em graus Celsius: 36
// Saída
// 36.00 graus Celsius correspondem a 96.80 graus Fahrenheit


import java.util.Scanner;

public class Exercicio1$26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double C;
        double F;

        System.out.print("Temperatura em graus Celsius:");
        C = Double.parseDouble(scan.nextLine());

        F = (1.8*C) + 32;

        System.out.printf("\n%.2f graus Celsius correspondem a %.2f graus Fahrenheit", C,F);

        //125.00 graus Fahrenheit correspondem a 51.67 graus Celsius

        scan.close();
    }
}
