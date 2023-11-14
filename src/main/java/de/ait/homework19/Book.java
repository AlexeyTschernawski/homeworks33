package de.ait.homework19;

public class Book {
        /*
          Create a Book class with fields: author, title,
          number of pages and read() method,
          which displays a message that the book is being read.
         */
        int pageNumbers;
        String bookTitle;
        String authorName;

    public Book(int pageNumbers, String bookTitle, String authorName) {
        this.pageNumbers = pageNumbers;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
    }

    public void read() {
        System.out.println("Somebody reads this book: " + "'" + bookTitle + "'" + " by " + authorName + " Pages: " + pageNumbers);
    }



}
