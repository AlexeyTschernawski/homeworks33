package calculator;

import de.ait.homework34.CalculatorSim;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSimTest {

    private CalculatorSim calculatorSim;

    @BeforeEach
    public void setUp() {
        calculatorSim = new CalculatorSim();
    }

    @Test
     void testAddTwoPositiveNumbers() {
        assertEquals(5, calculatorSim.add(2, 3));
    }

    @Test
     void testAddTwoNegativeNumbers() {
        assertEquals(-6, calculatorSim.add(-4, -2));
    }

    @Test
     void testAddTwoResultZero() {
        assertEquals(0, calculatorSim.add(-4, 4));
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1, calculatorSim.divide(3, 0));
    }

    @Test
     void testDivideTwoPositiveNumbers() {
        assertEquals(3, calculatorSim.divide(30, 10));
    }


    @Test
     void testMultiplyPositive() {
        assertEquals(9, calculatorSim.multyply(3, 3));
    }

    @Test
     void testMultiplyNegative() {
        assertEquals(-9, calculatorSim.multyply(-3, 3));
    }

    @Test
     void testMultiplyZero() {
        assertEquals(0, calculatorSim.multyply(0, 3));
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
        Method privateMethod = CalculatorSim.class.getDeclaredMethod("divide", int.class, int.class);
        privateMethod.setAccessible(true);
        double result = (double) privateMethod.invoke(calculatorSim, 10, 10);
        assertEquals(1, result);
    }



}
