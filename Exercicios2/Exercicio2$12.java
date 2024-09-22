// Exercício 2.12:
// Escreva um programa que leia a idade de dois homens e duas mulheres, todos valores inteiros.
// Calcule e escreva a somadasidadesdohomemmaisvelhocomamulhermaisnovaeoproduto
// das idades do homemmaisnovocomamulhermaisvelha.
// Arquivocomasolução:Exercicio2$12.java
// Entrada
// Idade Homem 1: 20
// Idade Homem 2: 25
// Idade Mulher 1: 40
// Idade Mulher 2: 15
// Saída
// Idade homem mais velho + idade mulher mais nova: 40
// Idade homem mais novo * idade mulher mais velha: 800


import java.util.Scanner;

public class Exercicio2$12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int idadeM1;
        int idadeM2;
        int idadeH1;
        int idadeH2;  
        

        System.out.print("Idade Homem 1:");
        idadeH1 = Integer.parseInt(scan.nextLine());

        System.out.print("\nIdade Homem 2:");
        idadeH2 = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nIdade Mulher 1:");
        idadeM1 = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nIdade Mulher 2:");
        idadeM2 = Integer.parseInt(scan.nextLine());
        

        if(idadeH1>idadeH2){
            if(idadeM1<idadeM2){
                System.out.printf("\nIdade homem mais velho + idade mulher mais nova: %d",idadeH1+idadeM1);
                
                System.out.printf("\nIdade homem mais novo * idade mulher mais velha: %d",idadeH2*idadeM2);

                // Idade homem mais novo * idade mulher mais velha: 800

            }
            if(idadeM2<idadeM1){
                System.out.printf("\nIdade homem mais velho + idade mulher mais nova: %d",idadeH1+idadeM2);
                
                System.out.printf("\nIdade homem mais novo * idade mulher mais velha: %d",idadeH2*idadeM1);
            }
            
        }
        else if(idadeH2>idadeH1){
            if(idadeM1<idadeM2){
                System.out.printf("\nIdade homem mais velho + idade mulher mais nova: %d",idadeH2+idadeM1);
                
                System.out.printf("\nIdade homem mais novo * idade mulher mais velha: %d",idadeH1*idadeM2);
            }
            if(idadeM2<idadeM1){
                System.out.printf("\nIdade homem mais velho + idade mulher mais nova: %d",idadeH2+idadeM2);
                
                System.out.printf("\nIdade homem mais novo * idade mulher mais velha: %d",idadeH1*idadeM1);
            }
            
        }

        scan.close();
    }
}

