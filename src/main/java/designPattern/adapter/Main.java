package designPattern.adapter;

public class Main {

    public static void main(String[] args) {
        AdInterface adInterface = new Adapter(new AdClass());
        adInterface.does();
    }
}
