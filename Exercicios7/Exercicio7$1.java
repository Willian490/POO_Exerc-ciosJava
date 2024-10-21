
import java.util.Scanner;

public class Exercicio7$1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      

        int[] numeros = new int[5];

        for(int i=0; i<numeros.length; i++){
            System.out.printf("\nn(%d):",i);
            numeros[i] = Integer.parseInt(scan.nextLine());            
        }

        absoluto(numeros);
        

        scan.close();
    }

    
    public static void absoluto(int[] n){

        

        for(int i=0; i<n.length; i++){

            if(n[i]<0){
                System.out.printf("absoluto(%d) = %d\n", n[i], n[i]*-1);
            }
            else{
                System.out.printf("absoluto(%d) = %d\n", n[i], n[i]);
            }

                    
        }
    
    }
}
