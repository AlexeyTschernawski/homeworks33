package de.ait.library;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {

    public static void main(String[] args) {

        Library library = new Library();

        // Добавление книг и аудиокниг
        library.addBook(new Book("1", "Осень", "Али Смит", "роман"));
        library.addBook(new AudioBook("2", " Один год жизни", "Анна Дар", "сборник рассказов", 120));

        // Добавление читателей
        Reader reader = new Reader("Брэд Питт");

        // Выдача и возврат книг
        library.issueBook("1", reader);


        library.returnBook("1", reader);
        List<Book> allBooks = library.getBooks();
        List<Book> allBooksTest = new ArrayList<>();
        for (Book book : allBooks) {
            System.out.println("ID: " + book.getId() + ", Название: " + book.getTitle());
        }

        // Поиск книг по автору
        ArrayList<Book> booksByAuthor = library.findBooksByAuthor("Али Смит");
        for (Book book : booksByAuthor) {
            System.out.println("Найдена книга: " + book.getTitle() + " в жанре " + book.getGenre());
        }

        // Удаление книги
        //library.removeBook("1");
        // Вывести все книги после удаления
        System.out.println("Книги после удаления:");
        // Все книги
        allBooks = library.getBooks();
        for (Book book : allBooks) {
            //System.out.println("ID: " + book.getId() + ", Название: " + book.getTitle());
            System.out.println("----------------");
           // System.out.println(allBooks.toString());
            System.out.println(book.toString());
        }
    }
}
