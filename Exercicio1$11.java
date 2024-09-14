/*Exercício 1.11:
Escreva um programa que peça para o usuário fornecer os valores da diagonal maior e da diagonal
menor de um losango em uma unidade arbitrária. Os valores devem ser números inteiros. O
programa deve calcular o valor da área desse losango. O resultado deve ser armazenado em uma
variável. No final, o programa deve exibir ao usuário o valor obtido. Lembrando que:
• A =
Dd
2
• Onde:
– A é a área do losango;
– D é o valor da diagonal maior do losango;
– d é o valor da diagonal menor do losango.
Arquivo com a solução: Exercicio1$11.java
Entrada
Valor da diagonal maior: 12
Valor da diagonal menor: 6
Saída
Area = 36 */

import java.util.Scanner;

public class Exercicio1$11 {
    public void main(String[] args){
        Scanner scan = new  Scanner(System.in);

        int D;
        int d;
        int A;
        
        System.out.println("Diagonal maior:");
        D = Integer.parseInt(scan.nextLine());

        System.out.println("\nDiagonal menor:");
        d = Integer.parseInt(scan.nextLine());

        A = (D*d)/2;

        System.out.print("\nArea = " + A);

        scan.close();
    }
}
