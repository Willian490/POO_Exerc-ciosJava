

import java.util.Scanner;
public class Exercicio3$13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int mult2 = 0;
        int mult3 = 0;
        int mult4 = 0;

        System.out.print("Número 1:");
        num1 = Integer.parseInt(scan.nextLine());
    
        System.out.print("\nNúmero 2:");
        num2 = Integer.parseInt(scan.nextLine());

        if(num2>num1){
            
            for(int num=num2; num>=num1; num-- ){
                
                if(num%2==0){
                    mult2 = mult2 + 1;
                }
                if(num%3==0){
                    mult3 = mult3 + 1;
                }
                if(num%4==0){
                    mult4 = mult4 + 1;
                }        
            }
            System.out.print("Multiplos de 2: " + mult2);
            System.out.print("\nMultiplos de 3: " + mult3);
            System.out.print("\nMultiplos de 4: " + mult4);
            
        }

        else{            
            for(int num=num1; num>=num2; num--){
                if(num%2==0){
                    mult2 = mult2 + 1;
                }
                if(num%3==0){
                    mult3 = mult3 + 1;
                }
                if(num%4==0){
                    mult4 = mult4 + 1;
                }        
            }
            System.out.print("Multiplos de 2: " + mult2);
            System.out.print("\nMultiplos de 3: " + mult3);
            System.out.print("\nMultiplos de 4: " + mult4);

        }    
        scan.close();
        
    }
}
