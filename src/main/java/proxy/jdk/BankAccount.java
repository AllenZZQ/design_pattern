package proxy.jdk;

public class BankAccount implements Account {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(int amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount < 0 || balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }


}
