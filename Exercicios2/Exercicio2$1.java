// Exercício 2.1:
// Escreva um programa que peça para o usuário fornecer um número inteiro. O programa deve exibir
// se o número fornecido é par ou ímpar.
// Arquivo com a solução: Exercicio2$1.java
// Entrada
// Entre com um numero: 19
// Saída
// O numero 19 e impar.
// Entrada
// Entre com um numero: 8
// Saída
// O numero 8 e par.

import java.util.Scanner;

public class Exercicio2$1{

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


        int num;

        System.out.print("Insira um valor:");
        num = Integer.parseInt(scan.nextLine());

        if(num%2==0){
            System.out.printf("\nO numero %d e par.", num);
        }

        else{
            System.out.printf("\nO numero %d e impar.", num);
        }
        scan.close();

    }
}
