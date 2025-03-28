public class ResultadoEscola {
    public static void main(String[] args) {
        int nota = 6;

        /*
        //Estrutura condicional composta
        if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
        */

        /*
        //Estrutura condicional encadeada
        if(nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");
        else
            System.out.println("Reprovado");
        */

        //Condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
