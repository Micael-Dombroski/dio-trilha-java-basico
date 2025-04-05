package exercicio1;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opt;
        GeometricForm geometricForm = null;
        while(true) {
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("[1] Quadrado");
            System.out.println("[2] Retângulo");
            System.out.println("[3] Círculo");
            System.out.println("[4] Sair do programa");
            opt = scanner.nextInt();
            if (opt == 1) {
                geometricForm = createSquare();
            } else if (opt == 2) {
                geometricForm = createRectangle();
            } else if (opt == 3) {
                geometricForm = createCircle();
            } else if (opt == 4) {
                System.out.println("Saindo...");
                //sai do loop
                break;
            } else {
                System.out.println("[3RR0R] Opção inválida");
                //repete o loop
                continue;
            }
            System.out.println("O resultado do cálcula da área foi de: " + geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare() {
        System.out.println("Informe os tamanhos dos lados:");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informe a base:");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura:");
        var height = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o raio:");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
