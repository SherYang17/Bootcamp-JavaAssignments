package Day55.PracticeJavaProblems;

// https://codingbat.com/prob/p116624

// Given an int n, 1. return the absolute difference between n and 21, 2. except return double the absolute difference 3. if n is over 21.
public class Diff21 {
    public int diff21(int n) {
        if (n <= 21) {           // need a statement for when (n is over 21) for the else statement  (do opposites)
            return 21 - n;       // 1. return the absolute difference between (n and 21)
        } else {                 // 3. if n is over 21.
            return (n - 21) *2;  // 2. except return (double the absolute difference)
        }
    }

}
