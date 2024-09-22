// Exercício 2.15:
// Escreva um programa que peça para o usuário fornecer sua idade em anos e que exiba a classe
// eleitoral, sem acentos, desse usuário, baseando-se nas seguintes regras:
// • Idadeabaixo de16anos:Naoeleitor;
// • Idademaiorouiguala18anosemenorouiguala65anos:Eleitorobrigatorio;
// • Idademaiorouigual a16anosemenorque18anosoumaiorque65anos:Eleitorfacultativo.
// Arquivocomasolução:Exercicio2$15.java
// Entrada
// Entre com sua idade: 18
// Saída
// Eleitor obrigatorio.
// Entrada
// Entre com sua idade: 29
// Saída
// Eleitor obrigatorio.
// Entrada
// Entre com sua idade: 15
// Saída
// Nao eleitor.
// Entrada
// Entre com sua idade: 17
// Saída
// Eleitor facultativo.
// Entrada
// Entre com sua idade: 70
// Saída
// Eleitor facultativo.

import java.util.Scanner;

public class Exercicio2$15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Entre com a sua idade:");
        idade = Integer.parseInt(scan.nextLine());

        if(idade<16){
            System.out.print("Nao eleitor.");
        }

        else if(idade>=18 && idade<=65){
            System.out.print("Eleitor obrigatorio.");
        }

        else if((idade>=16 && idade<18) || idade>65){
            System.out.print("Eleitor facultativo.");
        }

        scan.close();
    }    
}
