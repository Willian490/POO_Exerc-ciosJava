/*
 * Exercício 1.9:
Escreva um programa que peça para o usuário fornecer os valores da base e da altura de um
triângulo em uma unidade arbitrária. Os valores devem ser números inteiros. O programa deve
calcular o valor da área desse triângulo. O resultado deve ser armazenado em uma variável. No final,
o programa deve exibir ao usuário o valor obtido. Lembrando que:
• A =
bh
2
• Onde:
– A é a área do triângulo;
– b é o valor da base do triângulo;
– h é o valor da altura do triângulo
 */


import java.util.Scanner;


public class Exercicio1$9 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        int a;
        int b;
        int h;

        System.out.println("Insira a base do triângulo:");
        b = Integer.parseInt(scan.nextLine());

        System.out.println("Insira a altura do triângulo:");
        h = Integer.parseInt(scan.nextLine());
        
        a = (b*h)/2;

        System.out.printf("\n Area = %d", a);

        scan.close();
    }
}
