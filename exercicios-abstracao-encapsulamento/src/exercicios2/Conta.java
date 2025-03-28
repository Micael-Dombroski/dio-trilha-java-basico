package exercicios2;

public class Conta {

    private String usuario;
    private double saldo;
    private double chequeEspecial;
    private double valorEmChequeEspecial;
    private int numero;
    private String agencia;
    private double valorTaxaChequeEspecial;

    public Conta(String usuario, double saldo, int numero, String agencia) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        definirLimiteChequeEspecial(saldo);
        this.valorEmChequeEspecial = 0.00;
    }

    private void definirLimiteChequeEspecial(double saldo) {
        chequeEspecial = saldo > 500.00 ? saldo*0.5 : 50.00;
        System.out.println("Seu limite no cheque especial é de R$ " + chequeEspecial);
    }

    public double getValorEmChequeEspecial() {
        return valorEmChequeEspecial;
    }
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public double getValorTaxaChequeEspecial() {
        return valorTaxaChequeEspecial;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setValorEmChequeEspecial(double valorEmChequeEspecial) {
        this.valorEmChequeEspecial = valorEmChequeEspecial;
    }
    public void setValorTaxaChequeEspecial() {
        this.valorTaxaChequeEspecial = valorEmChequeEspecial*0.2;
    }

}
