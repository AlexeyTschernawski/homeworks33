package de.ait.homework44;

import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {


        Book bookServantes = new Book("Дон Кихот", "Сервантес", "111-222-333");

        Book bookKing =  new Book("Лангольеры", "Кинг", "111-555-666");

        Book bookServantesSecond = new Book("Дон Кихот", "Сервантес", "111-222-333");

        LibraryCatalog libraryCatalog =  new LibraryCatalog();

        libraryCatalog.addBook(bookServantes);
        libraryCatalog.addBook(bookKing);
        libraryCatalog.addBook(bookServantesSecond);

        List<Book> books = libraryCatalog.findBookByTitle("Дон Кихот");
        for (Book book: books){
            System.out.println(book.toString());
        }

        books = libraryCatalog.findBookByTitle(null);
        if (books!= null){
            for (Book book: books){
                System.out.println(book.toString());
            }
        }
        else {
            System.out.println("books == null");
        }

        books = libraryCatalog.findBookByTitle("Нет такой книги");
        System.out.println("Найдено " + books.size() + " книг");
            for (Book book: books){
                System.out.println(book.toString());
            }

        books =  libraryCatalog.getBooks();
        System.out.println("В библиотеке " + books.size() + " книг");
        for (Book book: books){
            System.out.println(book.toString());
        }

        System.out.println("----remove book ------");

        libraryCatalog.removeBook("111-222-333");
        books =  libraryCatalog.getBooks();
        System.out.println("В библиотеке " + books.size() + " книг");
        for (Book book: books){
            System.out.println(book.toString());
        }

        libraryCatalog.listAllBooks();






    }
}
