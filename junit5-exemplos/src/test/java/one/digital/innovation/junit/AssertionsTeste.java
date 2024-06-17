package one.digital.innovation.junit;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;

public class AssertionsTeste {

    // Teste para verificar se os dois arrays são iguais.
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        // o teste dará erro porque os valores dos arrays não são iguais.
    }

    // Teste para verificar se os dois arrays são diferentes.
    @Test
    void validarLancamentos2(){
        int[] primeiroLancamento2 = {10, 20, 30, 40, 50};
        int[] segundoLancamento2 = {10, 5, 2, 3, 10};

        Assertions.assertNotEquals(primeiroLancamento2, segundoLancamento2);
        // o teste dará certo porque os valores dos arrays não são iguais.
    }

    // Teste para validar se o objeto é nulo.
    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        // Verificar se o objeto é nulo.
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        // Verificar se o objeto não é nulo.
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }


}
