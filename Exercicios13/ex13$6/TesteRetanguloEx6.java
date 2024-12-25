import java.util.Scanner;

public class TesteRetanguloEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos pontos do retângulo
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

        // Exibindo o retângulo criado
        System.out.println("\nRetangulo criado:");
        System.out.println(retangulo);

        // Entrada do ponto a ser verificado
        System.out.println("\nPonto");
        System.out.print("x: ");
        int px = scanner.nextInt();
        System.out.print("y: ");
        int py = scanner.nextInt();

        Ponto ponto = new Ponto(px, py);
        System.out.println("\nPonto criado: " + ponto);

        // Verificando se o ponto está no retângulo
        boolean contem = retangulo.contem(ponto);
        System.out.println("O ponto esta contido no retangulo? " + (contem ? "Sim" : "Não"));

        scanner.close();
    }
}
