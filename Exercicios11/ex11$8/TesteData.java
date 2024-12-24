import java.util.Scanner;
public class TesteData{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        int dia;
        int mes;
        int ano;

        

        System.out.println("Dia:");
        dia = Integer.parseInt(scan.nextLine());
        

        System.out.println("Mes:");
        mes = Integer.parseInt(scan.nextLine());

        System.out.println("Ano:");
        ano = Integer.parseInt(scan.nextLine());
        
        Data d1 = new Data(dia,mes,ano);  
    
        System.out.println("Data:"+d1);
        System.out.println("Dia do ano: "+d1.getDiaDoAno());
    

        scan.close();
    }

}