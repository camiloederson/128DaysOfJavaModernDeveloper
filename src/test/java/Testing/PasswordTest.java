package Testing;

import org.junit.jupiter.api.Test;

import static Testing.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password password = new Password();

    @Test
    void shouldReturnAException(){
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> password.provePassword(null));
        assertEquals("Password must not be null", exception.getMessage());
    }

    @Test
    void shouldReturnWeakForLength(){
        assertEquals(WEAK, password.provePassword("aaa"));
    }

    @Test
    void shouldReturnWeakForJustoLetters(){
        assertEquals(WEAK, password.provePassword("aBCdAbCD"));
    }

    @Test
    void shouldReturnMedium(){
        assertEquals(MEDIUM, password.provePassword("abCD1234"));
    }

    @Test
    void shouldReturnStrong(){
        assertEquals(STRONG, password.provePassword("ABCD123!"));
    }

}