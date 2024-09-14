import java.util.Scanner;

public class Exercicio1$20 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);

        int numero1;  
        int numero2;        
        double media;
        
        System.out.println("Primeiro Número:");
        numero1 = Integer.parseInt(scan.nextLine()); //pega linha que deu enter, e guarda como inteiro

        System.out.println("Segundo Número:");
        numero2 = Integer.parseInt(scan.nextLine());

        
        
        

        media = (numero1+numero2)/2;


        
        System.out.printf("\n Media aritmetica: %.0f", media);
        
        scan.close(); // fechamento de objeto
    }
}
