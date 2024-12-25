import java.util.Scanner;

public class TesteRetanguloEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Retangulo 1");
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

        
        Ponto p1R1 = new Ponto(x1, y1);
        Ponto p2R1 = new Ponto(x2, y2);
        Retangulo retangulo1 = new Retangulo(p1R1, p2R1);

        
        System.out.println("\nRetangulo 2");
        System.out.println("Ponto superior esquerdo");
        System.out.print("x: ");
        int x3 = scanner.nextInt();
        System.out.print("y: ");
        int y3 = scanner.nextInt();

        System.out.println("Ponto inferior direito");
        System.out.print("x: ");
        int x4 = scanner.nextInt();
        System.out.print("y: ");
        int y4 = scanner.nextInt();

        
        Ponto p1R2 = new Ponto(x3, y3);
        Ponto p2R2 = new Ponto(x4, y4);
        Retangulo retangulo2 = new Retangulo(p1R2, p2R2);

        
        System.out.println("\nRetangulo 1:");
        System.out.println(retangulo1);
        System.out.println("Retangulo 2:");
        System.out.println(retangulo2);

        
        boolean interceptam = retangulo1.intersepta(retangulo2);
        System.out.println("Os retangulos se interceptam? " + (interceptam ? "Sim" : "Nao"));

        scanner.close();
    }
}
