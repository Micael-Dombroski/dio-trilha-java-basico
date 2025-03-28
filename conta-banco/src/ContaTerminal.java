//importando pacotes
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Apresentando o sistema
        System.out.println("Bem-vindo ao Banco Java, para criar sua conta realize as etapas abaixo. :)");

        //Coletando o número da conta do usuário
        System.out.println("Informe o número da sua conta: ");
        int numero = scanner.nextInt();

        //Coletando agência da conta do usuário
        System.out.println("Informe o número da sua agência: ");
        String agencia = scanner.next();

        //Coletando o nome do usuário
        System.out.println("Informe o seu nome: ");
        String nome = scanner.next();

        //Coletando o saldo da conta do usuário
        System.out.println("Informe o saldo de sua conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        //Formulando mensagem com os dados fornecidos
        String mensagem = "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo R$").concat(String.valueOf(saldo)).concat(" já está disponível para saque");

        //Exibindo mensagem com os dados cadastrados pelo cliente
        System.out.println(mensagem);

    }
}
