package Exercicios3;

import java.util.Scanner;
public class Exercicio9$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Tabuada do Número:");
        num = Integer.parseInt(scan.nextLine());
    
        for(int i=0; i<=10; i++){
            System.out.print("\n"+ num + " x "+ i + " = " + i*num);
        }
    
        scan.close();
    }
}
