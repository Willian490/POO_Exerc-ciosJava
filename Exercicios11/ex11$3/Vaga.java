public class Vaga{
    String placa;
    int qnthoras=0;
    double valorhoras;
    double acimahoras;

    public Vaga(String placa, int qnthoras){
        this.placa = placa;

        
        if(qnthoras<=0){
            this.qnthoras=1;
        }
        else{
            this.qnthoras = qnthoras;

        }


    }

    public double getTaxa(){
        if(qnthoras<=3){
            valorhoras=2;

            return valorhoras;
        }
        else if(qnthoras>3 && qnthoras<24){
            acimahoras=qnthoras-3;

            valorhoras= 2+(acimahoras*0.5);

            return valorhoras;            
        }
        else if(qnthoras>=24){
            qnthoras=24;

            valorhoras=10;

            return valorhoras;
        }
        else{
            return 0;
        }

    }

    

    @Override
    public String toString(){
        String retorno = 
        """
        Vaga:
            placa = %s
            quantidade = %d
            taxa = R$%.2f        
                """;

        return String.format(retorno,
        placa,
        qnthoras,
        valorhoras
        );
    }


}
