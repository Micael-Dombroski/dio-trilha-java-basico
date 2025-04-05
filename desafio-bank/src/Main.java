import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Banco banco = new Banco("Banco Legal");
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opt = -1;
        do {
            System.out.println(String.format("=== Menu %s ===", banco.getNome()));
            System.out.println("[1] Cadastrar Conta");
            System.out.println("[2] Acessar Conta");
            System.out.println("[3] Exibir contas por Cliente");
            System.out.println("[4] Exibir todas as Contas");
            System.out.println("[5] Exibir todos os Clientes");
            System.out.println("[0] Sair");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    cadastrarContaCliente();
                    break;
                case 2:
                    acessarConta();
                    break;
                case 3:
                    exibirContasDoCliente();
                    break;
                case 4:
                    exibirTodasAsContas();
                    break;
                case 5:
                    exibirTodosOsClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opt != 0);
        scanner.close();
    }

    private static void cadastrarContaCliente() {
        Conta conta = null;
        Cliente cliente = null;
        String resposta = "";
        scanner.nextLine();
        if(banco.getClientes().isEmpty()) {
            System.out.println("Informe o nome do cliente: ");
            String nomeCliente = scanner.nextLine();
            cliente = new Cliente(nomeCliente);
        } else {
            System.out.println("Deseja cadastrar uma conta para um cliente já cadastrado? S/N");
            resposta = scanner.nextLine();
            if (resposta.toUpperCase().equalsIgnoreCase("S")) {
                do {
                    System.out.println("Informe o ID do cliente: ");
                    int idCliente = scanner.nextInt();
                    cliente = banco.buscarCliente(idCliente);
                } while(cliente == null);
            }
            else {
                System.out.println("Informe o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                cliente = new Cliente(nomeCliente);
            }
        }
        int optTipoConta = -1;
        do {
            System.out.println("Escolha o tipo de conta que deseja cadastra");
            System.out.println("[1] Conta Corrente");
            System.out.println("[2] Conta Poupança");
            optTipoConta = scanner.nextInt();
            scanner.nextLine();
            if (optTipoConta < 0 || optTipoConta > 2) {
                System.out.println("Opção inválida");
            }
        } while(optTipoConta < 0 || optTipoConta > 2);
        if (optTipoConta == 1) {
            conta = new ContaCorrente(cliente);
        }
        if (optTipoConta == 2) {
            conta = new ContaPoupanca(cliente);
        }
        System.out.println("Deseja fazer um depósito na conta? S/N");
        resposta = scanner.nextLine();
        if (resposta.toUpperCase().equalsIgnoreCase("S")) {
            System.out.println("Informe o valor que deseja depositar: R$ ");
            double deposito = scanner.nextDouble();
            conta.depositar(deposito);
        }
        banco.cadastrarConta(conta);
        System.out.println("Conta cadastrada com sucesso");
    }

    private static void acessarConta() {
        System.out.println("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        Conta conta = banco.buscarConta(numeroConta);
        if (conta != null) {
            menuConta(conta);
        }
        else {
            System.out.println("Conta não encontrada");
        }
    }

    private static void exibirContasDoCliente() {
        System.out.println("Informe o ID do Cliente: ");
        int idCliente = scanner.nextInt();
        List<Conta> contasCliente = banco.buscarContasDoCliente(idCliente);
        if (contasCliente.isEmpty()) {
            System.out.println("Não há nenhum cliente cadastrado com esse ID");
        } else {
            System.out.println("===========================");
            System.out.println("Lista das Contas Do Cliente");
            System.out.println("===========================");
            for(Conta c : contasCliente) {
                c.imprimirExtrato();
                System.out.println("===========================");
            }
        }
    }

    private static void exibirTodasAsContas() {
        List<Conta> todasContas = banco.getContas();
        if (todasContas.isEmpty()) {
            System.out.println("Não há nenhuma conta cadastrada");
        } else {
            System.out.println("============================");
            System.out.println("Lista das Contas Cadastradas");
            System.out.println("============================");
            for(Conta c : todasContas) {
                c.imprimirExtrato();
                System.out.println("============================");
            }
        }
    }

    private static void exibirTodosOsClientes() {
        List<Cliente> todosClientes = banco.getClientes();
        if (todosClientes.isEmpty()) {
            System.out.println("Não há nenhum cliente cadastrado");
        } else {
            System.out.println("============================");
            System.out.println("Lista das Contas Cadastradas");
            System.out.println("============================");
            for(Cliente cliente : todosClientes) {
                cliente.exibirInfos();
                System.out.println("============================");
            }
        }
    }

    private static void menuConta(Conta conta) {
        int optConta = -1;
        do {
            System.out.println("===== Menu Conta =====");
            System.out.println("[1] Visualizar Conta");
            System.out.println("[2] Sacar");
            System.out.println("[3] Depositar");
            System.out.println("[4] Transferir");
            System.out.println("[5] Excluir Conta");
            System.out.println("[0] Sair");
            optConta = scanner.nextInt();
            switch (optConta) {
                case 1:
                    conta.imprimirExtrato();
                    break;
                case 2:
                    sacarValorConta(conta);
                    break;
                case 3:
                    depositarValorConta(conta);
                    break;
                case 4:
                    transferirValorConta(conta);
                    break;
                case 5:
                    banco.excluirConta(conta);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(optConta != 0);
    }

    private static void sacarValorConta(Conta conta) {
        System.out.println("Informe o valor que deseja sacar: R$ ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        banco.atualizarConta(conta);
    }
    private static void depositarValorConta(Conta conta) {
        System.out.println("Informe o valor que deseja depositar: R$ ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        banco.atualizarConta(conta);
    }
    private static void transferirValorConta(Conta conta) {
        System.out.println("Informe o número da conta que você deseja fazer a transferência: ");
        int numeroContaTransf = scanner.nextInt();
        Conta contaTransf = banco.buscarConta(numeroContaTransf);
        if (contaTransf == null) {
            System.out.println("Conta inválida");
        } else {
            System.out.println("Informe o valor que deseja transferir: R$ ");
            double transferencia = scanner.nextDouble();
            conta.transferir(transferencia, contaTransf);
            banco.atualizarConta(conta);
            banco.atualizarConta(contaTransf);
        }
    }
}