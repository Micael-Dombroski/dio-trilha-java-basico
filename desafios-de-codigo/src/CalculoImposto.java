import java.util.Scanner;
import java.util.Locale;

public class CalculoImposto {
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //O usuário informa seu salário bruto
        System.out.println("Informe seu salário bruto: R$ ");
        float valorSalario = scanner.nextFloat();

        //O usuário informa o valor de seus benefícios
        System.out.println("Informe o valor total de benefícios que recebe: R$ ");
        float valorBeneficios = scanner.nextFloat();
        scanner.close();
        if (valorSalario > 0.00f) {
            //Calculando o imposto
            float valorImposto = calcularImposto(valorSalario);

            //Calculando a diferença entre o salário bruto e o valor de impostos somado ao valor dos benefícios
            float saida = (valorSalario - valorImposto) + valorBeneficios;

            //Formatando o float para ter apenas 2 casas decimais
            System.out.println(String.format("%.2f", saida));
        } else {
            System.out.println("O salário bruto deve ser maior que R$ 0.00");
        }
    }

    //Método para calcular o imposto de acordo com a aliquota para cada grupo de valor
    static float calcularImposto(float salarioBruto) {
        float aliqImposto = 0.00f;
        if (salarioBruto > 0.00f && salarioBruto <= 1100.00f) {
            aliqImposto = 0.05f;
        } else if (salarioBruto <= 2500.00f) {
            aliqImposto = 0.10f;
        } else {
            aliqImposto = 0.15f;
        }
        return salarioBruto*aliqImposto;
    }
}