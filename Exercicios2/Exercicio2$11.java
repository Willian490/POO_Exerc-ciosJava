/*Exercício 2.11:
Escreva um programa que leia o valor de 3 ângulos internos (α, β e γ) (decimais) de um triân
gulo e escreva se o triângulo é ACUTANGULO, RETANGULOouOBTUSANGULO(semacentos).
Observação:
• Triângulo retângulo: possui um ângulo reto (90 graus);
• Triângulo obtusângulo: possui um ângulo obtuso (ângulo maior que 90 graus);
• Triângulo acutângulo: possui 3 ângulos agudos (ângulo menor que 90 graus);
• Casoosvalores fornecidos não representem um triângulo válido, apresente uma mensagem
de erro.
Paraserumtriângulo,asomadostrêsângulosinternosdeveseriguala180graus,ouseja,α+β+γ=
180◦.
*/


import java.util.Scanner;

public class Exercicio2$11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        

        System.out.print("alfa:");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("\nbeta:");
        n2 = Double.parseDouble(scan.nextLine());
        
        System.out.print("\ngama:");
        n3 = Double.parseDouble(scan.nextLine());
        
        if((n1+n2+n3)==180){
            if(n1==90 || n2==90 || n3==90){
                System.out.printf("\n\nTriangulo RETANGULO");        
            }

            else if(n1>90 || n2>90 || n3>90){
                System.out.printf("\n\nTriangulo OBTUSANGULO");        
            }
            else if(n1<90 && n2<90 && n3<90){
                System.out.printf("\n\nTriangulo ACUTANGULO");        
            }
        }
        else{
            System.out.printf("\n\nAs medidas fornecidas dos angulos nao representam um triangulo valido!");       
        }

        scan.close();
    }
}
