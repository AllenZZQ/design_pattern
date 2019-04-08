package designPattern.decorator;

public class Moca extends CondimentDecorator {

    public Moca(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }
}
