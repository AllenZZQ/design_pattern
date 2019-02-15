package strategy;

public class Orange extends Fruit {

    @Override
    public String name() {
        return "orange";
    }

    @Override
    public String color() {
        return "orange";
    }

    @Override
    public double initPrice() {
        return 30;
    }
}
