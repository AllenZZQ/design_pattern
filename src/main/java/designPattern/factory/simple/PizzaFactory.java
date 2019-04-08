package designPattern.factory.simple;

import designPattern.factory.BeefPizza;
import designPattern.factory.ChickenPizza;
import designPattern.factory.Pizza;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        if ("beef".equals(type)) {
            return new BeefPizza();
        } else if ("chicken".equals(type)) {
            return new ChickenPizza();
        } else {
            return null;
        }
    }
}
