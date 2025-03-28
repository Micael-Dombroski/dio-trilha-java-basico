package exercicios2;

public class ATM {
    public Conta conta;
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + conta.getSaldo());
    }

    public void consultarChequeEspecial () {
        System.out.println("Seu valor atual no cheque especial é: R$ " + conta.getValorEmChequeEspecial() + " | Seu limite no cheque especial é: R$ " + conta.getChequeEspecial());
        System.out.println("Você deverá pagar uma taxa de: R$ " + conta.getValorTaxaChequeEspecial());
    }

    public void depositar(double deposito) {

        //verificando se é um valor possível para depósito
        if (deposito <= 0.00) {
            System.out.println("Valor inválido!");
            return;
        }

        //verificando se a conta tá em cheque especial
        if(conta.getValorEmChequeEspecial() > 0.00) {

            //verifica se o valor em depósito é o bastantate para sair do cheque especial e quitar a taxa do uso do cheque especial
            if (conta.getValorEmChequeEspecial() < deposito-conta.getValorTaxaChequeEspecial()) {
                conta.setSaldo(conta.getSaldo()+(deposito-conta.getValorTaxaChequeEspecial())-conta.getValorTaxaChequeEspecial());
                conta.setValorEmChequeEspecial(0.00);
                conta.setValorTaxaChequeEspecial();

            //verificando se o valor de depósito é o suficiente pelo menos para sair do cheque especial
            } else if (conta.getValorEmChequeEspecial() == deposito) {
                conta.setValorEmChequeEspecial(0.00);
                conta.setSaldo(conta.getSaldo()+deposito);

            //reduzindo o valor do depósito da situação atual do cheque especial
            } else{
                conta.setSaldo(conta.getSaldo() + (deposito-conta.getValorTaxaChequeEspecial()));
                conta.setValorEmChequeEspecial(conta.getValorEmChequeEspecial()-(deposito));
            }
        }

        //se a conta não estiver em cheque especial
        else {

            //verifica se há alguma taxa pelo uso do cheque especial pendente e desconta do valor do depósito
            if (conta.getValorTaxaChequeEspecial() > 0.00) {
                deposito -= conta.getValorTaxaChequeEspecial();
                conta.setValorTaxaChequeEspecial();
            }
            conta.setSaldo(conta.getSaldo()+deposito);
        }
        System.out.println("Depósito realizado com sucesso");
    }

    public void sacar(double saque) {

        //verificando se é um valor possível para saque
        if (saque <= 0.00 || saque > (conta.getSaldo()+conta.getChequeEspecial())) {
            System.out.println("Não foi possível realizar o saque, tente sacar outra quantia de dinheiro!");
            return;
        }

        //verificando se o saque é maior que o saldo, se for, o cheque especial será usado
        if (saque > conta.getSaldo()) {
            System.out.println("Você está no cheque especial");
            conta.setValorEmChequeEspecial(conta.getValorEmChequeEspecial()+(saque-conta.getSaldo()));
            conta.setValorTaxaChequeEspecial();
        }

        //se o valor do saque for inferior ou igual ao saldo o saque é realizado sem o uso de outros métodos
        conta.setSaldo(conta.getSaldo()-(saque));
        System.out.println("Saque efetuado com sucesso!");
    }

    public void pagarBoleto(double valor) {

        //verificando se é um valor válido
        if (valor > conta.getSaldo()+conta.getChequeEspecial()) {
            System.out.println("Você não tem saldo o suficiente para pagar este boleto");
            return;
        }

        //verificando se o valor do boleto é maior que o saldo, se for, o cheque especial será usado
        if (valor > conta.getSaldo()) {
            System.out.println("Você está no cheque especial");
            conta.setValorEmChequeEspecial(conta.getValorEmChequeEspecial()+(valor-conta.getSaldo()));
            conta.setValorTaxaChequeEspecial();
        }

        //se o valor do boleto for interior ao saldo o pagamento será feito sem o uso de outros métodos
        conta.setSaldo(conta.getSaldo()-(valor));
        System.out.println("Boleto pago com sucesso!");
    }

    public void verificarContaEmChequeEspecial () {
        if (conta.getValorEmChequeEspecial() > 0.00 ) {
            System.out.println("Sua conta está em cheque especial");
            System.out.println("Para mais informações consulte seu cheque especial");
            return;
        }
        System.out.println("Sua conta não está em cheque especial");
        System.out.println("Para saber seu limite de cheque especial consulte seu cheque especial");
    }
}
