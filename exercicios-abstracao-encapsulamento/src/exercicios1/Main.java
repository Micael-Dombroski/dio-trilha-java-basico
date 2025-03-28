package exercicios1;

import java.util.Scanner;

public class Main {
    private  final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("====Escolha uma das opções====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verficar água da máquina");
            System.out.println("5 - Verficar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet na máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    setWater();
                    break;
                case 3:
                    setShampoo();
                    break;
                case 4:
                    verifyWater();
                    break;
                case 5:
                    verifyShampoo();
                    break;
                case 6:
                    checkIfHasPetInMachine();
                    break;
                case 7:
                    setPetInPetMachine();
                    break;
                case 8:
                    takeOutPetFromMachine();
                    break;
                case 9:
                    petMachine.washMachine();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(option != 0);
        scanner.close();
    }

    private static void takeOutPetFromMachine() {
        if (petMachine.hasPet()) {
            petMachine.removePet();
        } else {
            System.out.println("Não há nenhum pet na máquina");
        }
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo");
    }

    private static boolean checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
        return hasPet;
    }

    public static void setPetInPetMachine() {
        var name = "";
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

}
