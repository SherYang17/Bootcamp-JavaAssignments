package Day50.BankAccount.BankAccountsPart2BankMenuBankTransfer;
import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount bankAccount = new BankAccount(500, "Hector", 1);
        BankAccount bankAccount1 = new BankAccount(5000, "Larry", 2);
        BankAccount bankAccount2 = new BankAccount(300, "Mary", 3);
//        BankAccount bankAccount3 = new BankAccount();

        accounts.add(bankAccount);
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);
//        accounts.add(bankAccount3);


        System.out.println("Hellow World! Welcome to the Bank of Sher!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int accountChoice = scanner.nextInt();
        scanner.nextLine(); // Include this or else the two sout below will display and break the code https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo




        if (accountChoice == 1) {

            System.out.println("Select an account:");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i).getAccountName());
            }
            scanner.nextLine();
        }


        if (accountChoice == 2) {
            // Create a new account
//            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Bank of Sher! Enter your name.");
            String accountHolder = scanner.nextLine();
            System.out.println("What is the beginning balance for the account?");
            double initialBalance = scanner.nextDouble();

            BankAccount newAccount = new BankAccount(initialBalance, accountHolder, accounts.size() + 1);
            accounts.add(newAccount);

            System.out.println("Your new account has been created successfully.");
            mainMenu(newAccount, accounts);
        } else if (accountChoice >= 1 && accountChoice <= accounts.size()) {
            BankAccount selectedAccount = accounts.get(accountChoice - 1);
            mainMenu(selectedAccount, accounts);
        } else {
            System.out.println("Sorry, invalid choice, exiting the menu...Please try again.");
        }

        if (accountChoice == -1) {
            System.out.println("HAVEA  NICE DAY");
        }

    }





    public static void mainMenu(BankAccount bankAccount, ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean exitMenu = false;

        System.out.println("Hello " + bankAccount.getAccountName() + "!");
        System.out.println("Welcome to the main menu, what would you like to do today?");

        while (!exitMenu) {
            System.out.println("1. To Check Account Balance");
            System.out.println("2. To Make A Withdrawal");
            System.out.println("3. To Make A Deposit");
            System.out.println("4. To Make A Transfer To An Another Account");
            System.out.println("0. To Exit");
            userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("Account Balance: $" + bankAccount.getAccountBalance());
                    break;
                case "2":
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                    bankAccount.withdrawal(withdrawalAmount);
                    break;
                case "3":
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                    bankAccount.deposit(depositAmount);
                    break;
                case "4":
                    System.out.print("Enter the destination account number: ");
                    int destinationAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                    System.out.print("Enter the transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

                    BankAccount destinationAccount = null;

                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == destinationAccountNumber) {
                            destinationAccount = account;
                            break;
                        }
                    }

                    if (destinationAccount != null) {
                        bankAccount.transfer(destinationAccount, transferAmount);
                    } else {
                        System.out.println("Destination account not found. You must enter a real account, the transfer is cancelled.");
                    }
                    break;
                case "0":
                    System.out.println("Thank you for using Bank Of Sher! Have a nice day!");
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }








}