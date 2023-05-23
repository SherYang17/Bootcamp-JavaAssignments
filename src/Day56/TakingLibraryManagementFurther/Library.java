package Day56.TakingLibraryManagementFurther;
import java.util.*;
import java.util.function.*; // predicate, function, consumer, supplier
import java.util.stream.Collectors; // collections (collect(collector)
import java.util.List; // lists
import java.util.ArrayList;
import java.util.Comparator;


public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // The interface includes an abstract method, get(), which returns a result and doesn't accept any arguments.
    public Supplier<Book> createBook = Book::new;

    // Boolean isBook available
    // Predicate<T>: An interface that takes an argument of type T and returns a boolean.
    public Predicate<Book> isBookAvailable = Book::getAvailable;

    // Print Book Details
    // Consumer<T>: An interface that takes an argument of type T and returns no result (void).
    public Consumer<Book> printBookDetails = book -> {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Year: " + book.getPublicationYear());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Category: " + book.getCategory());
        System.out.println();
    };

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library by title.
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    // Find all books published in a specific year.
    public List<Book> findBooksByPublicationYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    // Find all books by a specific author.
    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    // Find the book with the most pages
    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    // Find all books with more than n pages
    public List<Book> findBooksByMinPages(int minPages) {
        return books.stream()
                .filter(book -> book.getPages() > minPages)
                .collect(Collectors.toList());
    }

    // Print all book titles in the library, sorted alphabetically.
    public List<String> getAllBookTitlesSorted() {
        return books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    // Update the Book class to include a category attribute (String).
    public List<Book> findBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Implementing loan system using isOnLoan attribute in Book class
    // This could involve adding a isOnLoan attribute to the Book class, and methods to the Library class to loan out a book
    public void loanOutBook(Book book) {
        if (!book.isOnLoan()) {
            book.setLoanStatus(true);
            System.out.println("Book '" + book.getTitle() + "' has been loaned out.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is already on loan.");
        }
    }

    // and return a book. The library should not be able to loan out a book that is already on loan.
    public void returnBook(Book book) {
        if (book.isOnLoan()) {
            book.setLoanStatus(false);
            System.out.println("Book '" + book.getTitle() + "' has been returned.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not currently on loan.");
        }
    }


    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("1 First Book", "Missy Sher", 2023, 200, "Fiction");
        Book book2 = new Book("2 Second Book", "Missy Yang", 2022, 300, "NonFiction");
        Book book3 = new Book("3 Third Book", "Missy Sherlay", 2021, 750, "History");

        // Add books to the library set
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Printing all book titles in the library and sort alphabetically
        List<String> sortedTitles = library.getAllBookTitlesSorted();
        System.out.println("All Books:");
        for (String title : sortedTitles) {
            System.out.println(title);
        }
        System.out.println();

        // Find books by author
        List<Book> booksByAuthor = library.findBooksByAuthor("Missy Sher");
        System.out.println("Books by Missy Sher:");
        for (Book book : booksByAuthor) {
            library.printBookDetails.accept(book);
        }

        // Loan out a book
        library.loanOutBook(book1);

        // Create a user
        User user = new User("Hectoria", "111");

        // User borrows a book
        user.borrowBook(book1);

        // User tries to borrow a book that is already on loan
        user.borrowBook(book1);

        // User returns a book
        user.returnBook(book1);

        // Remove a book from the library
        library.removeBook("2 Second Book");

        // Find the book with the most pages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("The Book with Most Pages:");
        library.printBookDetails.accept(bookWithMostPages);
    }


}
