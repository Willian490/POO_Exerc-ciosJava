

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num= new int[5];
        int valorBusca;

        
        
        for(int i=0; i<num.length; i++){
            System.out.printf("\nN(%d):",i);
            num[i] = Integer.parseInt(scan.nextLine());
        }

        
        System.out.println("Valor a ser procurado:");
        valorBusca = Integer.parseInt(scan.nextLine());
        

          for(int i=0; i<num.length; i++){
           
            if(num[i]==valorBusca){
                System.out.printf("\nIndice %d: ACHEI",i);
            }

            else{
                System.out.printf("\nIndice %d: NAO ACHEI",i);   
            }
        }
        
        scan.close();
    }
}
