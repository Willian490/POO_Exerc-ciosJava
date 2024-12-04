
import java.util.Scanner;
public class TestePonto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        int y;
        System.out.println("Ponto");
        System.out.print(" \nX: ");
        x = Integer.parseInt(scan.nextLine());

        System.out.print(" \nY: ");
        y = Integer.parseInt(scan.nextLine());

        Ponto novoPonto = new Ponto (x,y);
        System.out.println(novoPonto);

        scan.close();
    }
}
