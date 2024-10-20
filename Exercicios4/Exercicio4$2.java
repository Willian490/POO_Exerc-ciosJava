
import java.util.Scanner;
public class Exercicio4$2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int[] arrayMultiplicado = new int[5];
        int multiplicar;

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\nArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.printf("\nMultiplicar por:");
        multiplicar = Integer.parseInt(scan.nextLine());

        
        for(int i=0; i<array.length; i++ ){
            
            arrayMultiplicado[i] = array[i]*multiplicar;
        }

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\narrayMult[%d] = ", i);
            System.out.printf("%d", arrayMultiplicado[i]);
        }


        scan.close();
    }    
}
