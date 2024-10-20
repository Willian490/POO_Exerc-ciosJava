
import java.util.Scanner;
public class Exercicio5$1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] arrayNumero= new int[3][2];


        System.out.println("Preencha a matriz:");

        for(int x=0; x<3; x++){
            for(int j=0; j<2; j++){
                
                System.out.printf("\n\tarray[%d][%d]: ",x,j);
                arrayNumero[x][j] = Integer.parseInt(scan.nextLine());
                

            }
        }

        System.out.printf("\n");
        System.out.printf("\n");

        for(int x=0; x<3; x++){
            System.out.printf("\n");
            for(int j=0; j<2; j++){                

                if(j==1){
                    System.out.printf(" ");                
                }

                System.out.printf("%03d",arrayNumero[x][j]);                
                
                

            }
        }

        scan.close();

    }
}