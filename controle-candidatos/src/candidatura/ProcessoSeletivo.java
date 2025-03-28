package candidatura;
import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static final String RESET = "\u001B[0m";
    public static final String REPROVADO = "\u001B[31m";
    public static final String APROVADO = "\u001B[32m";
    public static final String ANALISAR = "\u001B[33m";
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        //selecaoCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
        }
    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    /*

    //Simulando a exibição de lista dos candidatos selecionados
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreivada de interação: for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    */

    /*

    //Simulando a seleção dos candidatos
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário:  R$ " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println(APROVADO + "O candidato " + candidato + " foi selecionado para a vaga" + RESET);
            } else {
                System.out.println(REPROVADO + "O candidato " + candidato + " foi reprovado" + RESET);
            }
            candidatoAtual++;
        }
    }

    //método que simula o valor pretendido dos candidatos
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    */

    /*

    //método que analisa o salário pretendido com o salário ofertado
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println(APROVADO + "LIGAR PARA O CANDIDATO" + RESET);
        } else if (salarioBase == salarioPretendido) {
            System.out.println(ANALISAR + "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA" + RESET);
        } else {
            System.out.println(REPROVADO + "AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS" + RESET);
        }
    }

    */
}