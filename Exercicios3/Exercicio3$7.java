

import java.util.Scanner;
public class Exercicio3$7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Forneça um número menor ou igual a 0:");
        num = Integer.parseInt(scan.nextLine());

        if(num<=0){
            for(int i=num; i<=0; i++){
                System.out.print(i + " ");
            }
        }
        
        else{
            System.out.println("Valor incorreto (positivo)");
        }

        

        scan.close();
    }
}
