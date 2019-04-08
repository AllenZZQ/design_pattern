package designPattern.strategy;

public class Banana extends Fruit {

    @Override
    public String name() {
        return "banana";
    }

    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public double initPrice() {
        return 20;
    }
}
