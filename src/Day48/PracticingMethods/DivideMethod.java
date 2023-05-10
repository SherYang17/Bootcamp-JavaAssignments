package Day48.PracticingMethods;

public class DivideMethod {
    public static void main(String[] args) {
        double division = divide(1,3);
        System.out.println("1 / 3 = " + division);

    }

    public static double divide (double num1, double num2) {
        return num1/num2;
    }
}

// Output
// 1 / 3 = 0.3333333333333333



// public static double divide (double num1, double num2) {
//        double total = (double) num1 / num2;        red error appears because it keeps saying redundant but it works if using this line and the next line equalling return total;
//        return total;
//
//    }