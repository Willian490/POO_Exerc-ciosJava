import java.util.Scanner;

public class Exercicio1$22 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        double numero;          
        double comDesconto;

        System.out.println("Valor do Produto:");
        numero = Double.parseDouble(scan.nextLine()); //pega linha que deu enter, e guarda como inteiro

        comDesconto = numero * 0.91;
        System.out.printf("\nPreco de venda com 9%% de desconto: %.2f",comDesconto);


        
        scan.close(); // fechamento de objeto
    }
}
