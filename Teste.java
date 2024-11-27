import java.util.Scanner;

public class Teste{
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        int valor;

        System.out.println("\n\na:");
        

        //Tente fazer - trata erro;
        try{
            valor = Integer.parseInt(scan.nextLine());    
            System.out.print("\n"+valor);
        } catch (NumberFormatException exc){
            System.out.print("ERRO");
            exc.printStackTrace();
        }
        // trata erro e continua programa/captura erro
        
        System.out.println("\n\nContinuando...");

        scan.close();
    }

}