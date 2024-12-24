public class Fracao{
    
    private double numerador;
    private double denominador;
    private double numeradorResultante;
    private double denominadorResultante;
  

    public Fracao(double numerador, double denominador){
        this.numerador=numerador;
        this.denominador=denominador;


    }

    public Fracao somar(Fracao outraFracao){

        if(outraFracao.denominador==denominador){
            numeradorResultante=numerador+outraFracao.numerador;
            
            
        }
        else{
            denominadorResultante=outraFracao.denominador*denominador;

            numeradorResultante=(((denominadorResultante)*outraFracao.numerador)/outraFracao.denominador) + (((denominadorResultante)*numerador)/denominador);

            
        }
        
        return new Fracao(numeradorResultante,denominadorResultante);

    }

    public Fracao subtrair(Fracao outraFracao){
        if(outraFracao.denominador==denominador){
            numeradorResultante=numerador-outraFracao.numerador;
                        
        }
        else{
            denominadorResultante=outraFracao.denominador*denominador;

            numeradorResultante=(((denominadorResultante)*numerador)/denominador) - (((denominadorResultante)*outraFracao.numerador)/outraFracao.denominador);
            
        }
        
        return new Fracao(numeradorResultante,denominadorResultante);        
    }

    public Fracao multiplicar(Fracao outraFracao){
        
        numeradorResultante = numerador*outraFracao.numerador;
        denominadorResultante = denominador*outraFracao.denominador;
        
        return new Fracao(numeradorResultante,denominadorResultante);        
    }

    public Fracao dividir(Fracao outraFracao){
        
        
        numeradorResultante = numerador*outraFracao.denominador;
        denominadorResultante=denominador*outraFracao.numerador;
        
        return new Fracao(numeradorResultante,denominadorResultante);        
    }


    @Override
    public String toString(){
        return String.format("%.2f/%.2f",this.numerador,this.denominador);
    }

}