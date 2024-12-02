public class Cor{
    int cor1;
    int cor2;
    int cor3;
    int cor1escura;
    int cor2escura;
    int cor3escura;

    public Cor(int cor1, int cor2, int cor3){
        if(cor1<0){
            this.cor1=0;
        }
        if(cor2<0){
            this.cor2=0;
        }
        if(cor3<0){
            this.cor3=0;
        }

        if(cor1>=255){
            this.cor1=255;
        }
        if(cor2>=255){
            this.cor2=255;
        }
        if(cor3>=255){
            this.cor3=255;
        }
        if(cor1>0 ||cor1<255){
            this.cor1 = cor1;
        }
        if(cor2>0 ||cor2<255){
            this.cor2 = cor2;
        }

        if(cor3>0 ||cor3<255){
            this.cor3 = cor3;
        }
    }

    // public Cor escurecer(){
    //     cor1escura=cor1*0.7;
    //     cor2escura=cor2*0.7;
    //     cor3escura=cor3*0.7;
    // }
    @Override
    public String toString(){
        String retorno =
        """
        Cor: rgb( %d, %d, %d );        
        Cor escurecida: rgb ( %d, %d, %d)       """;

        return String.format(retorno,cor1,cor2,cor3);
            
    }

}