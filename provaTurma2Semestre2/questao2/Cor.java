public class Cor{
    private int cor1;
    private int cor2;
    private int cor3;

    public Cor(int cor1, int cor2, int cor3){

        //atributos de mesma natureza;
        setCores(cor1,cor2,cor3);
    }

    public void setCores(int cor1, int cor2, int cor3){
        
        if(cor1<0 || cor2<0 || cor3<0){
            if(cor1<0){
                this.cor1=0;
            }
            if(cor2<0){
                this.cor2=0;
            }
            if(cor3<0){
                this.cor3=0;
            }
        }
        
        if(cor1>=255 || cor2>=255 || cor3>=255){
            if(cor1>=255){
                this.cor1=255;
            }
            if(cor2>=255){
                this.cor2=255;
            }
            if(cor3>=255){
                this.cor3=255;
            }    
        }

        if(cor1>0 && cor1<255 || cor2>0 &&cor2<255 || cor3>0 && cor3<255 ){
            if(cor1>0 && cor1<255){
                this.cor1 = cor1;
            }
            if(cor2>0 &&cor2<255){
                this.cor2 = cor2;
            }
    
            if(cor3>0 && cor3<255){
                this.cor3 = cor3;
            }
        }
        
    }
    
    public int getCor1(){
        return cor1;
    }

    public int getCor2(){
        return cor2;
    }

    public int getCor3(){
        return cor3;
    }

    @Override
    public String toString(){
        String retorno =
        """
        Cor: rgb( %d, %d, %d )        
                """;

        return String.format(retorno,cor1,cor2,cor3);
            
    }

}