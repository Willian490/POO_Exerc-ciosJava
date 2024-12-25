public class Retangulo {
    private Ponto p1; 
    private Ponto p2; 

    
    public Retangulo() {
        this.p1 = new Ponto(0, 0);
        this.p2 = new Ponto(0, 0);
    }

    
    public Retangulo(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    
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

    public Ponto obterCentro() {
        int centroX = (p1.getX() + p2.getX()) / 2;
        int centroY = (p1.getY() + p2.getY()) / 2;
        return new Ponto(centroX, centroY);
    }

    
    public void mover(int quantidadeX, int quantidadeY) {
        p1.setX(p1.getX() + quantidadeX);
        p1.setY(p1.getY() + quantidadeY);
        p2.setX(p2.getX() + quantidadeX);
        p2.setY(p2.getY() + quantidadeY);
    }

    
    public boolean contem(Ponto ponto) {
        return ponto.getX() >= p1.getX() && ponto.getX() <= p2.getX()
            && ponto.getY() >= p1.getY() && ponto.getY() <= p2.getY();
    }

    
    public boolean intersepta(Retangulo outroRetangulo) {
    
        if (this.p2.getX() <= outroRetangulo.p1.getX() || 
            this.p1.getX() >= outroRetangulo.p2.getX() || 
            this.p2.getY() <= outroRetangulo.p1.getY() || 
            this.p1.getY() >= outroRetangulo.p2.getY()) { 
            return false;
        }
        return true; 
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
