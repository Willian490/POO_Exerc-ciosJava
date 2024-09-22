// Exercício 2.6:
// Escreva um programa que peça para o usuário fornecer um número decimal. Se esse número
// for maior que 20, imprimir sua metade, caso contrário, imprimir seu triplo. Formate a saída dos
// númerosdecimais usando2casasdeprecisão.
// Arquivocomasolução:Exercicio2$6.java
// Entrada
// Entre com um valor: 33.5
// Saída
// A metade de 33.50 e 16.75
// Entrada
// Entre com um valor: 9.5
// Saída
// O triplo de 9.50 e 28.50

import java.util.Scanner;
public class Exercicio2$6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1;
        double metade;
        double triplo;

        System.out.print("Insira o n1:");
        n1 = Double.parseDouble(scan.nextLine());

        if(n1>20){
            metade = n1/2;
            System.out.printf("\nA metade de %.2f e %.2f",n1, metade );
        }
        else{
            triplo = n1*3;
            System.out.printf("\nO triplo de %.2f e %.2f",n1, triplo );
        }

        
        scan.close();
    }
}
