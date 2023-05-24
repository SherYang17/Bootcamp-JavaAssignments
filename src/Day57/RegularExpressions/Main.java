package Day57.RegularExpressions;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        validateEmail(); // Write a regular expression to match a valid email address.
        validatePhoneNumber(); // Write a regular expression to match a valid phone number in the format (123) 456-7890.
        validateDate(); // Write a regular expression to match a valid date in the format MM/DD/YYYY.
        validateURL(); // Write a regular expression to match a valid URL.
        validateCreditCardNumber(); // Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).
        validateZipCode(); // Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).
        validateJavaIdentifier(); // Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).
        validateHexColorCode(); // Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).
        validateTime(); // Write a regular expression to match a valid time in the 24-hour format (HH:MM).
    }

    public static void validateEmail() {
        String email = "thisisanexample@example.com";   // type random email
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValid = Pattern.matches(regex, email); // parameter (regex, and first string)
        System.out.println("Is the email address valid? " + isValid);
        // ^ (start)
        // First -> A-Z (any uppercase), a-z (any lowercase), 0-9 (any number), +-.- (any of those symbols before @)
        // Second -> A-Z (any uppercase), a-z (any lowercase), 0-9 (any number), .- (any of those symbols before @)
        // $ (end)
    }

    public static void validatePhoneNumber() {
        String phoneNumber = "(828) 555-1234";
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        boolean isValid = Pattern.matches(regex, phoneNumber);
        System.out.println("Phone number is valid: " + isValid);
        // ^ (start)
        // \\( (opening parenthesis), \\d{3} (first 3 digits), \\) (closing parenthesis), \\d{3} (3 digits again), - dash, \\d{4} (last 4 digits)
        // $ (end)
    }


    public static void validateDate() {
        String date = "12/31/2023";
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2[0-9]|3[01])/\\d{4}$"; // this does not work "^\\d{2}-\\d{2}-\\d{4}$";
        boolean isValid = Pattern.matches(regex, date);
        System.out.println("The date is valid: " + isValid);
        // ^ (start)
        // (0[1-9]|1[0-2]) (first number 1-9, 2nd number 1-2 for months), / (slash symbol), (0[1-9]|1\\d|2[0-9]|3[01])
        // $ (end)

    }

    public static void validateURL() {
        String url = "https://www,youtube.com";
        String regex = "^(https?|ftp)://[\\w.-]+\\.\\w{2,20}$";
        boolean isValid = Pattern.matches(regex, url);
        System.out.println("Is URL valid: " + isValid);
        // ^ (start)
        // (https?|ftp) (either http, https, or ftp), :// (colon slash slash), [\\w.-]+ (one or more word characters, dots, or hyphens),
        // \\. (literal dot symbol), \\w{2,20} (two to twenty word characters)
        // $ (end)
    }

    public static void validateCreditCardNumber() {
        String creditCardNumber = "1234-5678-9012-3456";
        String regex = "^(\\d{4}[- ]?){4}$";
        boolean isValid = Pattern.matches(regex, creditCardNumber);
        System.out.println("Is credit card number valid: " + isValid);
        // ^ (start)
        // (\\d{4}[- ]?) (four digits followed by an optional dash or space), {4} (repeat four times)
        // $ (end)
    }

    public static void validateZipCode() {
        String zipCode = "28269-1234";
        String regex = "^\\d{5}(-\\d{4})?$";
        boolean isValid = Pattern.matches(regex, zipCode);
        System.out.println("Zip code is valid: " + isValid);
        // ^ (start)
        // \\d{5} (five digits), (-\\d{4})? (optional hyphen followed by four digits)
        // $ (end)

    }

    public static void validateJavaIdentifier() {
        String javaIdentifier = "_myVariable";
        String regex = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
        boolean isValid = Pattern.matches(regex, javaIdentifier);
        System.out.println("Java identifier is valid: " + isValid);
        // ^ (start)
        // [a-zA-Z_$] (any letter, underscore, or dollar sign as the first character),
        // [a-zA-Z0-9_$]* (zero or more letters, digits, underscores, or dollar signs as the remaining characters)
        // $ (end)
    }

    public static void validateHexColorCode() {
        String hexColorCode = "#FFA500";
        String regex = "^#[0-9a-fA-F]{6}$";
        boolean isValid = Pattern.matches(regex, hexColorCode);
        System.out.println("Hexadecimal color code is valid: " + isValid);
        // ^ (start)
        // # (literal hash symbol), [0-9a-fA-F]{6} (six characters from 0-9, a-f, or A-F)
        // $ (end)
    }

    public static void validateTime() {
        String time = "12:34";
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        boolean isValid = Pattern.matches(regex, time);
        System.out.println("Time is valid: " + isValid);
        // ^ (start)
        // ([01]\\d|2[0-3]) (hour part with 00-23 range), : (literal colon), [0-5]\\d (minute part with 00-59 range)
        // $ (end)
    }
}


//        Literal characters: Matches the character itself (e.g., "a" matches "a").
//        Metacharacters: Special characters with a specific meaning, such as:
//        .: Matches any single character except a newline.
//        *: Matches zero or more occurrences of the preceding character.
//        +: Matches one or more occurrences of the preceding character.
//        ?: Matches zero or one occurrence of the preceding character.
//        {n}: Matches exactly n occurrences of the preceding character.
//        {n,}: Matches at least n occurrences of the preceding character.
//        {n,m}: Matches between n and m occurrences of the preceding character.
//        [...]: Matches any one of the characters inside the square brackets.
//        [^...]: Matches any character not inside the square brackets.
//        ^: Matches the start of a line.
//        $: Matches the end of a line.
//        |: Matches either the expression before or the expression after the |.
//        \: Escapes special characters, allowing them to be treated as literal characters.
//        (...): Groups expressions together.


//In this example, the regular expression ^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$ is used to validate an email address. Here's a breakdown of the regex:
//
//        ^ denotes the beginning of the string.
//        [\\w.%+-]+ matches one or more word characters (letters, digits, or underscores), periods, percentage signs, plus signs, or hyphens.
//@ matches the at symbol.
//        [\\w.-]+ matches one or more word characters, periods, or hyphens.
//        \\. matches a period.
//        [A-Za-z]{2,} matches two or more letters.
//        $ denotes the end of the string.



