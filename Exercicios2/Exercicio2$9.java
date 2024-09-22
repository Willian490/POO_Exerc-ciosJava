/*Exercício 2.9:
Escreva um programa que peça para o usuário fornecer a quantidade de lados de um polígono
regular (inteiro) e a medida do lado (decimal). Calcular e imprimir o seguinte:
• Se o número de lados for igual a 3, escrever: TRIANGULO (sem acento) e o valor do seu
perímetro;
• Seonúmerodeladosforiguala4,escrever: QUADRADOeovalordasuaárea;
• Seonúmerodeladosforiguala5,escrever: PENTAGONO(semacento);
• Emqualqueroutrasituação, escrever: Poligono nao identificado (sem acentos).
Formate asaída dosnúmerosdecimaisusando2casasdeprecisão.
Arquivocomasolução:Exercicio2$9.java
Entrada
Entre com a quantidade de lados: 3
Entre com a medida do lado: 7.5
Saída
TRIANGULO de perimetro 22.50
Entrada
Entre com a quantidade de lados: 4
Entre com a medida do lado: 5.5
Saída
QUADRADO de area 30.25
Entrada
Entre com a quantidade de lados: 5
Entre com a medida do lado: 2.5
Saída
PENTAGONO
Entrada
Entre com a quantidade de lados: 7
Entre com a medida do lado: 3.75
Saída
Poligono nao identificado
*/

import java.util.Scanner;
public class Exercicio2$9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int qndLados;
        double medidaLado;

        System.out.print("Entre com a quantidade de lados:");
        qndLados = Integer.parseInt(scan.nextLine());

        System.out.print("Entre com a medida do lado:");
        medidaLado = Double.parseDouble(scan.nextLine());

        if(qndLados==3){
            System.out.printf("\nTRIANGULO de perimetro %.2f", qndLados*medidaLado);
        }
        else if(qndLados==4){
            System.out.printf("\nQUADRADO de area %.2f", medidaLado*medidaLado);
        }
        else if(qndLados==5){
            System.out.printf("\nPENTAGONO");
        }
        else{
            System.out.println("\n\nPoligono nao identificado");
        }
        scan.close();
    }
}
