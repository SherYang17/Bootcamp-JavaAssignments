package Day47.PracticingLoops;
import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int integerInput = Integer.valueOf(scanner.nextLine());
            if (integerInput == 5) {
                break;
            }
        }
    }
}


// Example
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//        System.out.println("Enter a number (enter 0 if you'd like to quit)");
//        int number = Integer.valueOf(scanner.nextLine());
//        if (number == 0) {
//        break;
//        }
//
//        System.out.println("You entered " + number);
//        }
//
//        System.out.println("See ya later!");