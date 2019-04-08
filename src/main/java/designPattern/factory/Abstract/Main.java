package designPattern.factory.Abstract;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new BeefPizzaStore();
        double cost = pizzaStore.order();
        System.out.println(cost);
    }
}
