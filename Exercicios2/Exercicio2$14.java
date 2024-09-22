
import java.util.Scanner;

public class Exercicio2$14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double p;
        double h;
        double imc;

        System.out.print("Entre com seu peso em quilogramas:");
        p = Double.parseDouble(scan.nextLine());

        System.out.print("Entre com sua altura em metros:");
        h = Double.parseDouble(scan.nextLine());

        imc = (p/(h*h));

        if(imc<17){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nVoce esta muito abaixo do peso ideal!");
        }

        else if(imc>=17 && imc<18.5){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nVoce esta abaixo do peso ideal!");
        }

        else if(imc>=18.5 && imc<25){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nParabens! Voce esta em seu peso normal!");
        }

        else if(imc>=25 && imc<30){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nAtencao, voce esta acima de seu peso (sobrepeso)!");
        }
        
        else if(imc>=30 && imc<35){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nCuidado! Obesidade grau I!");
        }

        else if(imc>=35 && imc<40){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nCuidado! Obesidade grau II!");
        }

        else if(imc>40){
            System.out.printf("IMC: %.2f",imc);
            System.out.printf("\nMuito Cuidado!!! Obesidade grau III!");
        }

        scan.close();
    }    

    
    
}
