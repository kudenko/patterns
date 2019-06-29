package state.newState;

public class SoldOutState implements State {
    GumbleMachine2 gumbleMachine2;

    public SoldOutState(GumbleMachine2 gumbleMachine2){
        this.gumbleMachine2 = gumbleMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumble in the machine");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert quarter yet");

    }

    @Override
    public void turnCrunk() {
        System.out.println("You turned, but there are no gumbles");
    }

    @Override
    public void dispense() {
        System.out.println("No gumble in the machine");
    }


}
