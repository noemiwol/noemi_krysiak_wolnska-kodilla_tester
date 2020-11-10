package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {

    }

    public void deposit(int cashInTotal) {
        this.balance += cashInTotal;

    }

    public int getBalance() {
        return balance;
    }

    public void debit(int amount) {
        this.balance -= amount;
    }
}
