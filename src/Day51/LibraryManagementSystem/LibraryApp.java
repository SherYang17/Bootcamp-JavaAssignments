package Day51.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> ourLibraryApp = new LibraryManager<>();


        Book book1 = new Book("The Invisible Board Members: SET's Ghostly Investors", 2023, "Invisible Yang", "ISBN 111");
        Book book2 = new Book("Alien Interns: SETs Extraterrestrial Workforce", 2023, "Alien Sher", "ISBN 667");
        DVD dvd1 = new DVD("SET's High School Musical", 2023, "Musical Yang", 90000);
        DVD dvd2 = new DVD("Ghost Whisperer: SET's Involvement in the 8th dimension", 2023, "Ghost Sher", 9000);

        ourLibraryApp.addItem(book1);
        ourLibraryApp.addItem(book2);
        System.out.println("Here is book 1 and 2: ");
        ourLibraryApp.displayItems();
        System.out.println(" ");
        System.out.println("Now I am going to remove the Alien book and add DVDs:");
        ourLibraryApp.removeItem(book2);
        ourLibraryApp.addItem(dvd1);
        ourLibraryApp.addItem(dvd2);
        ourLibraryApp.displayItems();
        System.out.println(" ");



    }
}
