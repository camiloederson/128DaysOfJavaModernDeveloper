package Testing;

import org.junit.jupiter.api.Test;

import java.security.PrivateKey;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        // ACT
        double result = calculator.addition(1, 2);

        // ASSERT
        assertEquals(3, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers(){
        // ACT
        double result = calculator.addition(-1, -2);

        // ASSERT
        assertEquals(-3, result);
    }

    @Test
    void shouldDivideTwoValidNumbers(){
        double result = calculator.division(10, 2);
        assertEquals(5, result);
    }

    @Test
    void shouldThrowAnArithmeticException(){
        ArithmeticException exception =
                assertThrows(ArithmeticException.class,
                        ()  -> calculator.division(1, 0));
    }

    @Test
    void shouldSubtractTw0Numbers(){
        double result = calculator.subtraction(10, 5);
        assertEquals(5, result);
    }

    @Test
    void shouldMultiplyTwoNumbers(){
        double result = calculator.multiplication(10 , 10);
        assertEquals(100, result);
    }
};