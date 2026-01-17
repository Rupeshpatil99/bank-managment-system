package bank;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        BankService bank = new BankService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BANK MANAGEMENT SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    bank.createAccount(accNo, name, bal);
                    break;

                case 2:
                    System.out.print("Account No: ");
                    bank.deposit(sc.nextInt(), sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Account No: ");
                    bank.withdraw(sc.nextInt(), sc.nextDouble());
                    break;

                case 4:
                    System.out.print("Account No: ");
                    bank.checkBalance(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank You ");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice ");
            }
        }
    }
}


