package state.newState;


public class NoQuarterState implements State {
    GumbleMachine2 gumballMachine2;

    public NoQuarterState (GumbleMachine2 gumballMachine2){
        this.gumballMachine2 = gumballMachine2;
    }
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine2.seetState(gumballMachine2.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");

    }

    @Override
    public void turnCrunk() {
        System.out.println("You turned but there is no quarter");

    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");

    }
}
