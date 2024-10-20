

import java.util.Scanner;
public class Exercicio4$5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int buscarNumero;
        int qntNumArray = 0;

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\nArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
            
        }
        System.out.printf("\nBuscar por:");
        buscarNumero = Integer.parseInt(scan.nextLine());

        for(int i=0; i<array.length; i++ ){

            if(array[i]==buscarNumero){
            
                qntNumArray++;
            }
            
            else{
            
            }
            
        }


        if(qntNumArray==1){
            System.out.printf("\nO array tem %d ocorrencia do valor %d.", qntNumArray, buscarNumero);
        }
        else if(qntNumArray>1){
            System.out.printf("\nO array tem %d ocorrencias do valor %d.", qntNumArray, buscarNumero);
        }
        else{
            System.out.printf("\nO array nao contem o valor %d.", buscarNumero);
        }
        


        scan.close();
    }    
}

