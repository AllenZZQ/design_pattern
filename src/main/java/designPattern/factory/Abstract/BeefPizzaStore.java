package designPattern.factory.Abstract;

public class BeefPizzaStore extends PizzaStore {

    public BeefPizzaStore() {
        super(new BeefPizzaFactory());
    }
}
