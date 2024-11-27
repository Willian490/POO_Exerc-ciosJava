
import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String nome;
        String sobrenome;
        double salario;

        System.out.println("\nNome:");
        nome = scan.nextLine();

        System.out.println("Sobrenome:");
        sobrenome = scan.nextLine();

        System.out.println("Salario:");
        salario = Double.parseDouble(scan.nextLine());

        Empregado e1 = new Empregado(nome,sobrenome,salario);

        System.out.print(e1);

        
        scan.close();
    }

}
