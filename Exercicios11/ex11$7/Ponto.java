public class Ponto{
    double x;
    double y;
    private double deltaX = 0.0;
    private double deltaY = 0.0;
    private double distancia = 0.0;
    
    public Ponto(int x, int y){

        this.x=x;
        this.y=y;

    }

    public double getDistancia(Ponto outrPonto){
        deltaX = outrPonto.x - this.x;
        deltaY = outrPonto.y - this.y;


        
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


    @Override
    public String toString(){
        return String.format(" [x=%.2f;y=%.2f]",x,y);
    }


    

}