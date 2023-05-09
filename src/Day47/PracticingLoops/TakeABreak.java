package Day47.PracticingLoops;
import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equals("yes")) {
                break;
            }
        }
    }
}



//Example code
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//        System.out.println("Do you want to leave? (if yes, enter 'y')");
//        String userInput = scanner.nextLine();
//        if (userInput.equals("y")) {
//        break;
//        }
//
//        System.out.println("Thanks for staying!");
//        }
//
//        System.out.println("See ya later!");
