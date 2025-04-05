package map.Ordenacao;

import jdk.jfr.Event;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        //Organizando por data(key) os eventos
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        if(!eventoMap.isEmpty()) {
            //Organizando por data(key) os eventos
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Evento proximoEvento = null;
            //entrySet permite retorna o evento e sua chave respectiva, diferente de
            //keySet() que retorna apenas as cheves e values() que retorna os valores
            for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
                //verificando se o evento analisado não possui dada anterior a atual
                if (!entry.getKey().isBefore(dataAtual)) {
                    proximoEvento = entry.getValue();
                    proximaData = entry.getKey();
                    System.out.println("Próximo evento: " + proximoEvento + " - acontecerá na data: " + proximaData);
                    break;
                }
            }

        } else {
            System.out.println("Não há nenhum evento na agenda");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 10, 31), "Evento 4", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 1), "Evento 5", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 14), "Evento 6", "Atração 5");

        agendaEventos.exibirAgenda();
        System.out.println("");
        agendaEventos.obterProximoEvento();
    }
}
