public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897897");
        //jeep.confereCambio();
        //jeep.confereCombustivel();
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("467754");
        z400.ligar();

        Veiculo coringa = new Moto();
        coringa.ligar();
    }
}
