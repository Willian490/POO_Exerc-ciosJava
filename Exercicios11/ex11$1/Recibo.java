public class Recibo {

    private String identificador;
    private String descricao;
    private int quantidade;
    private double precoVenda;

    public Recibo(String identificador, String descricao, int quantidade, double precoVenda) {
        this.identificador = identificador;
        this.descricao = descricao;

        // Ajuste da quantidade
        if (quantidade <= 0) {
            this.quantidade = 1;
        } else {
            this.quantidade = quantidade;
        }

        // Ajuste do preço
        if (precoVenda < 0) {
            this.precoVenda = 0.0;
        } else {
            this.precoVenda = precoVenda;
        }
    }

    public double getValorTotal() {
        return quantidade * precoVenda;
    }

    @Override
    public String toString() {
        String retorno =
            """
            Recibo:
                id = %s
                descricao = %s
                quantidade = %d
                preco = R$%.2f
                valor total = R$%.2f
            """;
        return String.format(retorno, identificador, descricao, quantidade, precoVenda, getValorTotal());
    }
}
