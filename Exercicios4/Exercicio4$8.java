

import java.util.Scanner;
public class Exercicio4$8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int[] arrayPares = new int[5];
        int qntPar=0;
        int[] arrayImpares = new int[5];        
        int qntImpar=0;

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\tArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());

            if(array[i]%2==0){
                arrayPares[i] = array[i];
                qntPar++;
            }
            else{
                arrayImpares[i] = array[i];
                qntImpar++;
            }            
        }

        System.out.print("\nNumeros pares:");
        for(int i=0; i<array.length; i++ ){
         
            if(qntPar>0){
                if(array[i]%2==0){
                    System.out.printf(" %d", arrayPares[i]);
                    
                }
            } 
            else{
                System.out.print(" nao ha.");
                i=5;
            }                    
        }

        if(qntPar>0){        
            System.out.printf(".");                          
        } 




        System.out.print("\nNumeros impares:");
        for(int i=0; i<array.length; i++ ){
         
            if(qntImpar>0){
                if(array[i]%2!=0){
                    System.out.printf(" %d", arrayImpares[i]);                    
                }
            } 
            else{
                System.out.print(" nao ha.");

                i=5;
            }                    
        }


        if(qntImpar>0){        
            System.out.printf(".");                          
        } 


        scan.close();
    }    
}

