package Day48.ChatBot;
import Day47.ScannerPractice.Greeting;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        greeting();
        yourName();
        ageGuesser();
        counting();
        testingYou();
        week();
        System.out.println("Thank you for talking to me. Have a great day!");
    }

    public static void greeting() {
        System.out.println("Hello there! My name is Chatbot! What is your name? ");
    }

    public static void yourName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Uh oh, my system was still booting and I didn't catch that. Can you retype your name?");
        String userNameAgain = scanner.nextLine();
        System.out.println("Thank you " + userNameAgain + " :).");

    }

    public static void ageGuesser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm known to be pretty good at guessing peoples age. Let me ask you some questions to guess your age.");
        System.out.println("Have you ever been accused of being a witch or practicing witchcraft? Yes or No?");
        String answer1 = scanner.nextLine().toLowerCase();;

        if (answer1.equalsIgnoreCase("yes")) {
            System.out.println("Haha! You're funny! Theres no way you were born before the 1800s");
        } else {
            System.out.println("Did you ever try to learn the choreography from a Britney Spears music video?");
            String answer2 = scanner.nextLine().toLowerCase();

            if (answer2.equalsIgnoreCase("yes")) {
                System.out.println("Aint no shame :), so then you must be in your 30's to 40s.");
            } else {
                System.out.println("Did you use Myspace and edit your Top 5 friends constantly?");
                String answer3 = scanner.nextLine().toLowerCase();

                if (answer3.equalsIgnoreCase("yes")) {
                    System.out.println("Okay seriously, you have to be in your 30s to 40s. I can't believe we werent friends on Myspace I mean Tom was everyones friend.");
                } else {
                    System.out.println("Have you ever played Runescape or know it?");
                    String answer4 = scanner.nextLine().toLowerCase();

                    if (answer4.equalsIgnoreCase("yes")) {
                        System.out.println("Okay, you HAVE to be under 30 because Runescape was the game back in the day!");
                    } else {
                        System.out.println("I'm sorry, I couldn't guess your age. But Let's try again.");
                    }
                }
            }
        }

        System.out.println("So like, asking for a friend... what year were you born?");
        int year = Integer.valueOf(scanner.nextLine());

        int currentYear = 2023;
        int usersAge = currentYear - year;
        System.out.println("You are " + usersAge + " years old. See what did I tell you, I could easily guess your age.");
        System.out.println("If I'm off by a year, it's just due to me being rusty \uD83E\uDD37.");
    }

    public static void counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and I will count to it.");
        int counting = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= counting; i++) { //dont set to 0 so that it wont start at 0
            System.out.println(i);
        }
        System.out.println(" ");
    }

    public static void testingYou() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's time for a quiz. Let's see how smart you actually are.");
        System.out.println(" ");
        System.out.println("Which of the following is a programming language?");

        System.out.println("A. Pterodactyl");
        System.out.println("B. Elon Musk");
        System.out.println("C. Java");
        System.out.println("D. Turbocharger");
        System.out.println(" ");

        String testAnswer = scanner.nextLine();

        while (true) {
            if (testAnswer.equalsIgnoreCase("c")) {
                System.out.println("That is correct! Good job!");
                break; // if you don't add this break, this will console log forever
            } else {
                System.out.println("Try again!");
                testAnswer = scanner.nextLine();
            }
        }

    }

    public static void week() {
        Scanner scanner = new Scanner(System.in);
        boolean continueWeek = true;

        while (continueWeek) {
            System.out.println("Enter a number 1 through 7 to know more about what I enjoy during the week (or type 'no' to end this.):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                continueWeek = false;
                break;
            }
            int number = Integer.parseInt(input); //convert string to int

            switch(number) {
            case 1: System.out.println("Bare minimum Mondays are a thing now");
                break;
            case 2: System.out.println("Tuesdays are just okay");
                break;
            case 3: System.out.println("Taco Wednesdays");
                break;
            case 4: System.out.println("Sunday Mayday");
                break;
            case 5: System.out.println("FRIDAY LETS Go0oo0o0o0o0o0o0o0o0o0o0o0o0o0oo0o00oo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            case 6: System.out.println("Saturday is a resting day");
                break;
            case 7: System.out.println("Sunday ... is another resting day lol");
                break;
            default: System.out.println("Bruh, I said to enter a number from 1 thru 7");

             }
        }//while loop ends here
    }

}


// Reference switch from w3
// https://www.w3schools.com/java/java_switch.asp
//      switch (day) {
//        case 6:
//        System.out.println("Today is Saturday");
//        break;
//        case 7:
//        System.out.println("Today is Sunday");
//        break;
//        default:
//        System.out.println("Looking forward to the Weekend");
//        }
