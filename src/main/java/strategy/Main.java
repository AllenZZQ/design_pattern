package strategy;

import strategy.discount.VipDiscount;

public class Main {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.setDiscountStrategy(new VipDiscount());
        System.out.println(apple.getDiscountPrice());
    }
}
