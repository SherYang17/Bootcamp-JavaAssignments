package Day47.ConditionalStatements;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int aNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int anotherNumber = Integer.valueOf(scanner.nextLine());

        if (aNumber == anotherNumber) {
            System.out.println("The same");
        } else if (aNumber > anotherNumber) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }

    }
}

// Create a class called "NumberComparison" that accepts user
// input asking for any two numbers. Use all three conditional statements
// (if, else if, and else) to output one of the three statements
// depending on what the two numbers are.

// Same: Numbers are the same
// Number one is larger than number two: The first number was larger than the second
// Number two is larger than number one: The second number was larger than the first