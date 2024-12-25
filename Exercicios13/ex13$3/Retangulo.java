public class Retangulo {
    private Ponto p1; // Ponto superior esquerdo
    private Ponto p2; // Ponto inferior direito

    // Construtor padrão
    public Retangulo() {
        this.p1 = new Ponto(0, 0);
        this.p2 = new Ponto(0, 0);
    }

    // Construtor com parâmetros
    public Retangulo(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getters e Setters
    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    
    public double calcularArea() {
        int largura = p2.getX() - p1.getX();
        int altura = p2.getY() - p1.getY();
        return largura * altura;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p1.toString()).append("\n");
        sb.append("|").append("=".repeat(14)).append("|\n");
        for (int i = 0; i < 2; i++) {
            sb.append("|").append(" ".repeat(14)).append("|\n");
        }
        sb.append("|").append("=".repeat(14)).append("|\n");
        sb.append(p2.toString());
        return sb.toString();
    }
}
 