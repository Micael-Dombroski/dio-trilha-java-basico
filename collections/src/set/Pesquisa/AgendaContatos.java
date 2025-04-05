package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(contatoSet.isEmpty()) {
            System.out.println("A lista de contatos está vazia");
        }
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        } else {
            System.out.println("Não há nenhum contato cadastrado");
        }
        if(contatosPorNome.isEmpty()) {
            System.out.println("Não foi encontrado nenhum contato com o nome: " + nome);
        }
        return  contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        } else {
            System.out.println("Não há nenhum contato cadastrado");
        }
        if (contatoAtualizado == null) {
            System.out.println("Não foi encontrado nenhum contato com o nome: " + nome);
        }
        return  contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);//não adiciona, já existe "Camila"
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 11111);
        agendaContatos.adicionarContato("Mariana Rodrigues", 66666);

        agendaContatos.exibirContatos();
        System.out.println("");
        System.out.println((agendaContatos.pesquisarPorNome("Camila")));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555));

        System.out.println("");
        agendaContatos.exibirContatos();
    }
}
