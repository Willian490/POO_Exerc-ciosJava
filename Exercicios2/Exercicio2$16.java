// Exercício 2.16:
//  Escreva umprogramaquepeçaparaousuáriofornecerumnúmeronointervalode1,inclusive, e
//  3999, inclusive. Caso o valor fornecido esteja fora desse intervalo, o programa deve avisar o usuário
//  e terminar. Caso contrário, o programa deve exibir o número romano correspondente ao número
//  arábico fornecido. Lembrando que:
//  • 1=I;
//  • 5=V;
//  • 10=X;
//  • 50=L;
//  • 100=C;
//  • 500=D;
//  • 1000=M

import java.util.Scanner;
public class Exercicio2$16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resto;

        System.out.print("Entre com um numero entre 1 e 3999:");
        numero = Integer.parseInt(scan.nextLine());

        System.out.print("\n");

        System.out.printf("%d = ",numero);
        if(numero>=1 && numero<=3999){
            if((numero/1000 ==1) || (numero/1000 ==2) || (numero/1000 ==3)){
                if(numero/1000==1){
                    System.out.print("M");
                    
                }
                if(numero/1000==2){
                    System.out.print("MM");
                }
                if(numero/1000==3){
                    System.out.print("MMM");
                }
                
            }
            resto=numero%1000;

            if((resto/100)>=1 && (resto/100)<=10){
                
                if(resto/100==1){
                    System.out.print("C");
                }
                if(resto/100==2){
                    System.out.print("CC");
                }
                if(resto/100==3){
                    System.out.print("CCC");
                }
                if(resto/100==4){
                    System.out.print("CD");
                }
                if(resto/100==5){
                    System.out.print("D");
                }
                if(resto/100==6){
                    System.out.print("DC");
                }
                if(resto/100==7){
                    System.out.print("DCC");
                }
                if(resto/100==8){
                    System.out.print("DCCC");
                }
                if(resto/100==9){
                    System.out.print("CM");
                }

            }
            resto=numero%100;

            if((resto/10)>=1 && (resto/10)<=10){
                
                if(resto/10==1){
                    System.out.print("X");
                }
                if(resto/10==2){
                    System.out.print("XX");
                }
                if(resto/10==3){
                    System.out.print("XXX");
                }
                if(resto/10==4){
                    System.out.print("XL");
                }
                if(resto/10==5){
                    System.out.print("L");
                }
                if(resto/10==6){
                    System.out.print("LX");
                }
                if(resto/10==7){
                    System.out.print("LXX");
                }
                if(resto/10==8){
                    System.out.print("LXXX");
                }
                if(resto/10==9){
                    System.out.print("XC");
                }
        
            }
            resto=numero%10;

            if(resto==1){
                System.out.print("I");
            }
            if(resto==2){
                System.out.print("II");
            }
            if(resto==3){
                System.out.print("III");
            }
            if(resto==4){
                System.out.print("IV");
            }

            if(resto==5){
                System.out.print("V");
            }
            if(resto==6){
                System.out.print("VI");
            }
            if(resto==7){
                System.out.print("VII");
            }
            if(resto==8){
                System.out.print("VIII");
            }
            if(resto==9){
                System.out.print("IX");
            }
            if(resto==10){
                System.out.print("X");
            }
        }

        else{
            System.out.println("Numero incorreto!");
        }
        scan.close();
    }
}
