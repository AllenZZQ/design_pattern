package designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String name;

    public Menu(String name) {
        this.name = name;
    }

    private List<MenuComponent> list = new ArrayList<>();

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void getName() {
        System.out.println(name);
        for (MenuComponent menuComponent : list) {
            menuComponent.getName();
        }
    }
}
