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

    // Método para calcular a área do retângulo
    public double calcularArea() {
        int largura = p2.getX() - p1.getX();
        int altura = p2.getY() - p1.getY();
        return largura * altura;
    }

    // Método para calcular o ponto central do retângulo
    public Ponto obterCentro() {
        int centroX = (p1.getX() + p2.getX()) / 2;
        int centroY = (p1.getY() + p2.getY()) / 2;
        return new Ponto(centroX, centroY);
    }

    // Método para mover o retângulo
    public void mover(int quantidadeX, int quantidadeY) {
        p1.setX(p1.getX() + quantidadeX);
        p1.setY(p1.getY() + quantidadeY);
        p2.setX(p2.getX() + quantidadeX);
        p2.setY(p2.getY() + quantidadeY);
    }

    // Método para verificar se um ponto está dentro do retângulo
    public boolean contem(Ponto ponto) {
        return ponto.getX() >= p1.getX() && ponto.getX() <= p2.getX()
            && ponto.getY() >= p1.getY() && ponto.getY() <= p2.getY();
    }

    // Método para verificar se dois retângulos se intersectam
    public boolean intersepta(Retangulo outroRetangulo) {
        // Verifica se os retângulos não se interceptam
        if (this.p2.getX() <= outroRetangulo.p1.getX() || // Fora à esquerda
            this.p1.getX() >= outroRetangulo.p2.getX() || // Fora à direita
            this.p2.getY() <= outroRetangulo.p1.getY() || // Fora acima
            this.p1.getY() >= outroRetangulo.p2.getY()) { // Fora abaixo
            return false;
        }
        return true; // Caso contrário, eles se interceptam
    }

    // Método toString para representar o retângulo
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p1.toString()).append("\n");
        sb.append("|").append("=".repeat(14)).append("|\n");
        for (int i = 0; i < 2; i++) { // Simulação de altura
            sb.append("|").append(" ".repeat(14)).append("|\n");
        }
        sb.append("|").append("=".repeat(14)).append("|\n");
        sb.append(p2.toString());
        return sb.toString();
    }
}
