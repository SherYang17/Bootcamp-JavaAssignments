package Day50.BankAccount.BankAccountsPart1;
import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount bankAccount = new BankAccount(500, "First Assignment", 1);
        BankAccount bankAccount1 = new BankAccount(5000, "Larry", 2);
        BankAccount bankAccount2 = new BankAccount(300, "Mary", 3);
        BankAccount bankAccount3 = new BankAccount();

        // Bank Account Assignment
        bankAccount.deposit(100);
//        bankAccount.accountDetails();
//
//      // Bank Transfer Assignment
        bankAccount1.withdrawal(100);
        bankAccount2.deposit(100);
//        bankAccount1.accountDetails();
//        bankAccount2.accountDetails();

        // Bank Account Continued Homework
        accounts.add(bankAccount);
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);
        accounts.add(bankAccount3);

        bankAccount.accountDetails();
        bankAccount1.accountDetails();
        bankAccount2.accountDetails();
        bankAccount3.accountDetails();

    }


}

