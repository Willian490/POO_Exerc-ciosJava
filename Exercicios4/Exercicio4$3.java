
import java.util.Scanner;
public class Exercicio4$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        float[] array = new float[5];    
        float somaArray = 0;
        float multArray = 1;

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\nArray [%d]:", i);

            array[i] = Float.parseFloat(scan.nextLine());

            somaArray = array[i] + somaArray;
            multArray = array[i] * multArray;
        }

        System.out.printf("\nSomatorio: %.2f", somaArray);
        System.out.printf("\nProdutorio: %.2f", multArray);


        scan.close();
    }    
}
