import java.util.Comparator;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private  String autor;
    private int ano;

    //Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Usado para ordenar livros por ano
    @Override
    public int compareTo(Livro livro) {
        return this.titulo.compareTo(livro.titulo);
    }

    //Métodos getters para acessar os dados privados
    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    //Métodos setters para definir os dados privados
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

//Classe para comparar livro por autor
class CompararAutor implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return (l1.getAutor().compareTo(l2.getAutor()));
    }
}

//Classe para comparar livro por ano
class CompararAno implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        if(l1.getAno() < l2.getAno()) {
            return -1;
        }
        if(l1.getAno() > l2.getAno()) {
            return 1;
        } else {
            return  0;
        }
    }
}

//Classe para comparar livro por ano, autor e título
class CompararAnoAutorTitulo implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if(ano != 0) {
            return ano;
        }
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if(autor != 0) {
            return autor;
        }
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}