package designPattern.strategy.discount;

public class NoDiscount extends DiscountStrategy {

    @Override
    public double getDiscount() {
        return 1;
    }
}
