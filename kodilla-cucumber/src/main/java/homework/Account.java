package homework;

public class Account {
    private int balance = 0;

    public Account() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int amount) {
        this.balance -= amount;
    }
}
