package test;

import calculator.Calculator;
import calculator.CalculatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorImplTest {

    Calculator calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new CalculatorImpl();
    }

    @Test
    void addTest() {
        int add = calculator.add(1, 2);
        assertEquals(add, 3);
    }

    @Test
    @DisplayName("뺄셈")
    void subtractTest() {
        int subtract = calculator.subtract(3, 4);
        assertEquals(subtract, -1);
    }

    @Test
    @DisplayName("곱셈")
    void multiplyTest() {
        int multiply = calculator.multiply(3, 4);
        assertEquals(multiply, 12);
    }

    @Test
    void divideTest() {
        int divide = calculator.divide(4, 2);
        assertEquals(divide, 2);
    }
}
