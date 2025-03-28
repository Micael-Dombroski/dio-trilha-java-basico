package exercicio2.ingressos;

public class Cinema {
    private int qtdIngressos;
    private Ingresso ingresso;

    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }
    public int getQtdIngressos() {
        return qtdIngressos;
    }
    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
    public void setIngresso(IngressoFamilia ingressoFamilia) {
        this.ingresso = ingressoFamilia;
    }
    public void setIngresso(IngressoMeiaEntrada ingressoMeiaEntrada) {
        this.ingresso = ingressoMeiaEntrada;
    }
    public Ingresso getIngresso() {
        if (ingresso instanceof IngressoFamilia ingressoFamilia) {
            return ingressoFamilia;
        } else if (ingresso instanceof IngressoMeiaEntrada ingressoMeiaEntrada) {
            return ingressoMeiaEntrada;
        }
        return ingresso;
    }
    public void valorTotal() {
        System.out.println("===================================");
        System.out.println("Informações da Compra dos Ingressos");
        System.out.println("===================================");
        System.out.println("Filme: " + ingresso.getFilme() + " (" + ingresso.filmeDubladoOuLegendado() + ")");
        System.out.println("Quantidade de ingressos: " + qtdIngressos);
        System.out.println("Tipo de ingresso: " + (ingresso instanceof IngressoMeiaEntrada ? "Meia Entrada" : ingresso instanceof IngressoFamilia? "Família" : "Normal"));
        System.out.println("Valor de cada ingresso: R$ " + ingresso.getValor());
        System.out.println("===================================");
        if (ingresso instanceof IngressoFamilia ingressoFamilia) {
            System.out.println("Valor total: R$ " + ingressoFamilia.getValor(qtdIngressos) * qtdIngressos);
        } else {
            System.out.println("Valor total: R$ " + (ingresso.getValor() * qtdIngressos));
        }
        System.out.println("===================================");
    }
}
