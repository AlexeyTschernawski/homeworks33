package homework35.test;

import static org.junit.jupiter.api.Assertions.*;

import de.ait.homework35.Book;
import de.ait.homework35.BookManager;
import org.junit.jupiter.api.Test;

public class BookManagerTest {

    @Test
    void testBookConstructor() {
        // Testing construktor book
        Book book = new Book("777888", "Java-Entwickler", "Alexey");
        assertEquals("777888", book.getIsbn());
        assertEquals("Java-Entwickler", book.getTitle());
        assertEquals("Alexey", book.getAuthor());
    }

    @Test
    void testBookGettsSetts() {
        // Тестирование геттеров и сеттеров Book
        Book book = new Book("777888", "Java-Entwickler", "Alexey");
        book.setIsbn("777888");
        book.setTitle("Phyton-Entwickler");
        book.setAuthor("Andrey");

        assertEquals("777888", book.getIsbn());
        assertEquals("Phyton-Entwickler", book.getTitle());
        assertEquals("Andrey", book.getAuthor());
    }

    @Test
    void testAddBook() {
        // Тестирование добавления книги в BookManager
        BookManager manager = new BookManager();
        Book book = new Book("777888", "Java-Entwickler", "Alexey");

        assertFalse(manager.addBook(book));
    }

    @Test
    void testAddBookWithExistingIsbn() {
        // Тестирование добавления книги с существующим ISBN в BookManager
        BookManager manager = new BookManager();
        Book book1 = new Book("777888", "Title1", "Author1");
        Book book2 = new Book("777888", "Title2", "Author2");

        manager.addBook(book1);

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addBook(book2);
        });
    }

    @Test
    void testFindBookByIsbn() {
        // Suche nach Buch:  ISBN in BookManager
        BookManager manager = new BookManager();
        Book book = new Book("777888", "Java", "Alexey");

        manager.addBook(book);

        assertEquals(book, manager.findBookByIsbn("777888"));
        assertNull(manager.findBookByIsbn("0888777"));
    }

    @Test
    void testRemoveBookByIsbn() {
        // Testing löschen Buch in ISBN in BookManager
        BookManager manager = new BookManager();
        Book book = new Book("777888", "Java", "Alexey");

        manager.addBook(book);

        assertFalse(manager.removeBookByIsbn("777888"));
        assertFalse(manager.removeBookByIsbn("888777"));
    }
}
