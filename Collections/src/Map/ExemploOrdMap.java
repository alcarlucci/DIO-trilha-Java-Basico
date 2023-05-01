package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Map.modelLivro.ComparatorNome;
import Map.modelLivro.ComparatorPaginas;
import Map.modelLivro.Livro;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = [nome: Uma Breve História do Tempo.; páginas: 256]
Autor = Duhigg, Charles - Livro = [nome: O Poder do Hábito; paginas: 408]
Autor = Harari, Yuval Noah  - Livro = [21 Lições Para o Século 21; páginas: 432]
*/

public class ExemploOrdMap {
    
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--"); // HashMap faz ordenação aleatória
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--"); // LinkedHashMap faz ordenação por inserção
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--"); // TreeMap faz ordenação pela chave dos elementos (key=autor)
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for (Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--"); // TreeSet para ordenação a partir de um Comparator (nome livro)
        Set<Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de página\t--"); // TreeSet para ordenação a partir de um Comparator (páginas do livro)
        Set<Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Entry<String,Livro> livro : meusLivros4) {
            System.out.println(livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

    }

}
