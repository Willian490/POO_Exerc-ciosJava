import java.util.Scanner;

public class Exercicio1$23 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        int anoAtual;          
        int anoNascimento;
        int idade;

        System.out.println("Ano de nascimento:");
        anoNascimento = Integer.parseInt(scan.nextLine()); 

        System.out.println("Ano atual:");
        anoAtual = Integer.parseInt(scan.nextLine()); 

        idade =  anoAtual - anoNascimento;
        
        System.out.printf("\nIdade aproximada: %d anos ",idade);


        
        scan.close(); // fechamento de objeto
    }
}
