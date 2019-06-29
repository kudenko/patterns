package state.newState;

import java.util.Random;

public class HasQuarterState implements State {
    GumbleMachine2 gumbleMachine2;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumbleMachine2 gumbleMachine2){
        this.gumbleMachine2 = gumbleMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumbleMachine2.seetState(gumbleMachine2.getNoQuarterState());
    }

    @Override
    public void turnCrunk() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt();
        if((winner == 0) && gumbleMachine2.getCount() > 1){
            System.out.println("one");
            gumbleMachine2.seetState(gumbleMachine2.getWinnerState());
            System.out.println("two");

        }else {
            System.out.println("three");

            gumbleMachine2.seetState(gumbleMachine2.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumble dispensed");
    }
}
