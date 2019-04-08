package designPattern.factory.Abstract;

public class ChickenPizzaStore extends PizzaStore {
    public ChickenPizzaStore() {
        super(new ChickenPizzaFactory());
    }
}
