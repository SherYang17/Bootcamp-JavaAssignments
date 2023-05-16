package Day52.HashMapPracticeProblems;
// Print me my hash map - programming exercise
import java.util.HashMap;


public class ProgramPartTwo {

    public static void main(String[] args) {
        // copied Book class from the website into a class in intellij
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }

    public static void printValues(HashMap<String,Book> hashmap) {
        //which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }

    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        // which prints only the Books in the given hashmap which name contains the given string. You can find out the
        // name of a Book with the method getName.
        for (Book book : hashmap.values()) {
            if(book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }




}
