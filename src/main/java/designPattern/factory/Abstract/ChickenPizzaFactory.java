package designPattern.factory.Abstract;

import designPattern.factory.ChickenPizza;
import designPattern.factory.Pizza;

public class ChickenPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new ChickenPizza();
    }
}
