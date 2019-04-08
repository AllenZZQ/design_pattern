package designPattern.templatemethod;

public class Main {

    public static void main(String[] args) {
        Caffeine coffee = new Coffee();
        coffee.make();
        Caffeine tea = new Tea();
        tea.make();
    }
}
