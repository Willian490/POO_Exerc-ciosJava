/*
 * Exercício 1.10:
Escreva um programa que peça para o usuário fornecer os valores da base maior, da base menor
e da altura de um trapézio em uma unidade arbitrária. Os valores devem ser números inteiros. O
programa deve calcular o valor da área desse trapézio. O resultado deve ser armazenado em uma
variável. No final, o programa deve exibir ao usuário o valor obtido. Lembrando que:
• A =
(B +b)h
2
• Onde:
– A é a área do trapézio;
– B é o valor da base maior do trapézio;
– b é o valor da base menor do trapézio;
– h é o valor da altura do trapézio.
Arquivo com a solução: Exercicio1$10.java
Entrada
Valor da base maior: 10
Valor da base menor: 6
Valor da altura: 5
Saída
Area = 40
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio1$10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int B;        
        int b;
        int h;
        int A;    

        System.out.println("Informe o valor da base maior do trapézio:");
        B = Integer.parseInt(scan.nextLine());
        
        System.out.println("\nInforme o valor da base menor do trapézio:");
        b = Integer.parseInt(scan.nextLine());

        System.out.println("\nInforme o valor da altura do Trapézio:");
        h = Integer.parseInt(scan.nextLine());

        A = ((B+b)*h)/2;
        
        System.out.printf("\nArea = %d", A);
        
        
        
        

        scan.close();
    }
}
