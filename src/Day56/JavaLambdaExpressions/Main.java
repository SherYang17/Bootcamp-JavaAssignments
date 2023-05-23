package Day56.JavaLambdaExpressions;

import java.util.function.*; // For Lambda Expressions
public class Main {
    public static void main(String[] args) {

// Task 1: Simple Lambda Expressions with addition, sub, mult, and div
        // BinaryOperator takes 2 arguments of same type, we use Integer

        BinaryOperator<Integer> addition = (a, b) -> a + b; // addition is our variable. (a,b) -> a+b specifies the apply() method and returns the sum of addition
        System.out.println("Addition " + addition.apply(5, 3)); // In variable Addition below, we want to run method apply(t,u). In place of t,u is (5,3). Result is 5 + 3 -> return 8. So addition variable = 8.

        BinaryOperator<Integer> subtraction = (a, b) -> a - b;                // subtraction is our variable. (a,b) -> a-b specifies the apply() method and returns the sum of addition
        System.out.println("Subtraction: " + subtraction.apply(12, 7)); // In variable subtraction, we want to run method apply(t,u). In place of t,u is (12,7). Result is 12 - 7 -> return 5. So subtraction variable = 5.

        BinaryOperator<Integer> multiplication = (a, b) -> a * b;                   // multiplication is our variable. (a,b) -> a*b specifies the apply() method and returns the sum of multiplication
        System.out.println("Multiplication: " + multiplication.apply(3, 2));  // In variable multiplication, we want to run method apply(t,u). In place of t,u is (3,2). Result is 3 * 2 -> return 6. So multiplication variable = 6.

        BinaryOperator<Integer> division = (a, b) -> a / b;             // division is our variable. (a,b) -> a*b specifies the apply() method and returns the sum of multiplication
        System.out.println("Division: " + division.apply(8, 2));  // In variable division, we want to run method apply(t,u). In place of t,u is (8,2). Result is 8 / 2 -> return 4. So multiplication variable = 4.
        System.out.println(" ");


// Task 2: Lambda Expressions with Functional Interfaces
        // Create your own functional interfaces and use lambda expressions to create instances of them. (PART OF PART 2 IS AT THE VERY BOTTOM OF CODE, CREATED IT OUTSIDE THIS)
        // A functional interface is an interface that contains only one abstract method
        MyFunctionalInterface hello = (name) -> "Hello, " + name;
        System.out.println(hello.sayHello("Ricky"));


        Greeting helloTwo = (name) -> System.out.println("Hello, " + name);
        helloTwo.sayHello("Ricky");System.out.println(" ");


// Task 3: Lambda Expressions with Built-in Functional Interfaces
        // Predicate<T>: An interface that takes an argument of type T and returns a boolean.
        // Predicate predicate = (value) -> value != null;
        Predicate<String> isLong = (str) -> str.length() > 10;
        System.out.println("Predicate: Is my string length greater than 10?: " + isLong.test("This is obviously shorter than 100!!!!"));

        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println("Predicate: Is 50 < 18?: " + lesserthan.test(50));System.out.println(" ");


            // My predicate literally looked like class with this below
                    //  public boolean test(Integer i) {
                    //      return i < 18;
                    //  }

        // Function<T, R>: An interface that takes an argument of type T and returns a result of type R.
        // A Function is commonly used when you want to transform one value into another

        Function<String, Integer> stringLength = (str) -> str.length();
        System.out.println("Function: Take my string and give me the length: " + stringLength.apply("Hello, world!dfagdsfgdfgdsfgdsfgsdfgsdfg"));

        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String greeting = "Function: Take my string and uppercase it ";
        System.out.println(toUpperCase.apply(greeting));  // Output: HELLO, WORLD!
        System.out.println(" ");

        // Consumer<T>: An interface that takes an argument of type T and returns no result (void).
        // The interface includes an abstract method, accept(T t), which performs an operation on the input argument.
        // Method: void accept(T t)
        // Consumer<Integer> consumer = (value) -> System.out.println(value);
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("Consumer: Void method that outputs what I put in here but let's uppercase");
        System.out.println(" ");

        // Supplier<T>: An interface that takes no arguments and returns a result of type T.
        // The interface includes an abstract method, get(), which returns a result and doesn't accept any arguments.
        Supplier<String> helloSupplier = () -> "Supplier: No arguments are passed, only giving me a result.";
        System.out.println(helloSupplier.get());
    }


    // Task 2
    // A functional interface is an interface that contains only one abstract method
    @FunctionalInterface
    public interface MyFunctionalInterface {
        String sayHello(String name);
    }

    @FunctionalInterface
    public interface Greeting {
        void sayHello(String name);
    }
}


// More FYI
// Java 8 has introduced several built-in functional interfaces in the java.util.function package. Some of the most frequently used ones include:
    // Predicate<T>: An interface that takes an argument of type T and returns a boolean.
    // Function<T, R>: An interface that takes an argument of type T and returns a result of type R.
    // Consumer<T>: An interface that takes an argument of type T and returns no result (void).
    // Supplier<T>: An interface that takes no arguments and returns a result of type T.

// Reference link
// https://www.geeksforgeeks.org/functional-interfaces-java/
// https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/
// https://www.geeksforgeeks.org/java-8-biconsumer-interface-in-java-with-examples/
// https://www.geeksforgeeks.org/java-8-predicate-with-examples/
// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
// https://www.geeksforgeeks.org/supplier-interface-in-java-with-examples/



// Another example is Predicate true/false. My method was literally 1 step
    // Predicate<String> isLong = (str) -> str.length() > 10;

// Equivalant java expression would look similar to
    //  public boolean test(String str) {
    //      return str.length() > 10;
    //  }


// Another example is my Lambda answer
// Predicate<Integer> lesserthan = i -> (i < 18);

// Equivalent java expression would be
// 1. Create a class
// 2. Enter method
//          public boolean test(Integer i) {
//              return i < 18;
//          }
// 3. Create a new class and do PSVM then paste below
//        Predicate<Integer> lesserThan = new MyPredicate();
// 4. Then type code to call it and make sure it works
//        boolean result1 = lesserThan.test(10);
//        System.out.println("Is 10 lesser than 18? " + result1);
// 5. Then run the code and output should be True.