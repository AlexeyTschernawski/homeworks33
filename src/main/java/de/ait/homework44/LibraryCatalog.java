package de.ait.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryCatalog {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);


    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book bookToAdd) {
        if (bookToAdd == null) {
            LOGGER.error("Попытка добавить null");
            return false;
        } else {
            LOGGER.info("Книга {} автора {} ISBN {} успешно добавлена ",
                    bookToAdd.getName(), bookToAdd.getAuthor(), bookToAdd.getIsbn());
            return books.add(bookToAdd);
        }
    }

    public boolean removeBook(String isbn) {
        //Счетчик удаленных книг
        int counter = 0;
        if (isbn == null) {
            LOGGER.error("Попытка удалить по ISBN null");
            return false;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book element = iterator.next();
            if (element.getIsbn().equals(isbn)) {
                LOGGER.info("Книга с ISBN  {}  была удалена", isbn);
                counter++;
                iterator.remove();
            }
        }
        if (counter == 0) {
            LOGGER.warn("Книги для удаления с ISBN {} не было найдено", isbn);
            return false;
        } else {
            LOGGER.info("Было удалено {} книг с ISBN {}", counter, isbn);
            return true;
        }
    }

    public List<Book> findBookByTitle(String titleBook) {

        List<Book> booksToReturn = new ArrayList<>();

        if (titleBook == null) {
            LOGGER.error("Попытка поиска книги с названием NULL");
            return null;
        } else {
            for (Book book : books) {
                if (book.getName().equals(titleBook)) {
                    LOGGER.info("Книга с названием {} была найдена ", titleBook);
                    booksToReturn.add(book);
                }
            }
            LOGGER.info("Было найдено {} книг с названием {} ", booksToReturn.size(), titleBook);
            return booksToReturn;
        }
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            LOGGER.info("В библиотеке нет книг");
        } else {
            for (Book book : books) {
                LOGGER.info(book.toString());
            }
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
