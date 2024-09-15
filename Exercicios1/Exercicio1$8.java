/*Exercício 1.8:
Escreva um programa que peça para o usuário fornecer os valores da largura e da altura de um
retângulo em uma unidade arbitrária. Os valores devem ser números inteiros. O programa deve
calcular os valores da área e perímetro desse retângulo. O resultado de cada cálculo deve ser
armazenado em uma variável. No final, o programa deve exibir ao usuário os valores obtidos.
Lembrando que:
• P = (2l)+(2h)
• A = lh
• Onde:
– P é o perímetro do retângulo;
– A é a área do retângulo;
– l é o valor da largura do retângulo;
– h é o valor da altura do retângulo.
*/


import java.util.Scanner;

public class Exercicio1$8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado;
        int altura;
        int P;
        int A;

        System.out.println("Valor da largura do Retângulo:");
        lado = Integer.parseInt(scan.nextLine());

        System.out.println("Valor da altura do Retângulo:");
        altura = Integer.parseInt(scan.nextLine());
            
        P = (2*lado) + (2*altura);
        A = lado*altura;

        System.out.print("\nPerimetro = " + P);
        System.out.print("\nArea = " + A);        

        scan.close();

        

    }
}
