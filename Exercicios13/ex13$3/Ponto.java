public public class Ponto {
    private int x;
    private int y;

    // Construtor padrão
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor com parâmetros
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método toString para exibir o ponto
    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}

