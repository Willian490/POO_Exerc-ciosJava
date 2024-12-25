import java.util.Scanner;

public class TesteRetanguloEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        int x1 = scanner.nextInt();
        
        int y1 = scanner.nextInt();

        
        
        int x2 = scanner.nextInt();
        
        int y2 = scanner.nextInt();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);
        Retangulo retangulo = new Retangulo(p1, p2);

        
        System.out.println(retangulo);

        
        
        int px = scanner.nextInt();
        
        int py = scanner.nextInt();

        Ponto ponto = new Ponto(px, py);
        System.out.println("Ponto criado: " + ponto);

        boolean contem = retangulo.contem(ponto);
        System.out.println("O ponto esta contido no retangulo? " + (contem ? "Sim" : "Nao"));

        scanner.close();
    }
}
