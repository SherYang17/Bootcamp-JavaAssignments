package Day57.DebuggingPractice;

public class Part456 {

    // 1. Write a Java method that calculates the average of an array of integers.
    // 1. This method should take an array of integers as input and return a double as output.

    public static void main(String[] args) {
        int[] array = {1,2,3,4}; // 4. Introduce a null pointer exception
        double average = calculateArrays(array);
        System.out.println("Average = " + average);

    }

    public static double calculateArrays(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {  // 4. and an array index out of bounds exception into your program.
            int number = numbers[i];
            sum = sum + number;
        }
        return (double) sum / numbers.length;
    }
}


// Part 4 and 5
//    Introduce a null pointer exception and an array index out of bounds exception into your program.
//    Note down the line numbers where these exceptions occur.
//    Lines or error occurs at 9 and 17
//    I ran the debugger (shift +f9) to find my errors by setting breakpoints at lines 9 and 17.
//      The purpose of running the debugger is to find the errors and read them in the debugger located
//      at the bottom of the intellij. While looking here, you have the option to change the variables too.
//      For example, introduce the null on line 9. When debugging, you can select the variable after setting the
//      breakpoint and then changing the value and continuing the debugger until done. I changed the value to new int[](1,2,3,4,5} and continued
//      the testing with no issues. So I went from null on my code to new int[] {1,2,3,4,5} inside the debugger.

//As for the index out of bounds, I had set the index to be less than or equal to <= sign and when i
//counts to 5, there is no 5th array location so it errors out and displays in the terminal.



// Part 6 and 7
//Finally, introduce a logic error into your program (an error where the program runs, but produces incorrect output).
// Note down the line number where this error occurs.
//  Line 19, if I just do numbers[i] to equal the sum, the logic errors because the value is incorrect.
//  After debugging, although no error popped up, the error is that the answer is not correct after double checking the results.