
import java.util.Scanner;
public class Exercicio4$4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int buscarNumero;
        

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\nArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
            
        }
        System.out.printf("\nBuscar por:");
        buscarNumero = Integer.parseInt(scan.nextLine());

        for(int i=0; i<array.length; i++ ){

            if(array[i]==buscarNumero){
                System.out.printf("\nIndice %d: ACHEI",i);
            }
            
            else{
                System.out.printf("\nIndice %d: NAO ACHEI", i);
            }
            
        }
        


        scan.close();
    }    
}
