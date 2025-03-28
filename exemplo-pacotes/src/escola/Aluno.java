package escola;

public class Aluno {
    //Só podem ser manipulados pelos métodos
    private String nome;
    private int idade;

    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    //métodos gerados pela IDE VS Code
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //feitos manualmente
    /*public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        idade = newIdade;
    }*/

}
