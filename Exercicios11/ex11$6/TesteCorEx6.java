public class TesteCorEx6{

    public static void main(String[] args){
        Cor c1 = new Cor(100,150,230);
         
        System.out.println(c1);

        Cor c2;

        c2 = c1.clarear();

        System.out.println("Cor clareada:"+c2);

    }
}