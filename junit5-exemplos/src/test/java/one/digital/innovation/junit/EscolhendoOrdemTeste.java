package one.digital.innovation.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Desta forma preisa passar @Order() em cada teste
//@TestMethodOrder(MethodOrderer.MethodName.class) // Executa levando em consideração ordem alfabética em cada método e não precisa utilizar @Order()
//@TestMethodOrder(MethodOrderer.Random.class) // Executa de forma aleatória.
@TestMethodOrder(MethodOrderer.DisplayName.class) // Executa de acordo com a ordem alfabética e numérica, mas mostra o @DisplayName() em cada método caso queira personalizar o nome do teste.
public class EscolhendoOrdemTeste {

//    @Order(4)
    @DisplayName("Testando 1")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("Testando 2")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("Testando 4-3")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("Testando 4")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

}
