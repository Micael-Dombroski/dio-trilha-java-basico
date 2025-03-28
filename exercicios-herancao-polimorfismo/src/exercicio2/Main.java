package exercicio2;

import exercicio2.ingressos.Cinema;
import exercicio2.ingressos.Ingresso;
import exercicio2.ingressos.IngressoFamilia;
import exercicio2.ingressos.IngressoMeiaEntrada;

import java.util.Scanner;

public class Main {
    /* 
    Crie uma hierarquia de classes para tratar os tipos de ingresso 
    que podem ser comercializados em um cinema. O ingresso deve ter 
    um valor, nome do filme e informar se é dublado ou legendado. 
    A partir desse ingresso devem ser criados os tipos Meia entrada 
    e ingresso família. Cada ingresso deve ter um método que retorna 
    o seu valor real ( baseado no valor informado na criação do 
    ingresso) para os de meia entrada o seu valor deve ser de metade 
    do valor, para os ingressos família deve-se retornar o valor 
    multiplicado pelo número de pessoas e fornecer um desconto de 5% 
    quando o número de pessoas for maior que 3.
    */
    static Cinema cinema = new Cinema();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var opt = -1;
        do {
            System.out.println("=================================");
            System.out.println("===========Menu Cinema===========");
            System.out.println("=================================");
            System.out.println("[1] Consultar filme");
            System.out.println("[2] Verificar tipos de ingressos");
            System.out.println("[3] Comprar ingressos");
            System.out.println("[0] Sair");
            System.out.println("=================================");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Filme exibido: " + new Ingresso().getFilme() + "(" + new Ingresso().filmeDubladoOuLegendado() + ")");
                    break;
                case 2:
                    OpcaoDeIngresso();
                    break;
                case 3:
                    comprarIngressos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("[3RR0R] Opção inválida");
                    break;
            }
        } while (opt !=0);
        scanner.close();
    }
    private static void comprarIngressos() {
        boolean tipoValidoIngresso;
        do {
            tipoValidoIngresso = true;
            System.out.println("Escolha o tipo de ingresso");
            System.out.println("--------------------------");
            System.out.println("[1] Ingresso Normal");
            System.out.println("[2] Ingresso Família");
            System.out.println("[3] Ingresso Meia Entrada");
            int escolherIngresso = scanner.nextInt();
            switch (escolherIngresso) {
                case 1:
                    cinema.setIngresso(new Ingresso());
                    break;
                case 2:
                    cinema.setIngresso(new IngressoFamilia());
                    break;
                case 3:
                    cinema.setIngresso(new IngressoMeiaEntrada());
                    break;
                default:
                    System.out.println("[3RR0R] Opção inválida");
                    tipoValidoIngresso = false;
                    break;
            }
        } while (!tipoValidoIngresso);
        int nIngressos = 0;
        do {
            System.out.println("Quantos ingressos deseja comprar? ");
            nIngressos = scanner.nextInt();
            if (nIngressos <= 0 ) {
                System.out.println("O número de ingressos deve ser maior que zero");
            }
        } while (nIngressos <= 0);
        cinema.setQtdIngressos(nIngressos);
        System.out.println("Cheque as informações abaixo sobre sua compra: ");
        cinema.valorTotal();
        System.out.println("Bom filme ;)");
    }
    private static void OpcaoDeIngresso() {
        System.out.println("Tipos de ingressos disponíveis");
        System.out.println("--------------------------------------------------");
        System.out.println("|    Tipo    |   Qtd Miníma    |  Preço unitário |");
        System.out.println("--------------------------------------------------");
        System.out.println(  "|   Normal   |        1        |     R$ " + new Ingresso().getValor() + "     |");
        System.out.println(  "|  Família   |        3        |     R$ " + new Ingresso().getValor()*0.95 + "     |");
        System.out.println(  "|Meia Entrada|        1        |     R$ " + new IngressoMeiaEntrada().getValor() + "     |");
        System.out.println("--------------------------------------------------");
        System.out.println("*Precisa comprar pelo menos 3 Ingressos Família para ter seu desconto");
    }
}
