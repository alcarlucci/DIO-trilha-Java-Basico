package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import List.modelGato.ComparatorCor;
import List.modelGato.ComparatorIdade;
import List.modelGato.ComparatorNomeCorIdade;
import List.modelGato.ComparatorNomeIdadeCor;
import List.modelGato.Gato;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class ExemploOrdList {
    
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        // meusGatos.sort(Comparator.comparing(Gato::getNome));


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---"); // método shuffle da classe Collections
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---"); // método compareTo da classe Gato
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade()); // método sort da List usando método compare (Comparator) da classe ComparatorIdade
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor()); // método sort da List usando método compare (Comparator) da classe ComparatorCor
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade()); // método sort da List usando método compare (Comparator) da classe ComparatorNomeCorIdade
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Idade/Cor\t---");
        meusGatos.sort(new ComparatorNomeIdadeCor()); // método sort da List usando método compare (Comparator) da classe ComparatorNomeIdadeCor
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor (classe Anônima)\t---");
        meusGatos.sort(new Comparator<Gato>() { // método sort da List usando método compare (Comparator) de uma classe Anônima
            @Override
            public int compare(Gato g1, Gato g2) {
                return g1.getCor().compareToIgnoreCase(g2.getCor());
            }
        });
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor (Lambda)\t---"); // método sort da List usando Comparator.comparing () com função Lambda (*)
        meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getCor())); // (*) sintaxe de uma função Lambda: (argumento) -> (corpo)
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade (Lambda)\t---"); // método sort da List usando Comparator.comparingInt () com função Lambda (*)
        meusGatos.sort(Comparator.comparingInt(gato -> gato.getIdade())); // (*) sintaxe de uma função Lambda: (argumento) -> (corpo)
        System.out.println(meusGatos);
    }

}
