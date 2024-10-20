// array[0][0]: 1
//  array[0][1]: 4
//  array[0][2]: 5
//  array[0][3]: 8
//  array[1][0]: 7
//  array[1][1]: 4
//  array[1][2]: 5
//  array[1][3]: 2
//  array[2][0]: 3
//  array[2][1]: 6
//  array[2][2]: 5
//  array[2][3]: 4
//  Multiplicar por: 


import java.util.Scanner;
public class Exercicio5$3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] arrayNumero= new int[3][4];
        int[][] arrayMultiplicada= new int[3][4];
        int multiplicador;

        System.out.println("Preencha a matriz:");

        for(int x=0; x<3; x++){
            for(int j=0; j<4; j++){
                
                System.out.printf("\n\tarray[%d][%d]: ",x,j);
                arrayNumero[x][j] = Integer.parseInt(scan.nextLine());
                

            }
        }

        System.out.println("\nMultiplicar por:");
        multiplicador = Integer.parseInt(scan.nextLine());



        System.out.printf("\n\narrayMult:");
        for(int x=0; x<3; x++){
            
            System.out.printf("\n");
            for(int j=0; j<4; j++){
                
                arrayMultiplicada[x][j] = arrayNumero[x][j] *multiplicador;
                

                System.out.printf(" %03d ", arrayMultiplicada[x][j]);
                
                

            }
        }
        


        scan.close();

    }
}