import java.util.Scanner;

public class Exercicio1$21 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);

        int numero;  
        int sucessor;        
        int antecessor;
        
        System.out.println("Número:");
        numero = Integer.parseInt(scan.nextLine()); //pega linha que deu enter, e guarda como inteiro

        sucessor = numero + 1;
        antecessor = numero - 1;
        
        System.out.printf("\nSucessor de %d: %d",numero, sucessor);
        System.out.printf("\nAntecessor de %d: %d",numero, antecessor);


        
        scan.close(); // fechamento de objeto
    }
}
