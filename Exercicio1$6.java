import java.util.Scanner;

public class Exercicio1$6 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);

        int numero1;  
        int numero2;
        int adicao;
        int subracao;  
        int multiplicacao;  
        int divisao;
        
        System.out.println("Primeiro Número:");
        numero1 = Integer.parseInt(scan.nextLine()); //pega linha que deu enter, e guarda como inteiro

        System.out.println("Segundo Número:");
        numero2 = Integer.parseInt(scan.nextLine());

        adicao = numero1 + numero2;
        subracao  = numero1 - numero2;
        multiplicacao = numero1*numero2;
        divisao = numero1/numero2;


        System.out.printf("\n%d + %d = %d", numero1, numero2, adicao);
        System.out.printf("\n%d - %d = %d", numero1, numero2, subracao);
        System.out.printf("\n%d * %d = %d", numero1, numero2, multiplicacao);
        System.out.printf("\n%d / %d = %d", numero1, numero2, divisao);
        
        scan.close(); // fechamento de objeto
    }
}
