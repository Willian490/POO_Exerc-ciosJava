// Exercício 1.25:
// Escreva um programa que peça para o usuário fornecer uma temperatura em graus Fahrenheit. O
// programa deve calcular a temperatura correspondente em graus Celsius. O resultado do cálculo
// deve ser armazenado em uma variável. No final, o programa deve exibir ao usuário o valor obtido.
// Lembrando que:
// • C =
// F −32
// 1,8
// • Onde:
// – C é a temperatura em graus Celsius;
// – F é a temperatura em graus Fahrenheit.
// Arquivo com a solução: Exercicio1$25.java
// Entrada
// Temperatura em graus Fahrenheit: 125
// Saída
// 125.00 graus Fahrenheit correspondem a 51.67 graus Celsius


import java.util.Scanner;

public class Exercicio1$25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double C;
        double F;

        System.out.print("Temperatura em graus Fahrenheit:");
        F = Double.parseDouble(scan.nextLine());

        C = ((F-32)/1.8);

        System.out.printf("\n%.2f graus Fahrenheit correspondem a %.2f graus Celsius", F,C);

        //125.00 graus Fahrenheit correspondem a 51.67 graus Celsius

        scan.close();
    }
}
