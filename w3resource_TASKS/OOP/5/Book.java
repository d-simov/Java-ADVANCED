package Online_OOP_Tasks_W3._5;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private static ArrayList <Book> books = new ArrayList<Book>();

    public Book(String title, String author, String isbn) {
        if (title.trim().length() > 1) {
            this.title = title;
        } else {
            this.title = "Unknown title";
        }
        if (author.trim().length() > 1) {
            this.author = author;
        } else {
            this.author = "Unknown autor";
        }
        if (isbn.trim().length() == 10 || isbn.trim().length() == 13) {
            if (isValidIsbn(isbn)) {
                this.isbn = isbn;
            } else {
                this.isbn = "0000000000000";
            }
        } else {
            this.isbn = "0000000000000";
        }
    }

    private boolean isValidIsbn(String isbn) {
        for (int i = 0; i < isbn.length(); i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    void addBook () {

        Book.books.add(this);
        System.out.println("Book \"" + this.title + "\" is added to the list.");
    }

    void removeBook () {
        Book.books.remove(this);
        System.out.println("Book \"" + this.title + "\" is removed from the book list.");
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", isbn = '" + isbn + '\'' +
                '}';
    }

    static void showAllBooks() {
        System.out.println();
        System.out.println("Our list of books:");
        for (Book book:books) {
            System.out.println(book);
        }
    }
}
