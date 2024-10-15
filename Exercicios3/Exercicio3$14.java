

import java.util.Scanner;
public class Exercicio3$14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int somatorio = 0;

        System.out.print("Número 1:");
        num1 = Integer.parseInt(scan.nextLine());
    
        System.out.print("\nNúmero 2:");
        num2 = Integer.parseInt(scan.nextLine());


        if(num2>num1){
            for(int num=num1; num<=num2; num++ ){
                somatorio = num + somatorio;
                

              
            }
            System.out.print("\nSomatorio entre " + num1 + " e " + num2 + ": " +somatorio);
        }
        else{
            for(int num=num2; num<=num1; num++){
                somatorio = num + somatorio;
            }
            System.out.print("\nSomatorio entre " + num2 + " e " + num1 + ": " +somatorio);
        }
    
        scan.close();
    }
}
