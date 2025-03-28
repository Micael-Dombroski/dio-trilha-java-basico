package exercicio2.ingressos;

public class Ingresso {
    private double valor;
    private String filme;
    private boolean dublado;

    public Ingresso() {
        this.valor = 40.00;
        this.dublado = false;
        this.filme = "Lua de Mel";
    }
    public double getValor() {
        return valor;
    }
    protected void setValor(double valor) {
        this.valor = valor;
    }
    public String getFilme() {
        return filme;
    }
    protected void setFilme(String filme) {
        this.filme = filme;
    }
    public boolean eDublado() {
        return dublado;
    }
    protected void setDublado(boolean dublado) {
        this.dublado = dublado;
    }
    public String filmeDubladoOuLegendado() {
        return dublado ? "Dublado" : "Legendado";
    }
}
