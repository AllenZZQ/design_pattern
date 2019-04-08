package designPattern.strategy;

import designPattern.strategy.discount.DiscountStrategy;
import designPattern.strategy.discount.NoDiscount;

public abstract class Fruit {

    private double price;

    private DiscountStrategy discountStrategy;

    public Fruit(DiscountStrategy discountStrategy) {
        this();
        this.discountStrategy = discountStrategy;
    }

    public Fruit() {
        this.discountStrategy = new NoDiscount();
        setPrice(initPrice());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String name();

    public abstract String color();

    public abstract double initPrice();

    public double getDiscountPrice() {
        return discountStrategy.getDiscount() * price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
