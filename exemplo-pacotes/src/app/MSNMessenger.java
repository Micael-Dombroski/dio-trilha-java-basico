package app;
public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Envidando mensagem pelo MSNMessenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSNMessenger");
    }
    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem no MSNMessenger");
    }
}
