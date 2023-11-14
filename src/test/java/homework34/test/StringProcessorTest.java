package homework34.test;

import de.ait.homework34.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    private static final String HALLO_STRING = "Hallo ";

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
        boolean naga = true;
    }

    @Test
    void testIsPalindromeTrue(){
        Assertions.assertTrue(stringProcessor.isPalindrome("HolloH"));
    }

    @Test
    void testIsPalindromeFalse(){
        Assertions.assertFalse(stringProcessor.isPalindrome(HALLO_STRING));
    }

    @Test
    void testReverseHappyPath(){
        Assertions.assertEquals(" ollaH", stringProcessor.reverse(HALLO_STRING));
    }

    @Test
    void testReverseParamEmpty(){
        Assertions.assertEquals("", stringProcessor.reverse(""));
    }

}
