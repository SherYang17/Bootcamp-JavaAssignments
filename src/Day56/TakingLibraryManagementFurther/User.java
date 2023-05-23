package Day56.TakingLibraryManagementFurther;
import java.util.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String libraryCardNumber;
    private List<Book> borrowedBooks;

    public User(String name, String libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.borrowedBooks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setLoanStatus(true);
        book.setAvailable(false);
        System.out.println("Book '" + book.getTitle() + "' has been borrowed by " + name + ".");
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setLoanStatus(false);
            book.setAvailable(true);
            System.out.println("Book '" + book.getTitle() + "' has been returned by " + name + ".");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not borrowed by " + name + ".");
        }
    }


}
