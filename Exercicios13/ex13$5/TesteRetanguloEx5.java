import java.util.Scanner;

public class TesteRetanguloEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos pontos do usuário
        System.out.println("Ponto superior esquerdo");
        System.out.print("x: ");
        int x1 = scanner.nextInt();
        System.out.print("y: ");
        int y1 = scanner.nextInt();

        System.out.println("Ponto inferior direito");
        System.out.print("x: ");
        int x2 = scanner.nextInt();
        System.out.print("y: ");
        int y2 = scanner.nextInt();

        // Criando os pontos e o retângulo
        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Retangulo retangulo = new Retangulo(p1, p2);

        // Exibindo o retângulo original
        System.out.println("\nRetangulo criado:");
        System.out.println(retangulo);

        // Entrada de movimento
        System.out.println("\nMover em:");
        System.out.print("x: ");
        int quantidadeX = scanner.nextInt();
        System.out.print("y: ");
        int quantidadeY = scanner.nextInt();

        // Movendo o retângulo
        retangulo.mover(quantidadeX, quantidadeY);

        // Exibindo o retângulo movido
        System.out.println("\nRetangulo movido:");
        System.out.println(retangulo);

        scanner.close();
    }
}
