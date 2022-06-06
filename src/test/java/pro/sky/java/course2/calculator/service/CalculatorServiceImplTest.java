package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.constants.ConstantsTest.*;

class CalculatorServiceImplTest {
    CalculatorService out = new CalculatorServiceImpl();

    @Test
    void shouldReturnCorrectMessage() {
        assertEquals(DEFAULT_MESSAGE,out.welcome());
    }

    @Test
    void sum() {
        assertEquals(NUM1TEST + NUM2TEST, out.sum(NUM1TEST, NUM2TEST));
    }

    @Test
    void subtract() {
        assertEquals(NUM1TEST - NUM2TEST, out.subtract(NUM1TEST, NUM2TEST));
    }

    @Test
    void multiply() {
        assertEquals(NUM1TEST * NUM2TEST, out.multiply(NUM1TEST, NUM2TEST));
    }

    @Test
    void divide() {
        assertEquals(NUM1TEST / NUM2TEST, out.divide(NUM1TEST, NUM2TEST));
    }

    @Test
    void exception() {
        assertThrows(IllegalArgumentException.class, (() -> out.divide(NUM1TEST, ZERO)));
    }
}