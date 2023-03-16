public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Ligar TV - status Ligada: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Desligar TV - status Ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume - Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuir volume - Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Aumentar canal - Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Diminuir canal - Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(18);
        System.out.println("Mudar canal - Canal Atual: " + smartTv.canal);
    }

}
