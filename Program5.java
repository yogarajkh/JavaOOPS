import java.util.*;

class Account {
    String customerName;
    String accountNumber;
    double balance;
    String accountType;

    Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    double getBalance() {
        return balance;
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber, "Savings");
        this.interestRate = interestRate;
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of " + interest + " deposited.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 50.0;

    CurrentAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
        checkMinimumBalance();
    }

    void checkMinimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Minimum balance not maintained. Service charge of " + SERVICE_CHARGE + " imposed.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");

        System.out.print("Enter customer name for Savings Account: ");
        String savCustomerName = scanner.nextLine();
        System.out.print("Enter account number for Savings Account: ");
        String savAccountNumber = scanner.nextLine();
        System.out.print("Enter interest rate for Savings Account: ");
        double interestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savCustomerName, savAccountNumber, interestRate);

        scanner.nextLine(); // Consume newline
        System.out.print("Enter customer name for Current Account: ");
        String currCustomerName = scanner.nextLine();
        System.out.print("Enter account number for Current Account: ");
        String currAccountNumber = scanner.nextLine();

        CurrentAccount currentAccount = new CurrentAccount(currCustomerName, currAccountNumber);

        int i = 1;
        while (i == 1) {
            System.out.println("\n1. Deposit into Savings account");
            System.out.println("2. Deposit into Current account");
            System.out.println("3. Deposit interest");
            System.out.println("4. Withdraw from Savings account");
            System.out.println("5. Withdraw from Current account");
            System.out.println("6. Display balance in Savings account");
            System.out.println("7. Display balance in Current account");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be deposited: ");
                    double amt = scanner.nextDouble();
                    savingsAccount.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    double a = scanner.nextDouble();
                    currentAccount.deposit(a);
                    break;
                case 3:
                    savingsAccount.computeAndDepositInterest();
                    break;
                case 4:
                    System.out.print("Enter amount to be withdrawn: ");
                    double am = scanner.nextDouble();
                    savingsAccount.withdraw(am);
                    break;
                case 5:
                    System.out.print("Enter amount to be withdrawn: ");
                    double amot = scanner.nextDouble();
                    currentAccount.withdraw(amot);
                    break;
                case 6:
                    savingsAccount.displayBalance();
                    break;
                case 7:
                    currentAccount.displayBalance();
                    break;
                case 8:
                    i = 0;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        
    }
}
