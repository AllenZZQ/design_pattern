package designPattern.composite;

public class MenuItem extends MenuComponent {

    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
