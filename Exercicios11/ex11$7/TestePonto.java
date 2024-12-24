public class TestePonto{

    public static void main(String[] args){
        Ponto p1 = new Ponto(0,0);        
        Ponto p2 = new Ponto(10,10);

        System.out.println("Ponto 1:"+p1);
        
        System.out.println("Ponto 1:"+p2);
       
        Double distancia=p1.getDistancia(p2);

        System.out.printf("Distância entre os pontos: %.2f\n", distancia);
    }
}