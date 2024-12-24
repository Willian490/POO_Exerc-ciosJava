public class Cor{
    private int cor1;
    private int cor2;
    private int cor3;

    public Cor(int cor1, int cor2, int cor3) {
        this.cor1 = validarCor(cor1);
        this.cor2 = validarCor(cor2);
        this.cor3 = validarCor(cor3);
    }

    
    private int validarCor(int cor) {
        if (cor < 0) {
            return 0;
        } else if (cor > 255) {
            return 255;
        }    
        return cor;
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


    public Cor clarear(){

        if(cor1==0 && cor2==0 && cor3==0){
            cor1=3;
            cor2=3;
            cor3=3;

            return new Cor(cor1,cor2,cor3);
        
        }

        else if(cor1>0 && cor1<3 || cor2>0 && cor2<3 || cor3>0 && cor3<3){
            if(cor1>0 && cor1<3){
                cor1=3;
                cor1=(int) (cor1/0.7);
            }
            

            if(cor2>0 && cor2<3){
                cor2=3;
                cor2=(int) (cor2/0.7);
            }
            
            if(cor3>0 && cor3<3){
                cor3=3;
                cor3=(int) (cor3/0.7);
            }
            
            return new Cor(cor1, cor2, cor3);
        }
        
        
        else if((cor1/0.7)>255 || (cor2/0.7)>255 || (cor3/0.7)>255){
             
            if((cor1/0.7)>255){
                cor1=255;
            }
            else{
                cor1=(int) (cor1/0.7);
            }


            if((cor2/0.7)>255){
                cor2=255;
            }
            else{
                cor2=(int) (cor2/0.7);
            }


            if((cor3/0.7)>255){
                cor3=255;
            }
            else{
                cor3=(int) (cor3/0.7);
            }


            return new Cor(cor1,cor2,cor3);


        }
        else{
            return new Cor(
                (int) (this.cor1/0.7),
                (int) (this.cor2/0.7),
                (int) (this.cor3/0.7));
        }
    }



    @Override
    public String toString(){
        String retorno =
        """
        rgb( %d, %d, %d )        
                """;

        return String.format(retorno,cor1,cor2,cor3);
            
    }

}