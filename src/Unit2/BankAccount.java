package Unit2;

public class BankAccount {
    String name;
    double balance;
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public String  getName() {
        return name;
    }
}