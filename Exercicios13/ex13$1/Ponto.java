public class Ponto{

    private int  x;
    private int  y;

        public Ponto (int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX (){
            return x;
        }

        public void setX(int x){
            this.x=x;
        }

        public int getY (){
            return y;
        }

        public void setY(int x){
            this.y=y;
        }

        @Override
        public String toString(){
            return String.format("Ponto criado: (%d, %d)", x,y);
        }

}