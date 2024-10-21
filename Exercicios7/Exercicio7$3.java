import java.util.Scanner;

public class Exercicio7$3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        double[] n1 = new double[5];        
        double[] n2 = new double[5];        
        boolean menorQueZero1;
        boolean menorQueZero2;

        for(int i=0; i<n1.length; i++){
            menorQueZero1 =  true;
            menorQueZero2 =  true;
            
            do{            
            System.out.printf("\nn1[%d]:",i);
            n1[i] = Double.parseDouble(scan.nextLine());
            
                if(n1[i]>=0){
                    menorQueZero1=false;
                }

                else{
                    System.out.printf("Entre com um valor positivo!");    
                }
            
            }while(menorQueZero1==true);
            
            do{            
                System.out.printf("\nn2[%d]:",i);
                n2[i] = Double.parseDouble(scan.nextLine());
                
                    if(n2[i]>=0){
                        menorQueZero2=false;
                    }
    
                    else{
                        System.out.printf("Entre com um valor positivo!");    
                    }
                
                }while(menorQueZero2==true);
                                                

        }

        for(int i=0; i<n1.length; i++){
            
            if(maiorNumero(n1[i], n2[i])!=-1){
                System.out.printf("\n%.2f, %.2f: O maior valor e %.2f",n1[i], n2[i], maiorNumero(n1[i], n2[i]));    
            }
            else{
                System.out.printf("\n%.2f, %.2f: Eles sao iguais",n1[i], n2[i]);    
            }
        

        }
        scan.close();
    }    


    public static double maiorNumero(double n1, double n2){

        //n1 maior
        if(n1>n2){            
            return n1;
        }

        //n2 maior
        else if(n2>n1){        
            return n2;
        }

        //n1 e n2 são iguais
        else{
            return -1;
        }


    }
}
