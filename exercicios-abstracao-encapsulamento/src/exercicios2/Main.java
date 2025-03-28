package exercicios2;

import java.util.Scanner;

public class Main {
    private  final static Scanner scanner = new Scanner(System.in);

    private final static ATM atm = new ATM();
    public static void main(String[] args) {

        System.out.println("Cadastrar uma conta? S/N");
        if (scanner.next().toUpperCase().equals("S")) {
            System.out.println("Informe o usuário: ");
            String usuario = scanner.next();
            double saldo;
            do {
                System.out.println("Informe o saldo da conta: R$ ");
                saldo = scanner.nextDouble();
                if(saldo <= 0.00) {
                    System.out.println("Informe um saldo superior a R$ 0.00");
                }
            } while (saldo <= 0.00);
            System.out.println("Informe o número da conta (use apenas números, sem caracteres especiais): ");
            int numero = scanner.nextInt();
            System.out.println("Informe a agência da conta: ");
            String agencia = scanner.next();
            Conta conta = new Conta(usuario, saldo, numero, agencia);
            atm.conta = conta;
            var option = -1;

            do {
                System.out.println("====Escolha uma das opções====");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Consultar cheque especial");
                System.out.println("3 - Depositar dinheiro");
                System.out.println("4 - Sacar dinheiro");
                System.out.println("5 - Pagar um boleto");
                System.out.println("6 - Verificar se a conta está usando cheque especial");
                System.out.println("0 - Sair");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        atm.consultarSaldo();
                        break;
                    case 2:
                        atm.consultarChequeEspecial();
                        break;
                    case 3:
                        depositarValor();
                        break;
                    case 4:
                        sacarValor();
                        break;
                    case 5:
                        pagarUmBoleto();
                        break;
                    case 6:
                        atm.verificarContaEmChequeEspecial();
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
        }
        scanner.close();
    }
    private static void depositarValor() {
        System.out.println("Informe um valor para depositar: R$ ");
        double valorDeposito = scanner.nextDouble();
        atm.depositar(valorDeposito);
    }

    private static void sacarValor() {
        System.out.println("Informe um valor para sacar: R$ ");
        double valorSaque = scanner.nextDouble();
        atm.sacar(valorSaque);
    }

    private static void pagarUmBoleto() {
        System.out.println("Informe o valor a pagar do boleto: R$ ");
        double valorBoleto = scanner.nextDouble();
        atm.pagarBoleto(valorBoleto);
    }
}
