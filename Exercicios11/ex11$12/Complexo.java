public class Complexo {
    private double real;
    private double imaginario;

    
    public Complexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    
    public Complexo somar(Complexo outroComplexo) {
        double novaParteReal = this.real + outroComplexo.real;
        double novaParteImaginaria = this.imaginario + outroComplexo.imaginario;
        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    
    public Complexo subtrair(Complexo outroComplexo) {
        double novaParteReal = this.real - outroComplexo.real;
        double novaParteImaginaria = this.imaginario - outroComplexo.imaginario;
        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    
    public Complexo multiplicar(Complexo outroComplexo) {
        double novaParteReal = (this.real * outroComplexo.real) - (this.imaginario * outroComplexo.imaginario);
        double novaParteImaginaria = (this.real * outroComplexo.imaginario) + (this.imaginario * outroComplexo.real);
        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    
    @Override
    public String toString() {
        return String.format("(%.2f + %.2fi)", real, imaginario);
    }
}
