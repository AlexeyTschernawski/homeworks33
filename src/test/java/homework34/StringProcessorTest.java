package homework34;

import de.ait.homework34.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    private static final String HALLO_STRING = "Hallo ";

    @BeforeEach
    public void setUp(){
        stringProcessor = new StringProcessor();
    }

    @DisplayName("Test of two correct parameters")
    @Test
    void testConcatenateHappyPath(){
        String result = stringProcessor.concatenate(HALLO_STRING, "Java");
        Assertions.assertEquals("Hallo Java", result);
    }

    @Test
    void testConcatenateSecondParamNull(){
        String result = stringProcessor.concatenate(HALLO_STRING, null);
        Assertions.assertEquals("Hallo null", result);
    }

    @Test
    void testConcatenateFirstParamNull(){
        String result = stringProcessor.concatenate(null, HALLO_STRING);
        Assertions.assertEquals("nullHallo ", result);
    }

    @Test
    void testGetLengthHappyPath(){
        Assertions.assertEquals(6,stringProcessor.getLength(HALLO_STRING));
    }

    @Test
    void testGetLengthHappyParamNull(){
        Assertions.assertThrows(NullPointerException.class,
                () -> {stringProcessor.getLength(null);});
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
