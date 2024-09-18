// Exercício 2.2:
// Escreva um programa que peça para o usuário fornecer dois números inteiros. O programa deve
// exibir esses dois números em ordem crescente.
// Arquivo com a solução: Exercicio2$2.java
// Entrada
// Entre com um numero: 7
// Entre com outro numero: 2
// Saída
// Ordem crescente: 2 <= 7
// Entrada
// Entre com um numero: -2
// Entre com outro numero: 9
// Saída
// Ordem crescente: -2 <= 9
// Entrada
// Entre com um numero: 4
// Entre com outro numero: 4
// Saída
// Ordem crescente: 4 <= 4

import java.util.Scanner;

public class Exercicio2$2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        int num;
        int num2;

        System.out.print("Entre com um número:");
        num = Integer.parseInt(scan.nextLine());

        System.out.print("\nEntre com outro número:");
        num2 = Integer.parseInt(scan.nextLine());

        if(num>num2){
            System.out.print("Ordem crescente: " + num2 + " <= " +num);
        }
        else{
            System.out.print("Ordem crescente: " + num + " <= " +num2);
        }


        scan.close();
    }
}
