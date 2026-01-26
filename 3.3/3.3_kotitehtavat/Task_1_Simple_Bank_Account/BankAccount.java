package Task_1_Simple_Bank_Account;

public class BankAccount {
    // Your variable declarations and code here
    private int accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    // calculating Total number of accounts
    public BankAccount(double initialBalance) {
        totalAccounts++;
        this.accountNumber = totalAccounts;
        this.balance = initialBalance;
    }

    // deposit and withdraw counting
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else  {
            System.out.println("Not enough balance!");
        }
    }

    // getters
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }




    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
