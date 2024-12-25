public class TesteRetanguloEx3 {
    public static void main(String[] args) {
        // Criando os pontos
        Ponto p1 = new Ponto(10, 10); // Ponto superior esquerdo
        Ponto p2 = new Ponto(50, 30); // Ponto inferior direito

        // Criando o retângulo com os pontos
        Retangulo retangulo = new Retangulo(p1, p2);

        // Exibindo as informações do retângulo
        System.out.println("Representação do Retângulo:");
        System.out.println(retangulo);

        // Calculando e exibindo a área
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
