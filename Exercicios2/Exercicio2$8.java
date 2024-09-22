/*Exercício 2.8:
 Escreva umprogramaquepeçaparaousuáriofornecertrêsnúmerosdecimaiseescrever asoma
 dos dois maiores. Formate a saída dos números decimais usando 2casas deprecisão.
 Arquivocomasolução:Exercicio2$8.java
 Entrada
 N1: 4
 N2: 2
 N3: 9
 Saída
 A soma dos dois numeros maiores fornecidos e 13.00
 Entrada
 N1:-1
 N2: 7
 N3:-2
 Saída
 A soma dos dois numeros maiores fornecidos e 6.00
 Entrada
 N1: 7
 N2: 3
 N3: 7
 Saída
 A soma dos dois numeros maiores fornecidos e 14.0 */

 
import java.util.Scanner;

public class Exercicio2$8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double temp;
        double soma;

        System.out.print("Número 1:");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("\nNúmero 2:");
        n2 = Double.parseDouble(scan.nextLine());
        
        System.out.print("\nNúmero 3:");
        n3 = Double.parseDouble(scan.nextLine());
        
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        if(n2>n3){
            temp=n2;
            n2=n3;
            n3=temp;
        }
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        
        soma=n3+n2;

        System.out.printf("\n\nA soma dos dois numeros maiores fornecidos e %.2f",soma);
        


        scan.close();
    }
}
