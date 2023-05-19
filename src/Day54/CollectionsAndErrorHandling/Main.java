package Day54.CollectionsAndErrorHandling;
import java.util.ArrayList; // ArrayList allows duplicate values, maintains insertion order,
import java.util.HashSet; // HashSet doesn't allow any duplicate values to be stored
import java.util.List;  // An ordered collection that allows duplicates
import java.util.Set;   // An unordered collection that does not allow duplicates

public class Main {
    public static void main(String[] args) {
        List<Integer> ourIntegers = new ArrayList<>(); // can have duplicate values
        Set<Integer> noDuplicates = new HashSet<>();

        ourIntegers.add(1);
        ourIntegers.add(2);
        ourIntegers.add(3);
        ourIntegers.add(4);
        ourIntegers.add(5);
        ourIntegers.add(6);
        ourIntegers.add(7); // our duplicates
        ourIntegers.add(7); // our duplicates
        ourIntegers.add(7); // our duplicates
        ourIntegers.add(8);
        ourIntegers.add(9);
        ourIntegers.add(10);

        int sum = 0;
        double average = 0.0;
        try {
            //Adds all of the elements in the specified collection to this set if they're not already present
            noDuplicates.addAll(ourIntegers);

            if (noDuplicates.isEmpty()) {
                throw new IllegalArgumentException("Our Set list is empty.... there is no values");
//                System.out.println("Our Set list is empty.... there is no values");
            }
            //calculating sum and average
            for (int value : noDuplicates) {
                sum = sum + value;
            }
            //calculating average
            average = (double) sum / ourIntegers.size();
//            int value = ourIntegers.get(20);

        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            throw new IndexOutOfBoundsException("This is an argument for Index but incorporating IllegalArgument exception so uncomment line 41 to make it work" + e.getMessage());
//            System.out.println("Exception error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception error: " + e.getMessage());

        } finally {
            System.out.println("Sum of the set: " + sum);
            System.out.println("Average of the set: " + average);
            System.out.println("No duplicate integers of the set: " + noDuplicates);
            System.out.println("ArithmeticException and IndexOutOfBoundsException isn't used.");
        }
    }
}



//    Create a Java program that works with a predefined list of integers, performs some operations on a collection, and handles exceptions that might occur during the process.

//    1. Define a List of integers with at least one set of duplicates.
//          List<Integer> numbers = new ArrayList<>()

//    2. Use a Set to remove duplicates.
//          Set<Integer> numbers = new HashSet<>();

//    3. Calculate the sum and average of the integers.

//    4. Print the sum, average, and the list of integers without duplicates.

//    5. Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
//          IndexOutOfBoundsException - Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
//          IllegalArgumentException - tells the user that the values given to a method or a constructor as parameters are wrong. It can be used when we want to ensure certain parameter values.
//          ArithmeticException - Thrown when an exceptional arithmetic condition has occurred. For example, an integer "divide by zero" throws an instance of this class.

//    6. Use try-catch-finally and multi-catch blocks as needed.
//         Example
//            try {
//              // code that might throw an exception
//            } catch (ExceptionType1 e1) {
//              // code to handle ExceptionType1
//            } catch (ExceptionType2 e2) {
//              // code to handle ExceptionType2
//            } finally {
//              // code to be executed regardless of an exception being thrown or not
//            }

//          Example
//            try {
//              int result = 10 / 0;
//            } catch (ArithmeticException e) {
//               System.out.println("An error occurred: " + e.getMessage());
//            } finally {
//                System.out.println("This will always be executed.");
//            }

//          Multicatch block
//            try {
//              // code
//            }
//            catch (ExceptionType1 | Exceptiontype2 ex){
//              // catch block
//            }

//          Multicatch block
//            try {
//                // Code that might throw exceptions
//            } catch (FileNotFoundException | ClassNotFoundException e) {
//                System.out.println("File or class not found: " + e.getMessage());
//            }


// Multicatch Block https://www.geeksforgeeks.org/multicatch-in-java/
// https://docs.oracle.com/javase/8/docs/api/java/lang/IndexOutOfBoundsException.html
// https://docs.oracle.com/javase/8/docs/api/java/lang/ArithmeticException.html
