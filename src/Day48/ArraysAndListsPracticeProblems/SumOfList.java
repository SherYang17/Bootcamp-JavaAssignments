package Day48.ArraysAndListsPracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                System.out.println("The sum of that list is:");
                break;
            }
            listOfNumbers.add(inputNumber);
        }

        int totalSum = sum(listOfNumbers);
//        System.out.println("The sum of the list is: ");
        System.out.println(totalSum);
    }

    public static int sum(ArrayList<Integer> listOfNumbers) {
        int totalSum = 0;
        for (int num : listOfNumbers) {
            totalSum += num;
        }
        return totalSum;
    }
}

// intelli j suggests for (int num : as opposed to the other method
// line 27 is the same as
//    for (int i = 0; i < listOfNumbers.size(); i++) {
//    totalSum += listOfNumbers.get(i);
//}


// or


//    for (int i = 0; i < listOfNumbers.size(); i++) {
//    totalSum = totalSum + listOfNumbers.get(i).intValue();
//    }
