package strategy.discount;

public class VipDiscount extends DiscountStrategy {

    @Override
    public double getDiscount() {
        return 0.4;
    }
}
