package Map.modelLivro;

import java.util.Comparator;
import java.util.Map.Entry;

public class ComparatorPaginas implements Comparator<Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
    
}
