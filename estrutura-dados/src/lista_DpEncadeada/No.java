package lista_DpEncadeada;

public class No<T> {
    private T conteudo;
    private No<T> proximoNo;
    private No<T> noAnterior;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }
    public void setNoAnterior(No<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "No {" + conteudo + "}";
    }

    public String toStringEncadeado() {
        return noAnterior + " <- No {" + conteudo + "} -> " + proximoNo;
    }    

}
