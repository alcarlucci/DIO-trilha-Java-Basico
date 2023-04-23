package _estruturas_Java.equals_hashCode;

import java.util.Objects;

public class Carro {
    private String marca;

    public Carro(String marca) {
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

}
