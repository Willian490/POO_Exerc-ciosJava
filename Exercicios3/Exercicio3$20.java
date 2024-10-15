/*Exercício 3.18:
 Escreva um programa que exiba o seguinte desenho usando, obrigatoriamente, a estrutura de
 repetição for. Você só pode utilizar as seguintes construções para gerar a saída:
 • System.
 out.print( "*" ) e
 •
 System.out.println()
 Arquivocomasolução:Exercicio3$18.java */

 import java.util.Scanner;
 public class Exercicio3$20 {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
 
        int controlador=0;

        for(int x=0; x<5; x++){
            System.out.print("\n");
             
            for(int d=0; d<=x; d++){
                System.out.print("*");
            }
        }

        System.out.print("\n");
        
        
        for(int x=4; x>=0; x--){
            System.out.print("\n");
             
            for(int d=0; d<=x; d++){
                System.out.print("*");
            }
        }


        System.out.print("\n");
        


        for(int x=0; x<5; x++){
            System.out.print("\n");
            for(int d=0; d<=x; d++){
                
                
                if(controlador==0){
                    System.out.print("    *");
                }
                if(controlador==1){
                    System.out.print("   **");
                }
                
                if(controlador==2){
                    System.out.print("\n");
                    System.out.print("  ***");
                
                }
                if(controlador==3){
                    
                    System.out.print(" ****");
                    
            
                }   
                if(controlador==4){
                    System.out.print("\n");
                    System.out.print("*****");
        
                }   
                controlador++;
            }
        }

        controlador=4;
        for(int x=4; x>=0; x--){
            
            for(int d=0; d<=x; d++){
                
                if(controlador==4){
                    
                    System.out.print("*****");
                }   
                if(controlador==3){
                    System.out.print(" ****");
                }   
                if(controlador==2){
                 
                    System.out.print("  ***");
                }
                if(controlador==1){
                    System.out.print("   **");
                }
                if(controlador==0){
                    System.out.print("    *");
                  
                }
                System.out.print("\n");    
                
                controlador--;
            }
        }




        scan.close();


    }
 }
 