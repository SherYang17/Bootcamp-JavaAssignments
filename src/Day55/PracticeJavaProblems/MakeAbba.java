package Day55.PracticeJavaProblems;

//https://codingbat.com/prob/p161056
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

public class MakeAbba {
    public String makeAbba(String a, String b) {
        return a+b+b+a; // abba... its kind of given?? a + b + b + a
    }
}
