package Day47.Casting;

public class Casting {
    public static void main(String[] args) {
        double doubleNumber = 112.35;
        int integerNumber = (int) doubleNumber;
        System.out.println("Double: " + doubleNumber);
        System.out.println("int: " + integerNumber);

        String stringNumber = "49";
        int integerNumberTwo = Integer.parseInt(stringNumber);
        System.out.println("The string value is: " + stringNumber);
        System.out.println("The integer value is: " + integerNumberTwo);
    }
}
