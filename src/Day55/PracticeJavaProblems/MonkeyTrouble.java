package Day55.PracticeJavaProblems;

public class MonkeyTrouble {
    public static void main(String[] args) {
        // Testing the code to make sure it works! Saving space and putting some codes together
        MonkeyTrouble myMonkeyAssignment = new MonkeyTrouble();
        boolean aSmile1 = true;boolean bSmile1 = true; boolean introuble1 = myMonkeyAssignment.monkeyTrouble(aSmile1, bSmile1);
        boolean aSmile2 = false;boolean bSmile2 = false; boolean introuble2 = myMonkeyAssignment.monkeyTrouble(aSmile2, bSmile2);
        boolean aSmile3 = true;boolean bSmile3 = false; boolean introuble3 = myMonkeyAssignment.monkeyTrouble(aSmile3, bSmile3);

        System.out.println("https://codingbat.com/prob/p181646");
        System.out.println("Warmup-1 > monkeyTrouble");
        System.out.println("We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.");
        System.out.println("We are in trouble if they are both smiling or if neither of them is smiling.");
        System.out.println("Return true if we are in trouble.");
        System.out.println("monkeyTrouble(true, true) → true\n" +
                            "monkeyTrouble(false, false) → true\n" +
                            "monkeyTrouble(true, false) → false");
        System.out.println(" ");

        System.out.println("************* My results *************");
        System.out.println("sleepIn(" + aSmile1 + ", " + bSmile1 + ") → " + introuble1);
        System.out.println("sleepIn(" + aSmile2 + ", " + bSmile2 + ") → " + introuble2);
        System.out.println("sleepIn(" + aSmile3 + ", " + bSmile3 + ") → " + introuble3);
    }

    // https://codingbat.com/prob/p187868
    // My Answer Below ~~~~~
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile)); // if both smile is equal to asmile && bsmile. If not smiling, then ! to make it false.
        // Return is defaulted to true, else is false.
    }

}
