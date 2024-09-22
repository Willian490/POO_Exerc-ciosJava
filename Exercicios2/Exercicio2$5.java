
import java.util.Scanner;

public class Exercicio2$5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int temp;

        System.out.print("Número 1:");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("Número 2:");
        n2 = Integer.parseInt(scan.nextLine());

        System.out.print("Número 3:");
        n3 = Integer.parseInt(scan.nextLine());

        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
            System.out.print("\n->>"+n1+","+n2+".");
        
        }
        if(n2>n3){
            temp=n2;
            n2=n3;
            n3=temp;
            System.out.print("\n->>"+n3+","+n2+".");
        }
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
            System.out.print("\n->>"+n1+","+n2+".");
        }
        
        System.out.printf("\n\n%d >= %d >= %d", n3,n2, n1);

        scan.close();
    }
}
