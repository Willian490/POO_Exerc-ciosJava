
import java.util.Scanner;
public class Exercicio5$2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] arrayM1= new int[3][3];
        int[][] arrayM2= new int[3][3];
        int[][] arraySoma= new int[3][3];
        int[] numeros = new int[5];

        System.out.println("Preencha a primeira matriz:");

        for(int x=0; x<3; x++){
            for(int j=0; j<3; j++){
                
                System.out.printf("\n\tarray[%d][%d]: ",x,j);
                arrayM1[x][j] = Integer.parseInt(scan.nextLine());
                

            }
        }


        System.out.println("Preencha a segunda matriz:");

        for(int x=0; x<3; x++){
            for(int j=0; j<3; j++){
                
                System.out.printf("\n\tarray[%d][%d]: ",x,j);
                arrayM2[x][j] = Integer.parseInt(scan.nextLine());
                
                arraySoma[x][j] = arrayM1[x][j] + arrayM2[x][j];

            }
        }

        System.out.printf("\n\narray1:       array2:       arraySoma:");
        
        for(int x=0; x<3; x++){
            System.out.println("");
            for(int j=0; j<3; j++){            
            
                System.out.printf("%03d ", arrayM1[x][j] );

                if(j==2 && x==1){
                    System.out.printf("+ ");
                }
            }

            if(x!=1){
                System.out.print("  ");
            }
            
            
            for(int j=0; j<3; j++){
                System.out.printf("%03d ", arrayM2[x][j] );

                if(j==2 && x==1){
                    System.out.printf("= ");
                }
            }
            

            if(x!=1){
                System.out.print("  ");
            }
            
            
            for(int j=0; j<3; j++){
                
                
                System.out.printf("%03d", arraySoma[x][j] );

                if(j!=2){
                    System.out.printf(" ");
                }
                

            }
        }


        
        scan.close();

    }
}