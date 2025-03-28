package app;
public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Envidando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem no Telegram");
    }
}
