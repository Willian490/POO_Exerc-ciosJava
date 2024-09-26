// Exercício 2.17:
// Escreva um programa que peça para o usuário fornecer um número inteiro. Use um switch para
// verificar se o número é igual a 2, ou 4, ou 6, ou 8. Caso seja um desses números, exiba uma
// mensagem informando ao usuário o número que foi digitado. Caso não seja nenhum dos números
// esperados, informe o usuário que o valor inserido é inválido.


import java.util.Scanner;
public class Exercicio2$17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe um valor:");
        numero = Integer.parseInt(scan.nextLine());

        switch(numero){
            case 2:
                System.out.print("O valor fornecido foi "+numero+".");
            break;

            case 4:
                System.out.print("O valor fornecido foi "+numero+".");
            break;

            case 6:
                System.out.print("O valor fornecido foi "+numero+".");
            break;

            case 8:
                System.out.print("O valor fornecido foi "+numero+".");
            break;

            default:

            System.out.print("Valor invalido.");


            break;


        };


        scan.close();
    }
}
