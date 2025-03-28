import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import test.controle.Contador;
import test.controle.ParametrosInvalidosException;

class ContadorTest {

    // Testa a contagem com números válidos (o segundo número é maior que o primeiro)
    @Test
    void testContarComNumerosValidos() {
        // Espera-se que o método execute sem lançar exceção
        assertDoesNotThrow(() -> Contador.contar(2, 5), "Deveria contar sem erros com números válidos.");
    }

    // Testa quando os números são iguais (deve lançar uma exceção)
    @Test
    void testContarComNumerosIguais() {
        // Espera-se que uma exceção seja lançada com a mensagem correta
        Exception exception = assertThrows(ParametrosInvalidosException.class, () -> Contador.contar(5, 5));
        // Verifica se a mensagem da exceção é a esperada
        assertEquals("O segundo número deve ser maior que o primeiro.", exception.getMessage(), "A mensagem da exceção está incorreta.");
    }

    // Testa quando o segundo número é menor que o primeiro (também deve lançar exceção)
    @Test
    void testContarComSegundoNumeroMenor() {
        // Espera-se que uma exceção seja lançada com a mensagem correta
        Exception exception = assertThrows(ParametrosInvalidosException.class, () -> Contador.contar(10, 3));
        // Verifica se a mensagem da exceção é a esperada
        assertEquals("O segundo número deve ser maior que o primeiro.", exception.getMessage(), "A mensagem da exceção está incorreta.");
    }
}