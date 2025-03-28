import app.FacebookMessenger;
import app.MSNMessenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        /*
        System.out.println("MESSENGER");
        //Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        //precisa saber dessa validação?
            //msn.validarConectadoInternet();
        msn.enviarMensagem();
        //o usuário precisa saber desse método?
            //msn.salvarHistoricoMensagem();

        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        */
        ServicoMensagemInstantanea smi = null;

        /*
         * Não se sabe qual app
         * mas qualquer um deverá enviar e receber mensagem
         */
        String appEscolhido = "fbm";
        if(appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }
        //eu não sei quem é, mas qualquer um vai retornar essas propriedades de acordo com suas especialidades
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
