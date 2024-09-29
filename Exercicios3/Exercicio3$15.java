package Exercicios3;

import java.util.Scanner;
public class Exercicio3$15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 0;        
        int acumulador = 0;
        

        System.out.print("Número:");
        numero = Integer.parseInt(scan.nextLine());

        
        if(numero>=0){

            for(int i=numero; i>=1; i--){
                
                if(i == (numero-2)){
                    acumulador = numero * (numero-1);
                    fatorial = acumulador *i;
                }
                
                if(i<(numero-2)){
                    fatorial = fatorial *i;
                }
                
                //System.out.print("\n\n\t"+i+ " e "+acumulador+ " e " +fatorial);
                
            }
                System.out.print(numero + "! = "+fatorial);
            
        }
        else{            
            System.out.println("Nao ha fatorial de numero negativo.");                            
        }
        scan.close();

    }
}
