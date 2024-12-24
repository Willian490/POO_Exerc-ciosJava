public class Hora{

    private int qntHoras;
    private int qntMinutos;
    private int qntSegundos;
    private int segundos;

    public Hora(int qH, int qM, int qS){
        if(qH<0){
            qH = 0;
        }
        if(qM<0){
            qM = 0;
        }
        if(qS<0){
            qS=0;
        }

        if(qH>=60){
            qH=59;
        }
        if(qM>=60){
            qM=59;
        }
        if(qS>=60){
            qS=59;
        }
        
        qntHoras=qH;
        qntMinutos=qM;
        qntSegundos=qS;
    }

    public Hora(int segundos){

        this.segundos=segundos;

        horarioPelosSegundos(this.segundos);
    }

    public void horarioPelosSegundos(int segundos){

        if(segundos/3600>=0){
            qntHoras=segundos/3600;
            qntMinutos=(segundos%3600)/60;
            qntSegundos=segundos%60;
        }
        

    }

    @Override

    public String toString(){
        return String.format("Hora: %d:%d:%d",qntHoras,qntMinutos,qntSegundos);
    }

}