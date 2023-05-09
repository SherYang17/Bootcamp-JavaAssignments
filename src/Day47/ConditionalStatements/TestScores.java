package Day47.ConditionalStatements;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        System.out.println("Name a number between 0 and 100");
        Scanner scanner = new Scanner(System.in);
        int aNumber = Integer.valueOf(scanner.nextLine());

        if (aNumber >=90 && aNumber <= 100) {
            System.out.println("Your grade is a A");
        } else if (aNumber >= 80 && aNumber <= 89) {
            System.out.println("Your grade is a B");
        } else if (aNumber >= 70 && aNumber <= 79) {
            System.out.println("Your grade is a C");
        } else if (aNumber >= 60 && aNumber <= 69) {
            System.out.println("Your grade is a D");
        } else {
            System.out.println("Your grade is an F :(");
        }
    }
}


// Create a class called "TestScores" that accepts user input asking
// for a number between 0 and 100. Depending on what the number is,
// return a statement telling the user what score they got on a test
// using a 10 point grading scale. For example, if the user enters 73,
// then the program should return "Your grade is a C."

// Name a number between 0 and 100
// 53
// your grade is an F

// o0o0 what about if they write outside 100?