package strategy;

public class Apple extends Fruit {

    @Override
    public String name() {
        return "apple";
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public double initPrice() {
        return 10;
    }
}
