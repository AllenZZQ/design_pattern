package strategy.discount;

public class HalfDiscount extends DiscountStrategy {

    @Override
    public double getDiscount() {
        return 0.5;
    }
}
