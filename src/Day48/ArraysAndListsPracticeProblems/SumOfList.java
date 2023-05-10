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

