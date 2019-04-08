package designPattern.factory.simple;

public class Main {

    public static void main(String[] args) {
        PizzeStore pizzeStore = new PizzeStore();
        double cost = pizzeStore.order("beef");
        System.out.println(cost);
    }
}