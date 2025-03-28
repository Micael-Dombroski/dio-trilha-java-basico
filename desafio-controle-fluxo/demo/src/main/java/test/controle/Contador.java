package test.controle;

import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //recebendo o primeiro número
        System.out.println("Informe o Primeiro Número: ");
        int numeroUm = scanner.nextInt();

        //recebendo o segundo número
        System.out.println("Informe o Segundo Número: ");
        int numeroDois = scanner.nextInt();
        scanner.close();

        //realizando o método contar
        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            //disparando exceção
            System.err.println("\u001B[31m"+ e + "\u001B[0m");
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem ; i++) {
            System.out.println(i);
        }
    }
}
