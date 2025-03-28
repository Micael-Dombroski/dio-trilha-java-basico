package app;
public abstract class ServicoMensagemInstantanea {
    //quem quiser ser um serviço de mensagem precisa implementar esses métodos
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    protected abstract void salvarHistoricoMensagem();
}
