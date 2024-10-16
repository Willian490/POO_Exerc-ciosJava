
import java.util.Scanner;
public class Exercicio4$1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[5];    
        int[] arrayCubo = new int[5];

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\nArray [%d]:", i);

            array[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i=0; i<array.length; i++ ){
            
            arrayCubo[i] = array[i]*array[i]*array[i];
        }

        for(int i=0; i<array.length; i++ ){
            System.out.printf("\n\nArray Cubo[%d]:", i);
            System.out.printf("%d", arrayCubo[i]);
        }


        scan.close();
    }    
}
