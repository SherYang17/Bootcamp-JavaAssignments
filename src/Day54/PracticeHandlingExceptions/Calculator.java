package Day54.PracticeHandlingExceptions;

public class Calculator {

    public int factorial (int number) {
        if (number < 0 ) {
            throw new IllegalArgumentException("Number cannot be less than 0");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }



    public int binomialCoefficient(int subsetSize, int setSize) {


        if (subsetSize < 0 || setSize < 0) {
            throw new IllegalArgumentException("The numbers cannot be negative");
        }
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset Size exceeds the set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator/denominator;
    }

    public static void main(String[] args) {
        Calculator thisisjustaname = new Calculator();
        int number1 = 5;
        int givememyanswer = thisisjustaname.factorial(number1);
        System.out.println("Factorial of " + number1 + " is: " + givememyanswer);

//        int number2 = 8;
//        int result2 = thisisjustaname.factorial(number2);
//        System.out.println("Factorial of " + number2 + " is: " + result2);


//
//
//        int subsetSize = 3;
//        int setSize = 9;
//        int binomialCoefficient = calculator.binomialCoefficient(subsetSize, setSize);
//        System.out.println("Binomial Coefficient: " + binomialCoefficient);
    }

}


// Factorial is to multiply whole numbers
// example, factorial of 5 is 5 * 4 * 3 * 2 * 1 which equals 120.

// Numerator is your factorial subsetsize
// Denominator is your factorial(setSize) * factorial(setSize - subsetSize)
// Denominator is taking the product or multiplication of two factorials

//Let's practise a little parameter validation with the IllegalArgumentException exception.
//        There are two classes included with the exercise base: Person and Calculator.
//        Modify the classes in the following manner:
//
//        Validating a person
//        The constructor of the class Person should ensure that the name given as the
//        parameter is not null, empty, or over 40 characters in length. The age should
//        between 0 and 120. If some of these conditions are not met, the constructor should
//        throw an IllegalArgumentException.
//
//        Validating the calculator
//        The methods of the Calculator class should be as follows: The method factorial
//        should only work if the parameter is a non-negative number (0 or greater).
//        The method binomialCoefficient should only work when the parameters are non-negative
//        and the subset size does not exceed the set size. If these methods receive invalid
//        parameters when they are called, they should throw an IllegalArgumentException


