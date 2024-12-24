public class Empregado{
    String nome;
    String sobrenome;
    double salarioMensal;
    double salarioMaior;

    public Empregado (String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;

        if(this.salarioMensal<0){
            this.salarioMensal = 0.0;

        }

        concederAumento();
    }

    public void concederAumento(){
        salarioMaior = salarioMensal*1.1;

    }

    

    @Override
    
    public String toString(){
        String retorno = 
        """
        Empregado:
            nome = %s
            sobrenome = %s
            salario = R$%.2f
        Aumentando o salario...
        Empregado:
            nome = %s
            sobrenome = %s
            salario = R$%.2f
                """;
    
        return String.format(retorno,
            nome,
            sobrenome,
            salarioMensal, 
            nome,
            sobrenome,
            salarioMaior
        );
    }

}