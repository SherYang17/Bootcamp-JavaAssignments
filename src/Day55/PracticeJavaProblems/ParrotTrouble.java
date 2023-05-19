package Day55.PracticeJavaProblems;

// https://codingbat.com/prob/p140449
// We have a loud talking parrot.
// The "hour" parameter is the current hour time in the range 0..23.
// 1. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
// 2. eturn true if we are in trouble.

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) { // 1. We are in trouble if the parrot is (talking) and the (hour is before 7 or after 20).
            return true;                          // 2. Return true if we are in trouble.
        } else {
            return false;
        }
    }
}
