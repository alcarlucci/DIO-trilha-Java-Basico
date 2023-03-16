public class SmartTv {
    // Atributos da Classe SmartTV

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    // Definição dos Métodos da Classe SmartTV

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
