package Day49.ClassObjectConstructorPractice;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500, "First Assignment");
        BankAccount bankAccount1 = new BankAccount(5000, "Larry");
        BankAccount bankAccount2 = new BankAccount(300, "Mary");

        // Bank Account Assignment
        bankAccount.deposit(100);
        bankAccount.accountDetails();

        // Bank Transfer Assignment
        bankAccount1.withdrawal(100);
        bankAccount2.deposit(100);
        bankAccount1.accountDetails();
        bankAccount2.accountDetails();
    }

}

class BankAccount {
    private double accountBalance;
    private String accountName;

    public BankAccount(double accountBalance, String accountName) {
        this.accountBalance = accountBalance;
        this.accountName = accountName;
    }

    public void deposit ( double moneyAmount) {
        accountBalance = accountBalance + moneyAmount;
    }

    public void withdrawal (double moneyAmount) {
        if (accountBalance >= moneyAmount) {
            accountBalance = accountBalance - moneyAmount;
        } else {
            System.out.println("Not enough money. Please try again. ");
        }
    }

    public void accountDetails () {
        System.out.println(accountName + " account balance: " + accountBalance);
    }

}