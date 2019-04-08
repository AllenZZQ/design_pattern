package designPattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AccountProxy implements InvocationHandler {

    private Account account;

    public AccountProxy(Account account) {
        this.account = account;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(account.getClass().getClassLoader(), account.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before-----");
        System.out.println(proxy.getClass());
        Object result = method.invoke(account, args);
        System.out.println("after");
        return result;
    }
}
