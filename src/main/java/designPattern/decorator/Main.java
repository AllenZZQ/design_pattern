package designPattern.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Capqino();
        beverage = new Sugar(beverage);
        beverage = new Moca(beverage);
        System.out.println(beverage.cost());
    }
}
