package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);

    }

    @Test
    void multiply() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(2, 3);

        assertEquals(6, result);

    }

}
