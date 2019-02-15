package proxy.jdk;

public class Main {


    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Account account = new BankAccount(100);
        AccountProxy accountProxy = new AccountProxy(account);

        Account proxy = accountProxy.getProxy();
        System.out.println(proxy.getClass());
        proxy.deposit(10);


    }
}
