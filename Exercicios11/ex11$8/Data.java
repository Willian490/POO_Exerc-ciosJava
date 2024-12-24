public class Data{

    private int dia;
    private int mes;
    private int ano;


    // public Data(){
    //     this(1,1,1970); // invoca construtor para fornecer valores para ele
    // }


    public Data(int dia, int mes, int ano){

       setDia(dia);
       setMes(mes);
       setAno(ano);
        
    }

    public void setDia(int dia){

        if(dia <1 || dia>31){
            this.dia=1;
        }
        else{
            this.dia=dia;
        }
        
    }
    public void setMes(int mes){
        if(mes <1 || mes>12){
            this.mes=1;
        }
        else{
            this.mes=mes;
        }
        
    }

    public void setAno(int ano){
        if(ano<1 || ano>12){
            this.ano=1;
        }
        else{
            this.ano=ano;
        }
        
    }

    public int getDia(){
        return dia;
    }

    
    public int getMes(){
        return mes;
    }

    
    public int getAno(){
        return ano;
    }

    public boolean isBissexto(){
        return ano % 400 ==0 || (ano %4 == 0 && ano %100 != 0);
    }
    
   public int getDiaDoAno(){
    int diaAno=0;


    if(this.dia!=30){
        diaAno = getMes()*30 - (30-getDia());

        return diaAno;
    }

    else{
        return diaAno = getMes()*30;
    }
    
   } 



    @Override
    public String toString(){
        return String.format("\n\n\t%02d/%02d/%02d", dia,mes,ano);
    }

}