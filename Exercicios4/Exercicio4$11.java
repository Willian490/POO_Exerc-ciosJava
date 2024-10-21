

import java.util.Scanner;
public class Exercicio4$11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x=0;
        int valor;

        do{
            System.out.print("\nQuantidade de elementos (1 a 9):");
            x = Integer.parseInt(scan.nextLine());

            if(x<=0 || x>9){
                System.out.println("\nQuantidade incorreta, forneca novamente!");
            }

        }while(x<=0 || x>9);

        int[] array = new int[x+1];    
    
       
        for(int i=0; i<array.length - 1; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
            
        }
                
        System.out.print("\nValor que sera inserido:");
        valor = Integer.parseInt(scan.nextLine());

        for(int i=array.length-1; i>=0; i-- ){
                       
            if(i>0){    
                array[i] = array[i-1];

            }
        
            if(i==0){
                array[i] = valor;
            }
            
        }

        for(int i=0; i<array.length; i++){
            System.out.printf("\narray[%d] = %d",i,array[i]);
        }



        scan.close();
    }    
}

