
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1=0;
        int n2=0;
        
        System.out.print("N1:");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("\nN2:");
        n2 = Integer.parseInt(scan.nextLine());


        

        if(n1>n2){
            System.out.printf("\nOrdem crescente: %d <= %d",n2,n1);
        }

        if(n2>n1){
            System.out.printf("\nOrdem crescente: %d <= %d",n1,n2);
        }

        if(n1==n2){
            System.out.printf("\nOrdem crescente: %d <= %d",n2,n1);
        }


        //Ordem crescente: 2 <= 7
        scan.close();
    }
}
