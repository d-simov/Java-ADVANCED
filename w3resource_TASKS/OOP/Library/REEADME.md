Task: Library Catalog

Imagine you are tasked with creating a library catalog system. You need to model books, authors, and a catalog of books. Use Java classes and collections to implement 
this system.

Requirements:

Create two classes: Author and Book.

The Author class should have properties like name, birthYear, and nationality. Include getters and setters for these properties.
The Book class should have properties like title, author (an instance of the Author class), publicationYear, and ISBN. Include getters and setters for these properties.
Implement a class called LibraryCatalog to manage a collection of books. This class should use a suitable collection (e.g., ArrayList or HashMap) to store the books.

The LibraryCatalog class should have the following methods:

 * addBook(Book book): Add a book to the catalog.
 * removeBook(String isbn): Remove a book from the catalog by ISBN.
 * findBooksByAuthor(String authorName): Find and return a list of books by a specific author.
 * `listBooks(): List all books in the catalog.
 * getBookByISBN(String isbn): Retrieve a book by ISBN.
   
Implement a Main class with a main method to test the library catalog. Create several instances of Author and Book and add them to the library catalog. 
Perform various operations like adding, removing, and listing books.
