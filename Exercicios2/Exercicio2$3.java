// // Exercício 2.3:
// // Escreva um programa que peça para o usuário fornecer dois números inteiros. O programa deve
// // exibir esses dois números em ordem decrescente.
// // Arquivo com a solução: Exercicio2$3.java
// // Entrada
// // Entre com um numero: 7
// // Entre com outro numero: 2
// // Saída
// // Ordem decrescente: 7 >= 2
// // Entrada
// // Entre com um numero: -30
// // Entre com outro numero: 20
// // Saída
// // Ordem decrescente: 20 >= -30
// // Entrada
// // Entre com um numero: 4
// // Entre com outro numero: 4
// // Saída
// // Ordem decrescente: 4 >= 4

import java.util.Scanner;

public class Exercicio2$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int num2;

        System.out.print("Entre com um número:");
        num = Integer.parseInt(scan.nextLine());

        System.out.print("\nEntre com outro número:");
        num2 = Integer.parseInt(scan.nextLine());

        if(num<=num2){
            System.out.print("Ordem decrescente: " + num2 + " >= " +num);
        }
        else{
            System.out.print("Ordem decrescente: " + num + " >= " +num2);
        }


        scan.close();
    }
}
