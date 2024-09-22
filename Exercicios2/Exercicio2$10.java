
/*Escreva umprogramaqueleiaasmedidasdosladosdeumtriângulo(decimais)eescreva seele é
EQUILATERO,ISOSCELESouESCALENO(semacentos).Observação:
• Triângulo equilátero: Possui 3 lados congruentes (mesma medida);
• Triângulo isósceles: Possui 2 lados congruentes e um diferente;
• Triângulo escaleno: Possui 3 lados diferentes;
• Casoosvalores fornecidos não representem um triângulo válido, apresente uma mensagem
de erro. 
    
*/

import java.util.Scanner;
public class Exercicio2$10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double a,b,c;
        

        System.out.print("\na:");
        a = Double.parseDouble(scan.nextLine());
        
        System.out.print("\nb:");
        b = Double.parseDouble(scan.nextLine());
        
        System.out.print("\nc:");
        c = Double.parseDouble(scan.nextLine());
    
        //verifica se é um triângulo
        if(((a-b)<c && c<(a+b)) && ((a-c)<b && b<(a+c)) && ((b-c)<a && a<(b+c))){
            System.out.println("É Triângulo");

            if(a==b && b==c){
                System.out.println("Triangulo EQUILATERO");            
            }
    
            else if((a==b && a!=c) || (a==c && a!=b) || (c==a && c!=b)){
                System.out.println("Triangulo ISOSCELES");            
            }
            else if(a!=b && a!=c){
                System.out.println("Triangulo ESCALENO");            
            }
            

        }
        
        //não é triângulo
        else{
            System.out.println("As medidas fornecidas dos lados nao representam um triangulo valido!");
            
        }
        
        
        scan.close();
    }
}

