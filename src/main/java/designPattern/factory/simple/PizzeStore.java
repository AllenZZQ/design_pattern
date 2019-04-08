package designPattern.factory.simple;

import designPattern.factory.Pizza;

public class PizzeStore {

    public double order(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        return pizza.cost();
    }
}
