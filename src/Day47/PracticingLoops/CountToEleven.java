package Day47.PracticingLoops;
import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int inputNumber = Integer.valueOf(scanner.nextLine());

        if (inputNumber >= 11) {
            System.out.println("Number must be less than 11");
        } else {
            for (int i = inputNumber; i <= 11; i++){
                System.out.println(i);
            }
        }
    }
}
