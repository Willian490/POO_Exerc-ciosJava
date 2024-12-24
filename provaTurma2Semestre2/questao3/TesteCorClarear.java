import java.util.Scanner;

public class TesteCorClarear{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);        
        Cor c1;
    
        int cor1;
        int cor2;
        int cor3;

        System.out.println("Cor1:");
        cor1=Integer.parseInt(scan.nextLine());

        System.out.println("Cor2:");
        cor2=Integer.parseInt(scan.nextLine());

        System.out.println("Cor3:");
        cor3=Integer.parseInt(scan.nextLine());

        c1 = new Cor(cor1, cor2,cor3);

        System.out.print("Cor base: "+c1);
        
        Cor c2;

        c2 = c1.clarear();
        
        System.out.print("Cor clareada: "+c2);

        scan.close();

    }
}