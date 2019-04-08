package designPattern.state;

import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    private Random random = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("already inserted a quarter");
    }


    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter");
        gumballMachine.setCurrentState(new NoQuarterState(gumballMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned");
        if (random.nextInt(10) == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setCurrentState(new WinnerState(gumballMachine));
        } else {
            gumballMachine.setCurrentState(new SoldState(gumballMachine));
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispense");

    }
}
