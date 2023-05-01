package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Set.modelSerie.ComparatorGenero;
import Set.modelSerie.ComparatorNomeGeneroTempo;
import Set.modelSerie.ComparatorTempo;
import Set.modelSerie.Serie;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdSet {
    
    public static void main(String[] args) {
        
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        System.out.println("Minhas Séries (toString):");
        for (Serie serie : minhasSeries) {
            System.out.println(serie);
        }

        System.out.println("--\tOrdem aleatória\t--");
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
            
        System.out.println("--\tOrdem inserção\t--"); // LinkedHashSet faz ordenação por inserção
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--"); // TreeSet faz ordenação natural dos elementos (compareTo da Classe)
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--"); // TreeSet faz ordenação dos elementos definido no Comparator
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Gênero\t--"); // TreeSet faz ordenação dos elementos definido no Comparator
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        
        System.out.println("--\tOrdem Tempo Episódio\t--"); // TreeSet faz ordenação dos elementos definido no Comparator
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }

}
