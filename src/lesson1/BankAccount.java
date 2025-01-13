package lesson1;

import java.util.Random;

/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account, it's properties):
 * account number, balance, interest rate, bank, owner
 */

public class BankAccount {

    private final String accountNumber;
    private double balance;
    private double interestRate;
    private String owner;

    //constructors must have same name as class
    public BankAccount(){
        balance = 0;
        accountNumber = Random();

    }

    //overloaded constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
        accountNumber = Random();
    }

    //overloaded constructor
    public BankAccount(double initialBalance, String name){
        balance = initialBalance;
        owner = name;
        accountNumber = Random();
    }

    private String Random(){
        Random rand = new Random();
        rand.ints(8);

        return rand.toString();
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

    public void changeOwner(String newOwner){
        owner = newOwner;
    }

    //getter (accessor)
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return String.format("Owner: %s\n Account Number: %s\nBalance: $%.2f\nInterest Rate: %.2f%%",owner, accountNumber, balance, interestRate);
    }
}
