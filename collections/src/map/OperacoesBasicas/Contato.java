package map.OperacoesBasicas;

public class Contato {
    //atributos
    private String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato { " + nome + " | " + telefone + " }";
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }
}
