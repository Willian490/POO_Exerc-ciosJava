// Exercício 1.24:
// Escreva um programa que calcule e exiba, usando duas casas decimais, o valor líquido do salário de
// um professor. O programa deve pedir para o usuário fornecer o valor da hora/aula, a quantidade de
// aulas e a porcentagem de desconto do INSS.
// Arquivo com a solução: Exercicio1$24.java
// Entrada
// Valor da hora/aula: 20.78
// Quantidade de aulas: 40
// Porcentagem de desconto do INSS: 26.5
// Saída2
// Salario Liquido: 610.93

import java.util.Scanner;

public class Exercicio1$24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorHoraAula;
        double qntAulas;
        double descontoInss;
        double salarioLiquido;

        System.out.print("Valor da hora/aula:");
        valorHoraAula = Double.parseDouble(scan.nextLine());

        System.out.print("\nQuantidade de aulas:");
        qntAulas = Double.parseDouble(scan.nextLine());
        
        System.out.print("\nPorcentagem de desconto do INSS:");
        descontoInss = Double.parseDouble(scan.nextLine());

        salarioLiquido = ((valorHoraAula*qntAulas)*(1- (descontoInss/100)));

        System.out.printf("\nSalario Liquido: %.2f", salarioLiquido);

        scan.close();
    }
}
