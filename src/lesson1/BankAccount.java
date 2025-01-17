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
    private double fee;
    private int feeCount;

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

    /**
     * Creates a random 8 digit long account number
     * 
     * @return the generated bank account number
     */
    private String Random(){
        Random rand = new Random();
        rand.ints(8);

        return rand.toString();
    }

    //setters (mutators)

    /**
     * Deposits a specified amount of money into the
     * account and charges a fee
     * @param amount amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
        fee = amount * .05;
        balance -= fee;
        feeCount++;
    }

    /**
     * Withdraws a specified amount of money form the account and
     * charges a fee.
     * @param amount amount to withdraw
     */
    public void withdraw(double amount){
        balance -= amount;
        fee = amount * .05;
        balance -= fee;
        feeCount++;
    }

    /**
     * Adds a specific interest rate to the balance
     * @param interestRate interest rate percentage
     */
    public void addInterest(double interestRate){
        balance += (interestRate/100) * balance;
    }

      /**
     * Changes the interest rate
     * @param newInterestRate the new enetered interest rate
     */
    public void changeInterest(double newInterestRate){
        interestRate = newInterestRate;
    }

      /**
     * Changes bank account owner
     * @param newOwner name of the new owner
     */
    public void changeOwner(String newOwner){
        owner = newOwner;
    }

      /**
     * If the user has used more than the allotted free transactions (20)
     * it deducts 50 cents per additional transaction which is deducted at the end of the month
     * @param newOwner name of the new owner
     */
    public void deductMonthlyFee(){
        if (feeCount > 20){
            balance = balance - ((feeCount - 20) * .50);
        }
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
