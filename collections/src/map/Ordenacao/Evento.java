package map.Ordenacao;

public class Evento {
    //atributos
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "Evento{ " + nome + " | " + atracao + " }";
    }


}
