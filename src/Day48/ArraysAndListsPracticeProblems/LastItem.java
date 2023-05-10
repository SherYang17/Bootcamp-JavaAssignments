package Day48.ArraysAndListsPracticeProblems;
import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
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
        String theLastItem = listOfStrings.get(listOfStrings.size() - 1);
        System.out.println("The last item in the list is: " + theLastItem);


    }
}


// https://stackoverflow.com/questions/39860739/how-to-get-first-and-last-element-in-an-array-in-java
// If you have a double array named numbers, you can use:
//
//  firstNum = numbers[0];
//  lastNum = numbers[numbers.length-1];
//
//  or with ArrayList
//
//  firstNum = numbers.get(0);
//  lastNum = numbers.get(numbers.size() - 1);



//        Good for finding everything in an array
//        for (int i = 0; i < listOfStrings.size(); i++) {
//        System.out.println("Test: " + listOfStrings.get(i));
//        }