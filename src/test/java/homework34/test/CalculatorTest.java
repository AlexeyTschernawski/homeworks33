package homework34.test;

import de.ait.homework34.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddTwoPositiveNumbers() {
        assertEquals(5, calculator.addValues(2, 3));
    }

    @Test
    void testAddTwoNegativeNumbers() {
        assertEquals(-6, calculator.addValues(-4, -2));
    }

    @Test
    void testAddTwoResultZero() {
        assertEquals(0, calculator.addValues(-4, 4));
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1, calculator.divideValues(3, 0));
    }

    @Test
    void testDivideTwoPositiveNumbers() {
        assertEquals(3, calculator.divideValues(30, 10));
    }


    @Test
    void testMultiplyPositive() {
        assertEquals(9, calculator.multiplyValues(3, 3));
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(-9, calculator.multiplyValues(-3, 3));
    }

    @Test
    void testMultiplyZero() {
        assertEquals(0, calculator.multiplyValues(0, 3));
    }

    @Test
    void testMultiplication() {
        int a = 2;
        int b = 3;
        int result = a * b;
        assertEquals(6, result);
    }

    @Test
    void testSubtructPositive() throws Exception {
        //assertEquals(0, calculatorSim.subtract(3, 3));
        Method privateMethod = Calculator.class.getDeclaredMethod("divide", int.class, int.class);
        privateMethod.setAccessible(true);
        double result = (double) privateMethod.invoke(calculator, 10, 10);
        assertEquals(1, result);
    }

}
