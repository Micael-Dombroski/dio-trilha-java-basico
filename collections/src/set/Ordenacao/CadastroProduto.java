package set.Ordenacao;

import javax.swing.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd) {
        produtoSet.add(new Produto(cod, nome,  preco, qtd));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        System.out.println(produtosPorNome);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);

        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.exibirProdutosPorNome();

        cadastroProduto.adicionarProduto(1, "Coca", 2.50, 8);
        cadastroProduto.adicionarProduto(2, "Salgadinho", 8.75, 12);
        cadastroProduto.adicionarProduto(3, "Suco", 0.99, 30);
        cadastroProduto.adicionarProduto(4, "Sorvete", 12.50, 6);
        cadastroProduto.adicionarProduto(5, "Amaciante", 17.90, 8);
        cadastroProduto.adicionarProduto(6, "Churrasco", 85.89, 3);
        cadastroProduto.adicionarProduto(7, "Chinelo", 19.99, 7);

        System.out.println("");
        System.out.println(cadastroProduto.produtoSet);
        System.out.println("");
        cadastroProduto.exibirProdutosPorNome();
        System.out.println("");
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
