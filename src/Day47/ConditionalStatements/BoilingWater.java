package Day47.ConditionalStatements;
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        int yourNumber = Integer.valueOf(scanner.nextLine());
        if (yourNumber > 212){
        System.out.println("Water is boiling!");
        } // prints the Water is Boiling if greater than 212
    }
}

//Create a class called "BoilingWater" that accepts user input
// asking for a number greater than 212.
// Write a conditional statement that writes that the
// "Water is boiling!" if the number entered is greater than or equal to 212.