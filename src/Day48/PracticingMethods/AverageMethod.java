package Day48.PracticingMethods;

public class AverageMethod {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;

        int sum = sum(num1,num2,num3);
        double average = average(num1, num2, num3);
        System.out.println("The average is: " + average);
    }

    //Return sum of 3 numbers with 3 numers in parameter
    public static Integer sum (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // accepts 3 numbers as parameters and returns the average of the 3 numbers
    public static Double average (int num1, int num2, int num3) {
        double total = num1 + num2 + num3;
        return total/3;
    }
}
