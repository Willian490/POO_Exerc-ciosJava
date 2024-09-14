// Exercício 1.19:
// Escreva um programa que peça para o usuário fornecer o valor do raio de um círculo em uma
// unidade arbitrária. O valor deve ser um número decimal. O programa deve calcular os valores do
// diâmetro, da circunferência e da área desse círculo. O resultado de cada cálculo deve ser armazenado
// em uma variável. No final, o programa deve exibir ao usuário os valores obtidos. Lembrando que:
// • D = 2r
// • C = 2πr
// • A = πr
// 2
// • Onde:
// – D é o diâmetro do círculo;
// – C é a circunferência do círculo;
// – A é a área do círculo;
// – r é o valor do raio do círculo;
// – π é a constante matemática Pi. Para esse exercício, considere que π = 3.141592.
// Arquivo com a solução: Exercicio1$19.java
// Entrada
// Valor do raio do circulo: 10.5
// Saída
// Diametro = 21.00
// Circunferencia = 65.97
// Area = 346.36

import java.util.Scanner;
public class Exercicio1$19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double D;
        double C;
        double A;
        double r;
        double pi =3.141592 ;

        System.out.print("Raio:");
        r = Double.parseDouble(scan.nextLine());

        D = r*2;
        C = 2*pi*r;
        A = pi*r*r;

        System.out.printf("\nDiametro = %.2f", D);
        System.out.printf("\nCircunferencia = %.2f", C);
        System.out.printf("\nArea = %.2f", A);

        scan.close();

    }
}
