package Day48.PracticingMethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(first());
        System.out.println(second());
        System.out.println(third());
    }

    public static String first () {             // a method that returns a string
        return "String of text";
    }

    public static Integer second () {           // a method that returns an integer
        return 5;
    }

    public static Boolean third () {           // a method that returns a boolean
        return false;
    }
}
//Output
//        String of text
//        5
//        false


