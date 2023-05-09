package Day47.ConditionalStatements;
import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String wordOne = scanner.nextLine();
        System.out.println("Enter another word:");
        String wordTwo = scanner.nextLine();

        // add ignorecase because canvas hw ex 2 has different lower uppercases and we need to ignore it
        if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }

    }
}

//    Create a class called "SameOrNah" that accepts user input asking
//    for two words. Write a conditional statement that writes that the
//    "The words are the same" if the strings match or it writes
//    "The words are different" if the strings do not match.