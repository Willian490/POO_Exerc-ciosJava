package Exercicios3;

import java.util.Scanner;
public class Exercicio3$16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x1 = 1;
        int x2 = 0;
        int x3 = 0;
    
        x3 =  x1 + x2; 
        for(int i=0; i<20; i++){
            System.out.print(x3 + " ");

            x3 =  x1 + x2; 

            x2 = x1;
            x1 = x3;

            
        }
        scan.close();

    }
}
