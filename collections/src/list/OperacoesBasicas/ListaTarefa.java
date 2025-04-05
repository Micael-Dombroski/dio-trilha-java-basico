package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //Ao instanciar um objeto ListaTarefa ele já cria uma lista vazia
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adcionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            //adiciona todas as tarefas com a descrição informada para a lista de remover
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        //remover todas as tarefas da lista de remover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        //retorna o tamanho da lista
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        //retorna o conteúdo de cada elemento da lista
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adcionarTarefa("Tarefa 1");
        listaTarefa.adcionarTarefa("Tarefa 2");
        listaTarefa.adcionarTarefa("Tarefa 1");
        listaTarefa.adcionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
