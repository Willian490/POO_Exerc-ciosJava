// Exercício 2.18:
// Escreva um programa que peça para o usuário fornecer dois números decimais. Após a inserção
// de tais números, o programa deve mostrar ao usuário um menu, onde ele poderá escolher entre
// as quatro operações básicas (adição, subtração, multiplicação e divisão). Fazer a leitura dessa
// opção como um caractere (tipo char). Dependendo da operação escolhida, o programa deve
// executar o cálculo correspondente e exibir ao usuário o resultado. Caso o usuário forneça uma
// opção inválida, o programa deve exibir uma mensagem dizendo que a opção é inválida e deve
// terminar sua execução. Formate a saída dos números decimais usando 2 casas de precisão.
// Arquivo com a solução: Exercicio2$18.java
// Entrada
// N1: 28
// N2: 8
// Escolha uma operacao de acordo com o menu:
// +) Adicao;
// -) Subtracao;
// *) Multiplicacao;
// /) Divisao.
// Operacao: +
// Saída
// 28.00 + 8.00 = 36.00
// Entrada
// N1: 16
// N2: 3
// Escolha uma operacao de acordo com o menu:
// +) Adicao;
// -) Subtracao;
// *) Multiplicacao;
// /) Divisao.
// Operacao: /
// Saída
// 16.00 / 3.00 = 5.33



import java.util.Scanner;
public class Exercicio2$18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1;
        double n2;
        char caracter;

        System.out.println("Informe o primeiro valor:");
        n1 = Double.parseDouble(scan.nextLine());


        System.out.println("Informe o segundo valor:");
        n2 =Double.parseDouble(scan.nextLine());


        System.out.println("Escolha uma operacao de acordo com o menu:");
        System.out.println(" +) Adicao;\n" + 
                " -) Subtracao;\n" + 
                " *) Multiplicacao;\n" + 
                " /) Divisao.\n"  
                );

            System.out.println("Operação:");
            caracter = scan.nextLine().charAt(0);

            switch(caracter){
                case '+':
                    System.out.printf(" %.2f + %.2f = %.2f",n1,n2, n1+n2);
                break;
                case '-':
                    System.out.printf(" %.2f - %.2f = %.2f",n1,n2, n1-n2);                
                break;
                case '*':
                    System.out.printf(" %.2f * %.2f = %.2f",n1,n2, n1*n2);

                break;
                
                case '/':
                    System.out.printf(" %.2f / %.2f = %.2f",n1,n2, n1/n2);

                break;
                

                default:
            System.out.printf("Opção inválida" );
                break;
            }

        
        scan.close();
    }
}
