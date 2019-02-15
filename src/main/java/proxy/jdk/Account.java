package proxy.jdk;

public interface Account {

    boolean withdraw(int amount);

    boolean deposit(int amount);

    int getBalance();
}
