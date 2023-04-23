package _estruturas_Java.equals_hashCode;

public class MainEq {
    
    public static void main(String[] args) {
        
        Carro meuCarro1 = new Carro("Fiat");
        Carro meuCarro2 = new Carro("Ford");
        Carro meuCarro3 = new Carro("VW");
        Carro meuCarro4 = new Carro("Fiat");

        System.out.println("==== Equals ====");
        System.out.println("Carro 1 = Carro 2 : " + (meuCarro1.equals(meuCarro2) ? "SIM" : "NÃO"));
        System.out.println("Carro 1 = Carro 3 : " + (meuCarro1.equals(meuCarro3) ? "SIM" : "NÃO"));
        System.out.println("Carro 1 = Carro 4 : " + (meuCarro1.equals(meuCarro4) ? "SIM" : "NÃO"));

        System.out.println("=== HashCode ===");
        System.out.println("HashCode Carro 1: " + meuCarro1.hashCode());
        System.out.println("HashCode Carro 2: " + meuCarro2.hashCode());
        System.out.println("HashCode Carro 3: " + meuCarro3.hashCode());
        System.out.println("HashCode Carro 4: " + meuCarro4.hashCode());
    }

}
