import java.util.Scanner;

public class Exercicio7$8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;      
        
        int[] n1 = new int[5];        
        int[] n2 = new int[5];        
        boolean menorQueZero1;
        boolean menorQueZero2;

        for(int i=0; i<n1.length; i++){
            menorQueZero1 =  true;
            menorQueZero2 =  true;
            
            do{            
            System.out.printf("\nn1[%d]:",i);
            n1[i] = Integer.parseInt(scan.nextLine());
            
                if(n1[i]>=0){
                    menorQueZero1=false;
                }

                else{
                    System.out.printf("Entre com um valor positivo!");    
                }
            
            }while(menorQueZero1==true);
            
            do{            
                System.out.printf("\nn2[%d]:",i);
                n2[i] = Integer.parseInt(scan.nextLine());
                
                    if(n2[i]>=0){
                        menorQueZero2=false;
                    }
    
                    else{
                        System.out.printf("Entre com um valor positivo!");    
                    }
                
                }while(menorQueZero2==true);
                                                
        }

        for(int i=0; i<n1.length; i++){
                
           if(saoAmigos(n1[i],n2[i]) == true){
                System.out.print(n1[i] + " e " + n2[i] + " sao amigos\n");
           }
           
           else{
                System.out.print(n1[i] + " e " + n2[i] + " nao sao amigos\n");
           }

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

    public static boolean saoAmigos(int n1, int n2){
        boolean amigos;
        if(n1==somaDivisores(n2) || n2==somaDivisores(n1)){
            amigos=true;
        }
        else{
            amigos=false;
        }
        return amigos;
    }
}
