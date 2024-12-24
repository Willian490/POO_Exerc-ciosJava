public class Empregado{

    private String nome;
    private String sobreNome;
    private double salarioMensal;
    private double salarioAtual;

    public Empregado(String nome, String sobrenome, double salariMensal){

        setNome(nome);
        setSobrenome(sobrenome);
        setSalariomensal(salarioMensal);
    }

    public void setNome(String nome){
        this.nome=nome;        
    }

    public void setSobrenome(String sobreNome){
        this.sobreNome=sobreNome;
    }

    public void setSalariomensal(double salarioMensal){

        if(salarioMensal<0.0){
            salarioMensal=0.0;
        }

        this.salarioMensal = salarioMensal;

    }

    public double getSalariomensal(){
        return salarioMensal;
    }

    public void realizarReducao(){
                
        salarioAtual= getSalariomensal()*0.9;

    }

    @Override
    public String toString(){
                
        String r=
        """
        Empregado:        
            nome = %s
            sobrenome = %s
            salario = R$%.2f
        Diminuindo o salario...
        Empregado:        
            nome = %s
            sobrenome = %s
            salario = R$%.2f
                """;

        return String.format(r,nome,sobreNome,salarioMensal,nome,sobreNome,salarioAtual);
    }

}