package designPattern.factory.Abstract;

import designPattern.factory.BeefPizza;
import designPattern.factory.Pizza;

public class BeefPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new BeefPizza();
    }
}
