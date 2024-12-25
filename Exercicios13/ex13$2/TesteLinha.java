
import java.text.DecimalFormat;

public class TesteLinha {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(10, 20);
        Ponto p2 = new Ponto(20,30);

        Linha novLinha = new Linha(p1,p2);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Linha criada:");
        System.out.println(novLinha);


        System.out.println("Comprimento: "+df.format(novLinha.calcularComrpimento()));
        
        

    }
}
// import java.text.DecimalFormat;

// public class TesteLinha {
//     public static void main(String[] args) {
//         // Criando pontos
//         Ponto p1 = new Ponto(10, 20);
//         Ponto p2 = new Ponto(20, 30);

//         // Criando linha
//         Linha novaLinha = new Linha(p1, p2);

//         // Formatador para 2 casas decimais
//         DecimalFormat df = new DecimalFormat("0.00");

//         // Saída do teste
//         System.out.println("Linha criada: " + novaLinha);
//         System.out.println("Comprimento: " + df.format(novaLinha.calcularComprimento()));
//     }
// }
