package Day57.DebuggingPractice;

public class Main {

    // 1. Write a Java method that calculates the average of an array of integers.
    // 1. This method should take an array of integers as input and return a double as output.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // 2. Test your method with an array containing the numbers 1, 2, 3, 4, 5. Your method should return 3.0.
        double average = sumOfArrays(array);
        System.out.println("Average = " + average);
    }

    public static double sumOfArrays(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum = sum + number;
        }
        return (double) sum / numbers.length;
    }




}

//    Introduce a null pointer exception and an array index out of bounds exception into your program.
//    Note down the line numbers where these exceptions occur.