package lista_DpEncadeada;

public class ListaDpEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanhoLista;
    
    public ListaDpEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }
    
    public int size(){
        return tamanhoLista;
    }
    
    public void add(T elemento){
        No<T> novoNo = new No<T>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        
        if (ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        No<T> noAuxiliar = getNo(index);
        No<T> novoNo = new No<T>(elemento);
        novoNo.setProximoNo(noAuxiliar);

        if(novoNo.getProximoNo() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        }else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }
        
        if(index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        }else{
            No<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        No<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }


    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}] -> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
