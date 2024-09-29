package Exercicios3;

import java.util.Scanner;
public class Exercicio3$11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        
        System.out.print("Número 1:");
        num1 = Integer.parseInt(scan.nextLine());
    
        System.out.print("\nNúmero 2:");
        num2 = Integer.parseInt(scan.nextLine());


        if(num1>num2){
            for(int num=num1; num>=num2; num-- ){
                System.out.print(num + " ");
            }
        }
        else{
            for(int num=num1; num<=num2; num++){
                System.out.print(num + " ");
            }
        }
    
        scan.close();
    }
}
