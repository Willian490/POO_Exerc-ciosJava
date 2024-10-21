import java.util.Scanner;

public class Exercicio7$5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        int[] n1 = new int[5];        
        int[] n2 = new int[5];        
        
        

        for(int i=0; i<n1.length; i++){        
            System.out.printf("\nn1[%d]:",i);
            n1[i] = Integer.parseInt(scan.nextLine());
        
            System.out.printf("\nn2[%d]:",i);
            n2[i] = Integer.parseInt(scan.nextLine());
                                                        
        }

        for(int i=0; i<n1.length; i++){

            if(ehPar(n1[i])==true && ehDivisor(n1[i], n2[i])==true){
                System.out.printf("\n%d eh par e %d eh divisivel por %d",n1[i],n1[i],n2[i]);
                                
            }

            if(ehPar(n1[i])==false && ehDivisor(n1[i], n2[i])==true){
                System.out.printf("\n%d eh impar e %d eh divisivel por %d",n1[i],n1[i],n2[i]);
                ///8 eh par e 8 eh divisivel por 4
            }

            if(ehPar(n1[i])==false && ehDivisor(n1[i], n2[i])==false){
                System.out.printf("\n%d eh impar e %d nao eh divisivel por %d",n1[i],n1[i],n2[i]);
                ///8 eh par e 8 eh divisivel por 4
            }
            
        }
        scan.close();
    }    

    public static boolean ehPar(int n){

        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    
    public static boolean ehDivisor(int divisor, int dividendo){

        if(divisor%dividendo==0){
            return true;
        }
        else{
            return false;
        }
    }
}
