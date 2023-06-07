package Online_OOP_Tasks_W3._5;

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book("Solaris", "Stanislav Lem", "1234567890");
        Book b2 = new Book("I, robot", "Isaak Asimov", "1234567890123");
        Book b3 = new Book("Lord of the Rings", "Tolkien", "456");
        Book b4 = new Book("Lord of the flies", " ", "1234f67890");
        Book b5 = new Book(" ", "Stanislav Lem", " ");

        b1.addBook();
        b2.addBook();
        b3.addBook();
        b4.addBook();

        Book.showAllBooks();
        System.out.println();
        System.out.println("A book outside the list:");
        System.out.println(b5);
        System.out.println();

        b2.removeBook();
        Book.showAllBooks();

    }
}
