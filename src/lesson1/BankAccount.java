package lesson1;

/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account, it's properties):
 * account number, balance, interest rate, bank, owner
 */

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;

    //constructors must have same name as class
    public BankAccount(){
        balance = 0;
    }

    //overloaded constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    //setters (mutators)

    /**
     * Deposits a specified amount of money into the
     * account
     * @param amount amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    //getter (accessor)
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f",balance);
    }
}
