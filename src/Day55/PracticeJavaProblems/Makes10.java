package Day55.PracticeJavaProblems;


// https://codingbat.com/prob/p182873
// Given 2 ints, a and b, 1. return true if one if them is 10 or if their sum is 10.
public class Makes10 {
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) { // One of them is 10 meaning a == 10 or b == 10, and sum is 10 so a + b == 10.
            return true;                         // Return true because the statement above
        } else {
            return false;
        }

    }

}
