package Day55.PracticeJavaProblems;

public class SleepIn {
    public static void main(String[] args) {
        // Testing the code to make sure it works! Saving space and putting some codes together
        SleepIn canISleepIn = new SleepIn();
        boolean weekday1 = false;boolean vacation1 = false;boolean sleepingin1 = canISleepIn.sleepIn(weekday1, vacation1);
        boolean weekday2 = true;boolean vacation2 = false;boolean sleepingin2 = canISleepIn.sleepIn(weekday2, vacation2);
        boolean weekday3 = false;boolean vacation3 = true;boolean sleepingin3 = canISleepIn.sleepIn(weekday3, vacation3);

        System.out.println("https://codingbat.com/prob/p187868");
        System.out.println("Warmup-1 > sleepIn");
        System.out.println("The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.");
        System.out.println("We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.");
        System.out.println("sleepIn(false, false) → true\n" +
                            "sleepIn(true, false) → false\n" +
                            "sleepIn(false, true) → true");
        System.out.println(" ");

        System.out.println("************* My results *************");
        System.out.println("sleepIn(" + weekday1 + ", " + vacation1 + ") → " + sleepingin1);
        System.out.println("sleepIn(" + weekday2 + ", " + vacation2 + ") → " + sleepingin2);
        System.out.println("sleepIn(" + weekday3 + ", " + vacation3 + ") → " + sleepingin3);

    }


    // https://codingbat.com/prob/p187868
    // My Answer Below ~~~~~
    public boolean sleepIn(boolean weekday, boolean vacation) { // Default line from website
        if (!weekday || vacation) { // Sleep in if !weekday or vacation
            return true;            // Return true if we sleep in
        }
        return false;               // Returns false if we don't sleep in.
    }


}
