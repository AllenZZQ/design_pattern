package designPattern.decorator;

public class Sugar extends CondimentDecorator {


    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
