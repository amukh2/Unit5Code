package lesson1;

import java.util.Random;

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
        accountNumber = Random().toString();

    }

    //overloaded constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
        accountNumber = Random().toString();
    }

    //overloaded constructor
    public BankAccount(double initialBalance, String name){
        balance = initialBalance;
        owner = name;
        accountNumber = Random().toString();
    }

    private Random Random(){
        Random rand = new Random();
        rand.ints(8);

        return rand;
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

    public void addInterest(double interestRate){
        balance += (interestRate/100) * balance;
    }

    public void changeInterest(double newInterestRate){
        interestRate = newInterestRate;
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
