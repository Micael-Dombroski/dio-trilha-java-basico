public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();//26
        smartTv.aumentarVolume();//27
        smartTv.aumentarVolume();//28
        smartTv.aumentarVolume();//29
        smartTv.diminuirVolume();//28
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);
        smartTv.mudarCanal(12);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();//13
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
        smartTv.diminuirrCanal();//12
        smartTv.diminuirrCanal();//11
        smartTv.diminuirrCanal();//10
        smartTv.diminuirrCanal();//9
        smartTv.diminuirrCanal();//8
        smartTv.diminuirrCanal();//7
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}
