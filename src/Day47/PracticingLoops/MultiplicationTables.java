package Day47.PracticingLoops;
import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int inputNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <=10; i++) {
            System.out.println(inputNumber + " x " + i + " = " + (inputNumber * i));
        }
    }
}



// Those 4 parts in code:
//
//for (*variable assignment*; *condition*; *counter variable*) {
//    // Functionality to be executed
//}
//
//
//Let's look at this code filled with the four parts to refresh your memory.
//
//
//
//for (int i = 0; i < 5; i++) {
//        System.out.println(i);
//}
