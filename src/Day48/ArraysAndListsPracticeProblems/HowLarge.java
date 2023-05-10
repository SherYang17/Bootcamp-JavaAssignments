package Day48.ArraysAndListsPracticeProblems;
import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

//        String input = scanner.nextLine();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        System.out.println(listOfStrings.size());
    }
}
