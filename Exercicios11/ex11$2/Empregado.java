public class Empregado{
    String nome;
    String sobrenome;
    double salarioMensal;

    public Empregado (String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;

        if(this.salarioMensal<0){
            this.salarioMensal = 0.0;

        }
    }

    public void concederAumento(){
        salarioMensal = salarioMensal*1.1;

    }

    

    @Override
    
    public String toString(){
        String retorno = 
        """
        Funcionário:
            nome: %s,
            sobrenome: %s,
            salario: %.2f
                """;
    
        return String.format(retorno,
            nome,
            sobrenome,
            salarioMensal
        );
    }

}