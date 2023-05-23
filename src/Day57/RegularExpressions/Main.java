package Day57.RegularExpressions;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        validateEmail();
        validatePhoneNumber();
        validateDate();
        validateURL();
        validateCreditCardNumber();
        validateZipCode();
        validateJavaIdentifier();
        validateHexColorCode();
        validateTime();
    }

    public static void validateEmail() {
        String email = "thisisanexample@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValid = Pattern.matches(regex, email);
        System.out.println("Is the email address valid? " + isValid);
    }

    public static void validatePhoneNumber() {
        String phoneNumber = "(828) 555-1234";
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        boolean isValid = Pattern.matches(regex, phoneNumber);
        System.out.println("Phone number is valid: " + isValid);
    }

    public static void validateDate() {
        String date = "12/31/2023";
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2[0-9]|3[01])/\\d{4}$";
        boolean isValid = Pattern.matches(regex, date);
        System.out.println("The date is valid: " + isValid);
    }

    public static void validateURL() {
        String url = "https://www,youtube.com";
        String regex = "^(https?|ftp)://[\\w.-]+\\.\\w{2,20}$";
        boolean isValid = Pattern.matches(regex, url);
        System.out.println("Is URL valid: " + isValid);
    }

    public static void validateCreditCardNumber() {
        String creditCardNumber = "1234-5678-9012-3456";
        String regex = "^(\\d{4}[- ]?){4}$";
        boolean isValid = Pattern.matches(regex, creditCardNumber);
        System.out.println("Is credit card number valid: " + isValid);
    }

    public static void validateZipCode() {
        String zipCode = "28269-1234";
        String regex = "^\\d{5}(-\\d{4})?$";
        boolean isValid = Pattern.matches(regex, zipCode);
        System.out.println("Zip code is valid: " + isValid);
    }

    public static void validateJavaIdentifier() {
        String javaIdentifier = "_myVariable";
        String regex = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
        boolean isValid = Pattern.matches(regex, javaIdentifier);
        System.out.println("Java identifier is valid: " + isValid);
    }

    public static void validateHexColorCode() {
        String hexColorCode = "#FFA500";
        String regex = "^#[0-9a-fA-F]{6}$";
        boolean isValid = Pattern.matches(regex, hexColorCode);
        System.out.println("Hexadecimal color code is valid: " + isValid);
    }

    public static void validateTime() {
        String time = "12:34";
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        boolean isValid = Pattern.matches(regex, time);
        System.out.println("Time is valid: " + isValid);
    }
}

