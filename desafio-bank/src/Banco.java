import java.util.ArrayList;
import java.util.List;
public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco (String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNome() {

        return nome;
    }
    public List<Conta> getContas() {

        return contas;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    /*public void setContas(List<Conta> contas) {

        this.contas = contas;
    }*/
    public List<Conta> buscarContasDoCliente(int idCliente) {
        List<Conta> contasDoCliente = new ArrayList<>();
        if(!contas.isEmpty() && buscarCliente(idCliente) != null) {
            for (Conta c : contas) {
                if (c.cliente.getIdCliente() == idCliente) {
                    contasDoCliente.add(c);
                }
            }
        }
        return contasDoCliente;
    }
    public Cliente buscarCliente (int idCliente) {
        Cliente clienteBuscado = null;
        if(!clientes.isEmpty() && idCliente > 0) {
            for (Cliente cliente : clientes) {
                if(cliente.getIdCliente() == idCliente) {
                    clienteBuscado = cliente;
                }
            }
        }
        return clienteBuscado;
    }
    public Conta buscarConta (int numero) {
        Conta contaBuscada = null;
        if(!contas.isEmpty() && numero > 0) {
            for (Conta c : contas) {
                if (c.getNumero() == numero) {
                    if (c instanceof ContaCorrente contaCorrente) {
                        contaBuscada = (ContaCorrente)c;
                    } else if (c instanceof ContaPoupanca ContaPoupanca) {
                        contaBuscada = (ContaPoupanca)c;
                    }
                    break;
                }
            }
        }
        else {
            System.out.println("Não há contas cadastradas");
        }
        return contaBuscada;
    }
    public void cadastrarConta (Conta conta) {
        if(conta == null) {
            System.out.println("Conta inválida");
            return;
        }
        if(buscarCliente(conta.cliente.getIdCliente()) == null) {
            cadastrarCliente(conta.cliente);
        }
        contas.add(conta);
    }
    public void excluirConta (Conta conta) {
        if(buscarConta(conta.getNumero()) == null) {
            System.out.println("Conta não cadastrada");
            return;
        }
        contas.remove(conta);
        System.out.println("Conta excluida com sucesso");
    }
    public void atualizarConta (Conta conta) {
        excluirConta(conta);
        cadastrarConta(conta);
    }
    private void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
