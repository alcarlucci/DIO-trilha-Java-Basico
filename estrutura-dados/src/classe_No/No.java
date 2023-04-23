package classe_No;

public class No {
    
    private String conteudo;
    private No proximoNo;
    private No noAnterior;
    
    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    
    public No getNoAnterior() {
        return noAnterior;
    }
    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }
    
    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }


}
