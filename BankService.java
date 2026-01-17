package bank ;
import java.util.ArrayList;

public class BankService {



    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(int accNo, String name, double bal) {
        accounts.add(new BankAccount(accNo, name, bal));
        System.out.println("Account Created Successfully ✅");
    }

    public BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo)
                return acc;
        }
        return null;
    }

    public void deposit(int accNo, double amount) {
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.balance += amount;
            System.out.println("Deposit Successful ");
        } else {
            System.out.println("Account Not Found ");
        }
    }

    public void withdraw(int accNo, double amount) {
        BankAccount acc = findAccount(accNo);
        if (acc != null && acc.balance >= amount) {
            acc.balance -= amount;
            System.out.println("Withdraw Successful ");
        } else {
            System.out.println("Insufficient Balance / Account Not Found ");
        }
    }

    public void checkBalance(int accNo) {
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.println("Balance: ₹" + acc.balance);
        } else {
            System.out.println("Account Not Found ");
        }
    }
}


