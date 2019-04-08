package designPattern.composite;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getName() {
        throw new UnsupportedOperationException();
    }
}
