
    
import java.util.Scanner;

public class Exercicio2$13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double notaOp;
        double media;


        System.out.print("Nota Av. 1:");
        nota1 = Double.parseDouble(scan.nextLine());

        System.out.print("Nota Av. 2:");
        nota2 = Double.parseDouble(scan.nextLine());
    
        System.out.print("Nota Optativa 1:");
        notaOp = Double.parseDouble(scan.nextLine());


        if(notaOp<0){
            media=(nota1+nota2)/2;


            if(media>=6){
                System.out.printf("\nMedia: %.2f",media);
                System.out.printf("\nAprovado!");
            }
            
            else{
                System.out.printf("\nMedia: %.2f",media);
                System.out.printf("\nReprovado...");
            }
            
        }
        
        else if(notaOp >=0){
            if (nota1<nota2){
                if(notaOp>nota1){
                    nota1=notaOp;
                }

            }
            else{
                if(notaOp > nota2){
                    nota2 = notaOp;
                }
                
            }

            // Aprovado: M ≥6,0;
            // • Exame:4,0≤M <6,0:
            // • Reprovado: M <4,0

            media=(nota1+nota2)/2;

            if(media>=6.0){
                System.out.printf("\nMedia: %.2f",media);
                System.out.printf("\nAprovado!");
            }
            
            else if(media>=4.0 && media<6.0){
                System.out.printf("\nMedia: %.2f",media);
                System.out.printf("\nExame.");
            }
            else if(media<4){
                System.out.printf("\nMedia: %.2f",media);
                System.out.printf("\nReprovado...");
            }
        }

        scan.close();
    }
}


