package lista_DpEncadeada;

public class MainNo {
    
    public static void main(String[] args) {
        No<String> no1 = new No<String>("Nó 01");

        No<String> no2 = new No<String>("Nó 02");
        no1.setProximoNo(no2);
        no2.setNoAnterior(no1);

        No<String> no3 = new No<String>("Nó 03");
        no2.setProximoNo(no3);
        no3.setNoAnterior(no2);

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
        
        System.out.println("----------");

        System.out.println(no1.toStringEncadeado());
        System.out.println(no2.toStringEncadeado());
        System.out.println(no3.toStringEncadeado());
    }

}
