public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (ano < 1) {
            this.ano = 1;
        } else {
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
    }

    public int getDiaDoAno() {
        //bissexto
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        if (isBissexto()) {
            diasPorMes[1] = 29;
        }

        
        int diaDoAno = 0;
        for (int i = 0; i < mes - 1; i++) {
            diaDoAno += diasPorMes[i];
        }

        
        diaDoAno += dia;

        return diaDoAno;
    }

    @Override
    public String toString() {
        return String.format(" %02d/%02d/%d", dia, mes, ano);
    }
}
