

import java.util.Scanner;
public class Exercicio4$12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] array = new int[5];    
    
        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
            
        }
                
        for(int i=0; i<array.length-1; i++ ){
            

            array[i] = array[i+1];
            
            System.out.printf("\narray[%d] = %d", i, array[i]);
        
        }
        
        scan.close();
    }    
}

