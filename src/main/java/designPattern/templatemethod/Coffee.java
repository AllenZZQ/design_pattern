package designPattern.templatemethod;

public class Coffee extends Caffeine {

    @Override
    protected void add() {
        System.out.println("add coffee");
    }

    @Override
    protected void finish() {
        System.out.println("finish coffee");
    }
}
