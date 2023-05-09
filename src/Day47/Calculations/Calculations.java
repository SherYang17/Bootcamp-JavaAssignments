package Day47.Calculations;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int aNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int anotherNumber = Integer.valueOf(scanner.nextLine());

        // 1. Addition
        int addition = aNumber + anotherNumber;
        System.out.println(aNumber + " + " + anotherNumber + " = " + addition);

        // 2. Subtraction
        int subtraction = aNumber - anotherNumber;
        System.out.println(aNumber + " - " + anotherNumber + " = " + subtraction);

        // 3. Multiplication
        int multiplication = aNumber * anotherNumber;
        System.out.println(aNumber + " * " + anotherNumber + " = " + multiplication);

        // 4. Division - remember to use floating-point numbers when doing division!
        double division = (double) aNumber / anotherNumber;
        System.out.println(aNumber + " / " + anotherNumber + " = " + division);

        // 6. Modulus
        int modulus = aNumber % anotherNumber;
        System.out.println(aNumber + " % " + anotherNumber + " = " + modulus);

    }
}



// Float example for division - Step#4  https://www.baeldung.com/java-integer-division-float-result
// Example is float x = (float) 10/4

// Your output should look similar to this once you run your code:
//        Enter a number:
//        5
//        Enter another number:
//        2
//        5 + 2 = 7
//        5 - 2 = 3
//        5 * 2 = 10
//        5 / 2 = 2.5
//        5 % 2 = 1