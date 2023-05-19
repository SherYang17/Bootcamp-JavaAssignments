package Day55.PracticeJavaProblems;


//https://codingbat.com/prob/p154485
// Warmup-1 > sumDouble

//Given two int values, 1. return their sum. 2. Unless the two values are the same, 3. then return double their sum.

public class SumDoubleOne {
    public int sumDouble(int a, int b) { //Given two int values
        if (a == b) {         // 2. Unless the two values are the same
            return 2 * (a +b);// 3. then return double their sum.
        } else {
            return a + b;     // 1. return their sum
        }
    }

}
