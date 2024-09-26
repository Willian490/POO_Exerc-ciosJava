package Exercicios3;

import java.util.Scanner;
public class Exercicio1$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i=1; i<6; i++){
            System.out.print("\n");
            for(int d=0; d<i; d++){
                System.out.print("*");
   
            }
        }

    
        scan.close();
    }
}
