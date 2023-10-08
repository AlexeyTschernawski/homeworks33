package homework34.test;

import de.ait.homework34.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() { stringProcessor = new StringProcessor(); }

    @Test
    public void testConcatenateString () {
        assertEquals("mama", stringProcessor.concatenate("ma","ma"));}

    @Test
    public void testLengthString () {
        assertEquals(4, stringProcessor.getLength("mama"));}

    @Test
    public void testReverseString () {
        assertEquals("hallo", stringProcessor.reverse("ollah"));}

    @Test
    public void testPalindromeString () {
        boolean nagan = true;
    }
}
