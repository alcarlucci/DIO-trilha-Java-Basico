package lista_Encadeada;

public class MainLista {
    
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();

        System.out.println("Size: " + minhaListaEncadeada.size());
        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println("Size: " + minhaListaEncadeada.size());
        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println("Size: " + minhaListaEncadeada.size());
        System.out.println(minhaListaEncadeada);
    }

}
