package designPattern.templatemethod;

public abstract class Caffeine {

    public void make() {
        prepare();
        add();
        finish();
    }

    private void prepare() {
        System.out.println("prepare");
    }

    protected abstract void add();

    protected abstract void finish();
}
