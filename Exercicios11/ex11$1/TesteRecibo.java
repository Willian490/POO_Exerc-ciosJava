
import java.util.Scanner;
public class TesteRecibo {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            

            String identificador;
            String descricao;
            int quantidade;
            double precoUnitario;

            System.out.println("Id:");
            identificador = scan.nextLine();


            System.out.println("Descricão:");
            descricao = scan.nextLine();
            
            System.out.println("Quantidade:");
            quantidade = Integer.parseInt(scan.nextLine());

            System.out.println("Preço Unitário:");
            precoUnitario = Double.parseDouble(scan.nextLine());
            
            Recibo r1 = new Recibo(identificador, descricao, quantidade, precoUnitario);

            System.out.println(r1);
            scan.close();
    }   
}
