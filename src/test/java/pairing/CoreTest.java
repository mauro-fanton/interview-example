package pairing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoreTest {

    @Test
    @DisplayName("Return the parameter value")
    public void aFunctionShouldReturnAValue(){
        assertEquals(2, Core.aFunction(2));
    }
}