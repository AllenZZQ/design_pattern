package designPattern.composite;

public class Main {

    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("a");
        MenuComponent menu2 = new MenuItem("b");
        MenuComponent menu3 = new MenuItem("c");
        menu1.add(menu3);
        menu1.getName();
        menu2.getName();

    }
}
