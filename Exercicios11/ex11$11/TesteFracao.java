public class TesteFracao {
    public static void main(String[] args){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(3,4);
        
        System.out.println(f1 + " + " + f2 + " = " + f1.somar(f2));

        System.out.println(f1 + " - " + f2 + " = " + f1.subtrair(f2));
        
        System.out.println(f1 + " * " + f2 + " = " + f1.multiplicar(f2));

        System.out.println(f1 + " / " + f2 + " = " + f1.dividir(f2));
    }
}
