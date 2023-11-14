package de.ait.library;

import java.util.ArrayList;

public class Reader {
    private String name;

    // список взятых книг
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Reader(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book book) { borrowedBooks.add(book); }
    public void removeBorrowedBook(Book book) { borrowedBooks.remove(book); }

    public String getName() {
        return name;
    }
}
