package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.constants.ConstantsTest.*;


class CalculatorServiceImplParameterizedTest {
    CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1TEST, NUM1TEST),
                Arguments.of(NUM2TEST, NUM2TEST)
                );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void sum(int num1, int num2) {
        assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void subtract(int num1, int num2) {
        assertEquals(num1 - num2, out.subtract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }
}