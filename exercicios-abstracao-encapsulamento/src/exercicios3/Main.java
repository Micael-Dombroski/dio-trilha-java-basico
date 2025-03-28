package exercicios3;

public class Main {
    public static void main(String[] args) {
        final Carro carro = new Carro();
        carro.setNome("Camaro");
        System.out.println(carro.getNome());
        carro = new Carro();
    }
}
