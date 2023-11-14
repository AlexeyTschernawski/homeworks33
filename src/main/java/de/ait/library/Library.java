package de.ait.library;

import java.util.ArrayList;

public class Library {

    // все книги
    private ArrayList<Book> books = new ArrayList<>();

    // все читатели
    private ArrayList<Reader> readers = new ArrayList<>();

    // Добавление книги
    public void addBook(Book book) {
        books.add(book);
    }

    // Удаление книги по ID
    public void removeBook(String id) {
        Book bookToRemove = findBookById(id);
        if(bookToRemove!= null){
            books.remove(bookToRemove);
        }
        else {
            System.err.println("Книга для удаления с ID: " + id  + " не найдена");
        }
    }

    // Поиск книг по автору
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Выдача книги
    public void issueBook(String id, Reader reader) {
        for (Book book : books) {
            if (book.getId().equals(id) && !book.isBorrowed()) {
                reader.addBorrowedBook(book);
                break;
            }
        }
    }

    // Возврат книги
    public void returnBook(String id, Reader reader) {
        for (Book book : reader.getBorrowedBooks()) {
            if (book.getId().equals(id)) {
                reader.removeBorrowedBook(book);
                book.setBorrowed(false);
                break;
            }
        }
    }

    private Book findBookById(String bookId){
        for(Book book: books){
            if(book.getId().equals(bookId)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }
}
