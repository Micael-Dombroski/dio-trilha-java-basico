package map.Pesquisa;

public class Produto {
    //atributos
    private double valor;
    private String nome;
    private int qtd;

    public Produto(double valor, String nome, int qtd) {
        this.valor = valor;
        this.nome = nome;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto{" + nome + " | R$ " + valor + " | " +
                qtd +
                '}';
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }
}
