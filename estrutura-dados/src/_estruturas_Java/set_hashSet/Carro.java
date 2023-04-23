package _estruturas_Java.set_hashSet;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    private String marca;

    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // verifica se os objetos são iguais, ou seja, fazem referência para mesma área de memória
        
        if (!(o instanceof Carro)) return false; //verifica se são instância para classes diferentes
        
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca()); //verifica o atributo de comparacao é igual entre os objetos
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    // implementação do compareTo usando o método compareTo da classe String (por ordem alfabética)
    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }

    // implementação do método compareTo pelo tamanho da string
//    @Override
//    public int compareTo(Carro o) {
//        if(this.marca.length() < o.getMarca().length()){
//            return -1;
//        }else if(this.marca.length() > o.getMarca().length()){
//            return 1;
//        }
//        return 0;
//    }

}
