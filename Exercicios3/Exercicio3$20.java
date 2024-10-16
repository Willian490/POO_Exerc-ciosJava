
 import java.util.Scanner;
 public class Exercicio3$20 {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
 
       
        for(int x=0; x<5; x++){
            System.out.print("\n");
             
            for(int d=0; d<=x; d++){
                System.out.print("*");
            }
        }

        System.out.print("\n");
        
        
        for(int x=4; x>=0; x--){
            System.out.print("\n");
             
            for(int d=0; d<=x; d++){
                System.out.print("*");
            }
        }


        System.out.print("\n");
        System.out.print("\n");
        
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--){
                if (j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.print("\n");
    
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= 1; j--){
                if (j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        scan.close();


    }
 }
 