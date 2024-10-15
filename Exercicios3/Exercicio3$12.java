

import java.util.Scanner;
public class Exercicio3$12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int contaPares = 0;

        System.out.print("Número 1:");
        num1 = Integer.parseInt(scan.nextLine());
    
        System.out.print("\nNúmero 1:");
        num2 = Integer.parseInt(scan.nextLine());

        if(num1>num2){
            System.out.print("Numeros pares entre " + num2 + " e " + num1+ ": " );
            for(int num=num1; num>=num2; num-- ){
                
                if(num%2==0){
                    contaPares = contaPares+1;
                }
            }
            System.out.print(contaPares);
        }

        else{
            System.out.print("Numeros pares entre " + num1 + " e " + num2+ ": " );
            for(int num=num1; num<=num2; num++){
                if(num%2==0){
                    contaPares = contaPares+1;
                }
            }
            System.out.print(contaPares);
        }
    
        scan.close();
    }
}
