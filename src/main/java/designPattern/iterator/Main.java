package designPattern.iterator;

public class Main {

    public static void main(String[] args) {

        MenuHouse menuHouse = new MenuHouse();
        menuHouse.addMenu(new Menu("a"));
        menuHouse.addMenu(new Menu("b"));
        menuHouse.addMenu(new Menu("c"));
        menuHouse.addMenu(new Menu("d"));
        Iterator<Menu> iterator = menuHouse.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }
    }
}
