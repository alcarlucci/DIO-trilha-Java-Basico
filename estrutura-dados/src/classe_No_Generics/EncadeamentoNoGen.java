package classe_No_Generics;

public class EncadeamentoNoGen {
    
    public static void main(String[] args) {
        //cria os Nós e seus encadeamentos (duplo: proximo e anterior)
        //conteudo do Nó será do tipo String
        
        NoGen<String> no1 = new NoGen<String>("conteúdo Nó 1");

        NoGen<String> no2 = new NoGen<String>("conteúdo Nó 2");
        no1.setProximoNo(no2);
        no2.setNoAnterior(no1);

        NoGen<String> no3 = new NoGen<String>("conteúdo Nó 3");
        no2.setProximoNo(no3);
        no3.setNoAnterior(no2);

        NoGen<String> no4 = new NoGen<String>("conteúdo Nó 4");
        no3.setProximoNo(no4);
        no4.setNoAnterior(no3);

        // mostra o encadeamento dos Nós (duplo: ida e volta)
        // no1 -> no2 -> no3 -> no4 -> null
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        System.out.println("-----------");

        // no4 -> no3 -> no2 -> no1 -> null
        System.out.println(no4);
        System.out.println(no4.getNoAnterior());
        System.out.println(no4.getNoAnterior().getNoAnterior());
        System.out.println(no4.getNoAnterior().getNoAnterior().getNoAnterior());
        System.out.println(no4.getNoAnterior().getNoAnterior().getNoAnterior().getNoAnterior());
    }
}
