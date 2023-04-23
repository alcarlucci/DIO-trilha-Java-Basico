package lista_Encadeada;

public class ListaEncadeada<T> {
    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<T>(conteudo);
        
        if (this.isEmpty()) {
            refEntrada = novoNo;
            return;
        }
        else {
            No<T> noAuxiliar = refEntrada;
            for (int i = 0; i < size() - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        validaIndice(index);
        
        No<T> noPivor = getNo(index);
        if(index == 0){
            refEntrada = noPivor.getProximoNo();
        }
        else {
            No<T> noAnterior = getNo(index - 1);
            noAnterior.setProximoNo(noPivor.getProximoNo());
        }

        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = refEntrada;
        
        while (referenciaAux != null) {
            tamanhoLista++;
            referenciaAux = referenciaAux.getProximoNo();
        }

        return tamanhoLista;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return refEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.refEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}] -> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        
        return strRetorno;
    }
}
