package Day50.OverloadingPractice;

import java.util.ArrayList;
import java.util.Scanner;
public class BookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> ourBooks = new ArrayList<>();
        ourBooks.add(new Book("The Great Gatsby", 180, 1925));
        ourBooks.add(new Book("Moby Dick", 720, 1851));
        ourBooks.add(new Book("War and Peace", 1225, 1869));

        while (true) {
            System.out.println("Enter a book:");
            String bookTitle = input.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("How many pages are in the book?");
            int pages = Integer.valueOf(input.nextLine());

            System.out.println("What year is the book from?");
            int year = Integer.valueOf(input.nextLine());

            ourBooks.add(new Book(bookTitle, pages, year));
        }

        System.out.println("What information will be printed?");
        String everything = input.nextLine();

        if (everything.equalsIgnoreCase("everything")) {
            for (Book book : ourBooks) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (everything.equalsIgnoreCase("name")) {
            for (Book book : ourBooks) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

// its not accepting my methods of scanner and wont run without the alternative code Example -> String bookTitle = scanner.nextLine();