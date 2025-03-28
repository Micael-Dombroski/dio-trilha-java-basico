import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static final String textoVermelho = "\u001B[31m";
    public static final String resetTexto = "\u001B[0m";
    public static void main(String[] args) {
        try {
            //criando objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();

            /*
            *possíveis exceções:
            *Não informar nome e sobrenome
            *Valor da idade != int
            *Altura ter vírgula invés de ponto (padrão americano usa ponto)
            */
        } catch (InputMismatchException e){
            System.err.println(textoVermelho + "Os campos idade e altura precisam ser numéricos" + resetTexto);
        }
    }
}
