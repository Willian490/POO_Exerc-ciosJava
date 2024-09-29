// Escolha uma operacao de acordo com o menu:
// C) Celsius -> Fahrenheit;
// F) Fahrenheit -> Celsius.
// Opcao: C
// Entre com a temperatura em graus Celsius: 38.5
// Saída
// 38.50 graus Celsius correspondem a 101.30 graus Fahrenheit
// Entrada
// Escolha uma operacao de acordo com o menu:
// C) Celsius -> Fahrenheit;
// F) Fahrenheit -> Celsius.
// Opcao: F
// Entre com a temperatura em graus Fahrenheit: 125.7
// Saída
// 125.70 graus Fahrenheit correspondem a 52.06 graus Celsius
// 2.2. ESTRUTURA CONDICIONAL SWITCH (ESCOLHA) 99
// Entrada
// Escolha uma operação de acordo com o menu:
// C) Celsius -> Fahrenheit;
// F) Fahrenheit -> Celsius.
// Opcao: x
// Saída
// Opcao invalida!


import java.util.Scanner;

public class Exercicio2$19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        char caracter;
        double c;
        double f;

        System.out.println("C) Celsius -> Fahrenheit;\r\n" + 
                "F) Fahrenheit -> Celsius.\r\n" + 
                "Opcao:");
        
        caracter = scan.nextLine().charAt(0);


        switch (caracter) {
            case 'C':
                System.out.println("Entre com a temperatura em graus Celsius:");
                c = Double.parseDouble(scan.nextLine());
    
                f = 1.8*c + 32;
    
                System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit", c,f);
        
            break;
        
            case 'F':
                System.out.println("Entre com a temperatura em graus Fahrenheit:");
                f = Double.parseDouble(scan.nextLine());
    
                c = (f-32)/1.8;
            
                System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius", f,c);
    
            break;

            default:
                System.out.printf("Opcao invalida!");
            break;
        }


        scan.close();
    }
    

    
}
