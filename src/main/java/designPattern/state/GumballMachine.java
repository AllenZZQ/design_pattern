package designPattern.state;

public class GumballMachine {


    private State currentState;

    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            currentState = new NoQuarterState(this);
        } else {
            currentState = new SoldOutState(this);
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void releaseBall() {
        System.out.println("release a ball");
        if (count != 0) {
            count --;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }


}
