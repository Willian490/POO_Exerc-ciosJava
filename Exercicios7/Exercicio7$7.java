import java.util.Scanner;

public class Exercicio7$7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        
        

        for(int i=1; i<=20; i++){

            if(ehPrimo(i)==true){
                System.out.print(i + ": eh primo\n");    
            }
            else{
                System.out.print(i + ": nao eh primo\n");    
            }
        
        
        }
    
        scan.close();
    }    

    public static boolean ehPrimo(int d){
        boolean ehPrimo;
        int numDivisores= 0;
        
        for(int i=1; i<=d; i++){
            if(d%i==0){                
                numDivisores++;
            }
        }

        if(numDivisores==2){
            ehPrimo = true;
        }
        else{
            ehPrimo = false;
        }
        
        return ehPrimo;
    }
    
}
