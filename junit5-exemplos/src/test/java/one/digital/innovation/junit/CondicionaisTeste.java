package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_17;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;

public class CondicionaisTeste {

    // aqui estamos passando o usuario e "habilitando" o teste se o usuario for "matheus"
    @Test
    @EnabledIfEnvironmentVariable(named="USERNAME", matches ="mt121")
    void validarAlgoSomenteNoUsuarioMatheus(){
        Assertions.assertEquals(10, 5 + 5);
    }

    // aqui estamos passando o usuario e "desabilitando" o teste se o usuario for "matheus"
    @Test
    @DisabledIfEnvironmentVariable(named="USER", matches ="matheus")
    void validarAlgoSomenteNoUsuarioMatheus2(){
        Assertions.assertEquals(10, 5 + 5);
    }

    // somente rodará o teste se o sistema operacional for linux
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioMatheus3(){
        Assertions.assertEquals(10, 5 + 5);
    }

    // rodar o teste em uma JRE específica
    @Test
    @EnabledOnJre(JAVA_17)
    void validarAlgoSomenteNoUsuarioMatheus4(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
