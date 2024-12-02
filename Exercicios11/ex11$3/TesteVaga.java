
import java.util.Scanner;

public class TesteVaga{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Vaga v1 = new Vaga("OBA2A13",22);
        v1.getTaxa();

        
        System.out.println(v1);

        scan.close();
    }
}