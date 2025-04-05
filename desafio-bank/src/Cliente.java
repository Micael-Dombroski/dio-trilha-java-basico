public class Cliente {
    private static int SEQUENCIAL_ID_CLIENTE = 1;
    private int idCliente;
    private String nome;
    public String getNome () {
        return nome;
    }
    public int getIdCliente () {
        return idCliente;
    }
    public Cliente(String nome) {
        this.idCliente = SEQUENCIAL_ID_CLIENTE++;
        this.nome = nome;
    }
    public void exibirInfos() {
        System.out.println(String.format("ID: %d", idCliente));
        System.out.println(String.format("Nome: %s", nome));
    }
}
