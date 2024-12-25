import java.util.Scanner;

public class TesteRetanguloEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("x: ");
        int x1 = scanner.nextInt();
        System.out.print("y: ");
        int y1 = scanner.nextInt();

    
    
        int x2 = scanner.nextInt();
    
        int y2 = scanner.nextInt();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Retangulo retangulo = new Retangulo(p1, p2);

        System.out.println(retangulo);

    
        int quantidadeX = scanner.nextInt();
    
        int quantidadeY = scanner.nextInt();
        retangulo.mover(quantidadeX, quantidadeY);

        System.out.println("Retangulo movido:");
        System.out.println(retangulo);

        scanner.close();
    }
}
