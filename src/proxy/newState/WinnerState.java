package proxy.newState;

public class WinnerState implements State {

    GumbleMachine2 gumbleMachine2;

    public WinnerState(GumbleMachine2 gumbleMachine2){
        this.gumbleMachine2 = gumbleMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you are already turned the crank");

    }

    @Override
    public void turnCrunk() {
        System.out.println("Turning twice doesn't give you double gumball");
    }

    @Override
    public void dispense() {
        System.out.println(
                "You are a winner and get 2 gums!"
        );
        gumbleMachine2.releaseBall();
        if(gumbleMachine2.getCount() == 0){
            System.out.println("Sorry. no gums in the machine");
            gumbleMachine2.seetState(gumbleMachine2.getSoldOutState());
        }else  if(gumbleMachine2.getCount() > 0){
            gumbleMachine2.releaseBall();
            gumbleMachine2.seetState(gumbleMachine2.getNoQuarterState());
        }else{
            System.out.println("No gumballs");
            gumbleMachine2.seetState(gumbleMachine2.getSoldOutState());
        }
    }
}
