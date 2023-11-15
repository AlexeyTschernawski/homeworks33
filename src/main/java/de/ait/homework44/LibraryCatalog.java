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
        //Counter of deleted books
        int counter = 0;
        if (isbn == null) {
            LOGGER.error("Attempt to delete by ISBN null");
            return false;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book element = iterator.next();
            if (element.getIsbn().equals(isbn)) {
                LOGGER.info("Book with ISBN {} has been deleted", isbn);
                counter++;
                iterator.remove();
            }
        }
        if (counter == 0) {
            LOGGER.warn("No book was found to remove from ISBN {}", isbn);
            return false;
        } else {
            LOGGER.info("have been removed {} books with ISBN {}", counter, isbn);
            return true;
        }
    }

    public List<Book> findBookByTitle(String titleBook) {

        List<Book> booksToReturn = new ArrayList<>();

        if (titleBook == null) {
            LOGGER.error("Attempting to search for a book with the title NULL");
            return null;
        } else {
            for (Book book : books) {
                if (book.getName().equals(titleBook)) {
                    LOGGER.info("A book with title {} was found ", titleBook);
                    booksToReturn.add(book);
                }
            }
            LOGGER.info("was found {} books with the title {} ", booksToReturn.size(), titleBook);
            return booksToReturn;
        }
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            LOGGER.info("There are no books in the library");
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
