package map.OperacoesBasicas;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    //por ser generics não permite tipos primitivos(tipo int)
    //permite apenas objetos (tipo Integer)
    public Map<String, Integer> getContatoMap() {
        return contatoMap;
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatoMap.isEmpty()) {
            contatoMap.remove(nome);
        } else {
            System.out.println("Agenda de contatos está vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!contatoMap.isEmpty()) {
            if(contatoMap.containsKey(nome)) {
                numeroPorNome = contatoMap.get(nome);
            }
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado");
            }
        } else {
            System.out.println("Agenda de contatos está vazia");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        //salva as informações da última Camila pois o put server para inserir e atualizar
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();
        System.out.println("");
        System.out.println(agendaContatos.contatoMap.size());
        agendaContatos.removerContato("Maria Silva");
        System.out.println("");
        System.out.println(agendaContatos.contatoMap.size());
        System.out.println("");
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
