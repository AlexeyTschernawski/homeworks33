package homework35.test;

import de.ait.homework35.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookTest {

    private Book book;

    private String isbn = "9783528065461";

    @BeforeEach
    public void setUp(){
        book = new Book(isbn, "Muster des Lebendigen", "Andreas Deutsch");
    }

    @Test
    void testCreateBookOK(){
        Book testBook = new Book(isbn, "Muster des Lebendigen", "Andreas Deutsch");
        assertNotNull(testBook);
    }

    @Test
    void testGetIsbnOK(){
        Assertions.assertEquals(isbn, book.getIsbn());
    }

    @Test
    void testSetIsbnOK(){
        book.setIsbn("9783528065462");
        Assertions.assertEquals("9783528065462", book.getIsbn());
        Assertions.assertNotEquals(isbn, book.getIsbn());
    }



}