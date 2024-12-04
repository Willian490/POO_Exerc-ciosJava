public class TesteLinha {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(10, 20);
        Ponto p2 = new Ponto(20,30);

        Linha novLinha = new Linha(p1,p2);

        System.out.println(novLinha);


        System.out.println("\tComprimento:"+novLinha.calcularComrpimento());
        

    }
}
