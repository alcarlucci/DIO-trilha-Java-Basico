package classe_No_Generics;

public class NoGen<T> {
    private T conteudo;
    private NoGen<T> proximoNo;
    private NoGen<T> noAnterior;

    public NoGen(T conteudo) {
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

    public NoGen<T> getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(NoGen<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoGen<T> getNoAnterior() {
        return noAnterior;
    }
    public void setNoAnterior(NoGen<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoGen [conteudo=" + conteudo + "]";
    }

}
