package classe_No;

public class EncadeamentoNo {
    
    public static void main(String[] args) {
        //cria os Nós e seus encadeamentos (duplo: proximo e anterior)
        No no1 = new No("Conteudo no1");

        No no2 = new No("Conteudo no2");
        no1.setProximoNo(no2);
        no2.setNoAnterior(no1);

        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);
        no3.setNoAnterior(no2);

        No no4 = new No("Conteudo no4");
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
