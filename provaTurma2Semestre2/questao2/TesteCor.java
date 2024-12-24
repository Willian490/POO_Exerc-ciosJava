
import java.util.Scanner;
public class TesteCor{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int cor1, cor2,cor3;
        
        System.out.println("Cor1:");
        cor1=Integer.parseInt(scan.nextLine());

        System.out.println("Cor2:");
        cor2=Integer.parseInt(scan.nextLine());;

        System.out.println("Cor3:");
        cor3=Integer.parseInt(scan.nextLine());;         

        Cor c = new Cor(cor1, cor2, cor3);
        System.out.println(c);                   
        
         scan.close();
    }
}