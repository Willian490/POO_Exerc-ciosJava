public class TesteCorEx5{

    public static void main(String[] args){
        Cor c1 = new Cor(255,180,90);
         
        System.out.println("Cor base: "+c1);

        Cor c2 = c1.escurecer();
        
        System.out.println("Cor escurecida: "+c2);
    
    }
}