

import java.util.Scanner;
public class Exercicio4$9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int[] arrayTransposta = new int[5];    
        int d=4;

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());

            arrayTransposta[d] = array[i];    

            d--;
        }

        System.out.printf("\n\tArray Inversa:");

        for(int i=0; i<array.length; i++ ){
            
            System.out.printf("\n\tarrayInv[%d] = %d",i, arrayTransposta[i]);
        }


        scan.close();
    }    
}

