// Exercício 2.7:
// Escreva umprogramaquepeçaparaousuáriofornecer dois númerosdecimais. Oprogramadeve
// somaresses dois númeroseseessasomaformaiorque10,osdoisnúmerosdevemserexibidos.
// Caso contrário, a subtração dos dois números deve ser mostrada. Formate a saída dos números
// decimais usando 2 casas deprecisão.
// Arquivocomasolução:Exercicio2$7.java
// Entrada
// Entre com um numero: 7
// Entre com outro numero: 8.5
// Saída
// Os numeros fornecidos foram 7.00 e 8.50
// Entrada
// Entre com um numero: 3
// Entre com outro numero: 2
// Saída
// A subtracao entre 3.00 e 2.00 e igual a 1.00

import java.util.Scanner;
public class Exercicio2$7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double n1;
        double n2;
        double soma;
        double subtracao;

        System.out.print("Número 1:");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("\nNúmero 2:");
        n2 = Double.parseDouble(scan.nextLine());
    
        soma=n1+n2;
        

        if(soma>10){
            System.out.printf("\nOs numeros fornecidos foram %.2f e %.2f", n1,n2);
            
        }
        if((n1+n2)<=10){
            subtracao = n1-n2;    

            System.out.printf("\nA subtracao entre %.2f e %.2f e igual a %.2f", n1,n2,subtracao);
        }

        scan.close();
    }
}
