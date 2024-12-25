import java.util.Scanner;

public class TesteRetanguloEx4 {
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

        // Exibindo as informações do retângulo
        System.out.println("\nRetangulo criado:");
        System.out.println(retangulo);

        // Calculando e exibindo o centro do retângulo
        Ponto centro = retangulo.obterCentro();
        System.out.println("Centro: " + centro);

        scanner.close();
    }
}
