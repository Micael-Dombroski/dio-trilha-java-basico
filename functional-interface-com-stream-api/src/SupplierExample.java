import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem-vindo(a)/2")
                .limit(2)
                .toList();

        //Imprimir as saudações geradas
        //listaSaudacoes.forEach(s -> System.out.println(s));
        //Usando method reference
        listaSaudacoes.forEach(System.out::println);
    }
}
