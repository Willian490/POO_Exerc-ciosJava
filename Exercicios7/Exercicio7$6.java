import java.util.Scanner;

public class Exercicio7$6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        int[] n1 = new int[5];        
        boolean ehPositivo;

        for(int i=0; i<n1.length; i++){
            ehPositivo=true;

            do{                                    
            
                if(ehPositivo==true){
                    System.out.printf("\nn1[%d]:",i);
                    n1[i] = Integer.parseInt(scan.nextLine());        
                }                                
                else if(ehPositivo==false){
                    System.out.printf("\nEntre com um valor positivo:");
                    n1[i] = Integer.parseInt(scan.nextLine());        
                }

                if(n1[i]>=0){
                    ehPositivo=true;
                }
                else if(n1[i]<0){
                    ehPositivo=false;
                }

                

            }while(ehPositivo==false);                        
        }

        for(int i=0; i<n1.length; i++){
                        
            System.out.printf("\nSoma dos divisores de %d: %d", n1[i], somaDivisores(n1[i]));
            
        }

        scan.close();
    }    

    public static int somaDivisores(int n){
        int somaDivisores = 0;

    
        for(int i=1; i<n; i++){

            if(n%i==0){
                somaDivisores = somaDivisores + i;
            }
        }

        return somaDivisores;

    }
    
}
