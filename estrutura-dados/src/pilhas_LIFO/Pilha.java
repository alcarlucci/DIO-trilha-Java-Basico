package pilhas_LIFO;

public class Pilha {
    private No refNoTopo = null;

    public Pilha() {
    }

    public void push(int dado) {
        No refAuxiliar = refNoTopo;
        No novoNo = new No(dado);

        refNoTopo = novoNo;
        novoNo.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoTopo;
            refNoTopo = refNoTopo.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoTopo;
    }

    public boolean isEmpty(){
        return refNoTopo == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        
        No noAuxiliar = refNoTopo;
        while (noAuxiliar != null) {
            stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getRefNo();
        }

        stringRetorno += "============";
        return stringRetorno;
    }
}
