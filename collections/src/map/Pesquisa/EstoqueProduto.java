package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributos
    private Map<Long, Produto> produtoMap;

    public EstoqueProduto() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double valor) {
        produtoMap.put(cod, new Produto(valor, nome, qtd));
    }

    public void exibirProdutos() {
        if(!produtoMap.isEmpty()) {
            System.out.println(produtoMap);
        } else {
            System.out.println("Não há nenhum produto cadastrado");
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        if(!produtoMap.isEmpty()) {
            for(Produto p : produtoMap.values()) {
                valorTotalEstoque+= p.getValor() * p.getQtd();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtoMap.isEmpty()) {
            for(Produto p : produtoMap.values()) {
                if(maiorPreco < p.getValor()) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getValor();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtoMap.isEmpty()) {
            for(Produto p : produtoMap.values()) {
                if(menorPreco > p.getValor()) {
                    produtoMaisBarato = p;
                    menorPreco = p.getValor();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorTotal = null;
        if(!produtoMap.isEmpty()) {
            for(Produto p : produtoMap.values()) {
                if (produtoMaiorValorTotal == null) {
                    produtoMaiorValorTotal = p;
                }
                if(produtoMaiorValorTotal.getValor()*produtoMaiorValorTotal.getQtd() < p.getValor()*p.getQtd()) {
                    produtoMaiorValorTotal = p;
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();

        System.out.println("");
        estoque.adicionarProduto(1L, "Produto A", 10, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 2.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();
        System.out.println("");
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("");
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("");
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}
