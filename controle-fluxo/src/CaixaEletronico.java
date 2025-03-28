public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        /*
        //Estrutura condicional simples
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        */
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else //se houve apenas 1 linha para condição não precisa criar bloco "{}"
            System.out.println("Saldo insuficiente");
        
    }
}
