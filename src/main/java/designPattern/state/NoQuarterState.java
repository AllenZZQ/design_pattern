package designPattern.state;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("insert a quarter");
        gumballMachine.setCurrentState(new HasQuarterState(gumballMachine));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you need to insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you need to insert a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to insert a quarter");
    }
}
