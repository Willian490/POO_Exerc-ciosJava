

import java.util.Scanner;
public class Exercicio4$7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int[] array2 = new int[5];    
        int[] arraySoma = new int[5];    


        System.out.printf("\nForneça os valores do primeiro array:");

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
            
        }

        System.out.printf("\nForneça os valores do segundo array:");
        
        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array2[i] = Integer.parseInt(scan.nextLine());


            arraySoma[i] = array[i] + array2[i];
            
        }   
    

        System.out.printf("\n\nSoma dos arrays:");

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\narraySoma[%d] = %d", i, arraySoma[i]);            
        }   

        scan.close();
    }    
}

