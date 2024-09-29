package Exercicios3;

import java.util.Scanner;
public class Exercicio5$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Forneça um número maior ou igual a 0:");
        num = Integer.parseInt(scan.nextLine());

        if(num>=0){
            for(int i=0; i<=num; i++){
                System.out.print(i + " ");
            }
        }
        
        else{
            System.out.println("Valor incorreto (negativo)");
        }

        

        scan.close();
    }
}
