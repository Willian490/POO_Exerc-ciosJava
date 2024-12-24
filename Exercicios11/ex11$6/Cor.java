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


    public Cor escurecer() {
        // Multiplica cada componente por 0.7 e retorna um novo objeto com os valores ajustados
        
        //     cor1escura= (int) (this.cor1*0.7); //truncamento

        return new Cor(
            (int) (this.cor1 * 0.7),
            (int) (this.cor2 * 0.7),
            (int) (this.cor3 * 0.7)
        );
    }

    public Cor clarear(){

        if(cor1==0 && cor2==0 && cor3==0){
            cor1=3;
            cor2=3;
            cor3=3;

            return new Cor(cor1,cor2,cor3);
        
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
        Cor: rgb( %d, %d, %d );                
        """;


        return String.format(retorno,cor1,cor2,cor3);
            
    }

}