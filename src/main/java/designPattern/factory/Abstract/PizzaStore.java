package designPattern.factory.Abstract;

public abstract class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public double order() {
        return pizzaFactory.createPizza().cost();
    }
}
