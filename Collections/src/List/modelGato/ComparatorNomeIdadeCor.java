package List.modelGato;

import java.util.Comparator;

public class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int compNome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (compNome != 0) return compNome;

        int compIdade = g1.getIdade().compareTo(g2.getIdade());
        if (compIdade != 0) return compIdade;

        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    
}
