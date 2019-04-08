package designPattern.templatemethod;

public class Tea extends Caffeine {
    @Override
    protected void add() {
        System.out.println("add tea");
    }

    @Override
    protected void finish() {
        System.out.println("finish tea");
    }
}
