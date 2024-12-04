public class Linha {
    private Ponto p1;
    private Ponto p2;


    // public Linha(){
    //     this(new Ponto(), new Ponto());
    // }
    public Linha(){

        this(new Ponto(0,0), new Ponto(0,0));
    }

    public Linha(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;

    }

    public double calcularComrpimento(){
        int cat1 = p2.getX() - p1.getX();
        int cat2 = p2.getY() - p1.getY();

        return Math.sqrt(cat1*cat1+cat2*cat2);
        //ou
        // return Math.hypot(cat1, cat2);
    }

    @Override
    public String toString(){
        return p1 + "  ---"+ p2;
    }


}
