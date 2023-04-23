package pilhas_LIFO;

public class Main {
    
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.push(6);

        System.out.println(minhaPilha);

        System.out.println("Método top():");
        System.out.println(minhaPilha.top());
        System.out.println(minhaPilha);

        System.out.println("Método pop():");
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        System.out.println("Método push(99):");
        minhaPilha.push(99);
        System.out.println(minhaPilha);
    }

}
