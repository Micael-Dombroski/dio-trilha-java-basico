package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
            //cozinheiro.lavarIngredientes();
            //cozinheiro.baterVitaminaLiquidificador();
            //cozinheiro.selecionarIngredientesVitamina();
            //cozinheiro.prepararLanche();
            //cozinheiro.prepararVitamina();
            //cozinheiro.prepararCombo();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
            //almoxarife.controlarEntrada();
            //almoxarife.controlarSaida();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
            //almoxarife.entregarIngredientes();
            //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
            //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ações que somente o seu pacote cozinha precisa conhecer (default)
            //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda não definiu normas de atendimento
            //cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, que tal ser privada?
            //cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou?
            //cozinheiro.pedirParaTrocarGas(atendente);
            //cozinheiro.pedirParaTrocarGas(almoxarife);
        
    }
}
