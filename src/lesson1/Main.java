package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(50);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(10);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(30);
        System.out.println(myAccount.getBalance());

    }
}
