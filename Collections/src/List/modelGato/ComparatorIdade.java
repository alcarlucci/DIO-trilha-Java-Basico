package List.modelGato;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // return Integer.compare(g1.getIdade(), g2.getIdade());
        return g1.getIdade().compareTo(g2.getIdade());
    }

}
