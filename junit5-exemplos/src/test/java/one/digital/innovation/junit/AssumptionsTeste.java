package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioMatheus(){
        Assumptions.assumeTrue("mt121".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }

    // Assumptions significa que só será executado se aquela condição for true ou false, neste caso se o usuario for matheus, aí fará o teste abaixo.


}
