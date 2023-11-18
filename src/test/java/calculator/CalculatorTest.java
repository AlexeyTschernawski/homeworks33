package calculator;

import de.ait.homework34.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class CalculatorTest {

    @Test
    void testMakeOperationAddSuccess(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(15,
                calculator.makeOperation(10, 5, "add"));
    }

    @Test
    void testMakeOperationSubstructSuccess(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5,
                calculator.makeOperation(10, 5, "substruct"));
    }

    @Test
    void testMakeOperationDivideFail(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-1,
                calculator.makeOperation(10, 5, "divide"));
    }

    @Test
    void testAddPrivateSuccess() throws Exception {
        Calculator calculator = new Calculator();
        Method privateMethod =
                Calculator.class.getDeclaredMethod("add", int.class, int.class);
        privateMethod.setAccessible(true);
        int result =  (int) privateMethod.invoke(calculator, 10, 30);
        Assertions.assertEquals(40, result);
    }

}
