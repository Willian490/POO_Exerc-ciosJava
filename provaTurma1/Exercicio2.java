// // Questão 2 - (2,5): Escreva um programa que peça para o usuário fornecer dois números inteiros. Se o primeiro
// // número for menor ou igual ao segundo, o programa deve exibir todos os números no intervalo entre os números
// // digitados em ordem crescente. Caso o primeiro número seja maior que o segundo, o programa deve exibir
// // todos os números no intervalo entre os números digitados em ordem decrescente.
// // Arquivo com a solução: Exercicio2.java


// import java.util.Scanner;
// public class Exercicio2 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int n1=0;
//         int n2=0;
//         boolean ehmaior = true;

//         System.out.print("N1:");
//         n1 = Integer.parseInt(scan.nextLine());

//         System.out.print("\nN2:");
//         n2 = Integer.parseInt(scan.nextLine());

//         if(n2>n1){
//             System.out.printf("Ordem crescente %d <= %d",n1,n1);

            
//                 ehmaior=true;

//             for(int i=n2; i<=n1; i++){
//                 System.out.print(" "+i);
//             }

//         }

//         // if(n2>n1){
//         //     System.out.printf("\nOrdem crescente %d <= %d",n1,n1);

//         //     ehmaior=false;
//         // }

//         System.out.println();


     
//         scan.close();
//     }
// }


import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1=0;
        int n2=0;
       
        
        System.out.print("N1:");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("\nN2:");
        n2 = Integer.parseInt(scan.nextLine());

        if(n1<n2){

            for(int i=n1; i<=n2; i++){
                System.out.print(" "+i);   
            }
        }


        if(n1>n2){

            for(int i=n1; i>=n2; i--){
                System.out.print(" "+i);   
            }
        }
        

        //Ordem crescente: 2 <= 7
        scan.close();
    }
}
