package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        // ARRANGE
        Calculator calculator = new Calculator();

        // ACT
        int result = calculator.addition(1, 2);

        // ASSERT
        assertEquals(3, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers(){
        // ARRANGE
        Calculator calculator = new Calculator();

        // ACT
        int result = calculator.addition(-1, -2);

        // ASSERT
        assertEquals(-3, result);
    }
};