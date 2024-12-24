
import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  

        Empregado e1 = new Empregado(null, null, 0);

        System.out.println("Nome:");
        e1.setNome(scan.nextLine());

        System.out.println("Sobrenome:");
        e1.setSobrenome(scan.nextLine());

        System.out.println("Salário:");
        e1.setSalariomensal(Double.parseDouble(scan.nextLine()));

        e1.realizarReducao();
        
        System.out.println(e1);

        scan.close();
    }
}
