/*Exercício 3.18:
 Escreva um programa que exiba o seguinte desenho usando, obrigatoriamente, a estrutura de
 repetição for. Você só pode utilizar as seguintes construções para gerar a saída:
 • System.
 out.print( "*" ) e
 •
 System.out.println()
 Arquivocomasolução:Exercicio3$18.java */

import java.util.Scanner;
public class Exercicio3$18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        for(int x=0; x<5; x++){
            System.out.print("\n");
            
            for(int d=0; d<=x; d++){
                System.out.print("*");
            }
        }

        scan.close();

    }
}
