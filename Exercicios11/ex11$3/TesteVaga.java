
import java.util.Scanner;

public class TesteVaga{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Vaga v1 = new Vaga("",0);
        

        System.out.println("Placa:");
        v1.placa=scan.nextLine();

        System.out.println("Quantidade de horas:");
        v1.qnthoras=Integer.parseInt(scan.nextLine());
        v1.getTaxa();

        System.out.println(v1);


        scan.close();
    }
}