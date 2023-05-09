package Day47.PracticingLoops;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());

            if (inputNumber == 0) {
                break;
            }
            if (inputNumber < 0) {
                System.out.println("Number must be a positive number");
            } else {
                System.out.println("Number is " + inputNumber);
            }
        }
    }
}


// While true is to be infinite until you break the code

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter positive numbers (enter 0 to end program execution): ");
//        int sum = 0;
//        int numbers = 0;
//        int negativeNumbers = 0;
//
//        while (true) {
//        int input = Integer.valueOf(scanner.nextLine());
//
//        if (input == 0) {
//        break;
//        }
//
//        if (input < 0) {
//        negativeNumbers++;
//        System.out.print("Please enter positive numbers only: ");
//        continue;
//        }
//
//        sum += input;
//        numbers++;
//        }