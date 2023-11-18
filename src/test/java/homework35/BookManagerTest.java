package homework35;

import de.ait.homework35.Book;
import de.ait.homework35.BookManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;


class BookManagerTest {

    private Book book;

    private BookManager bookManager;

    private String isbn = "9783528065461";

    @BeforeEach
    public void setUp(){
        bookManager = new BookManager();
        book = new Book(isbn, "Muster des Lebendigen", "Andreas Deutsch");
    }

    @Test
    void testAddBookSuccess(){
        Assertions.assertEquals(0, bookManager.getBooks().size());
        bookManager.addBook(book);
        Assertions.assertEquals(1, bookManager.getBooks().size());
        Collection<Object> resultListBooks = bookManager.getBooks();
        Assertions.assertEquals(book, resultListBooks.getClass());
    }

    @Test
    void testAddBookError(){
        Assertions.assertEquals(0, bookManager.getBooks().size());
        bookManager.addBook(book);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            bookManager.addBook(book);
        });
    }

    @Test
    void testFindBookByISBNSuccess(){
        bookManager.addBook(book);
        Assertions.assertNotNull(bookManager.findBookByISBN(isbn));
    }

    @Test
    void testFindBookByISBNFail(){
        bookManager.addBook(book);
        Assertions.assertNull(bookManager.findBookByISBN("9783528065462"));
    }

    @Test
    void testRemoveBookSuccess(){
        bookManager.addBook(book);
        Assertions.assertTrue(bookManager.removeBook(isbn));
        Collection<Object> resultListBooks = bookManager.getBooks();
        Assertions.assertEquals(0, resultListBooks.size());
    }

    @Test
    void testRemoveBookFail(){
        bookManager.addBook(book);
        Assertions.assertFalse(bookManager.removeBook("9783528065462"));
        Collection<Object> resultListBooks = bookManager.getBooks();
        Assertions.assertEquals(1, resultListBooks.size());
    }


}