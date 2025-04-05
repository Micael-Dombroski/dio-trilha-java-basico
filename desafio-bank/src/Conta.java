public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(!(valor > 0 && valor <= saldo)) {
            System.out.println("Valor de saque inválido");
            return;
        }
        this.saldo-=valor;

    }

    @Override
    public void depositar(double valor) {
        if(valor<=0) {
            System.out.println("Valor de depósito inválido");
            return;
        }
        this.saldo+= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular : %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
