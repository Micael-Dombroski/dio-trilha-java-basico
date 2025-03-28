package app;
public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Envidando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem no Facebook");
    }
}
