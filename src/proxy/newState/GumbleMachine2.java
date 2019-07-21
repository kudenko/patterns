package proxy.newState;

public class GumbleMachine2 {
    String location;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumbleMachine2 (int numberGumballs, String location){
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = numberGumballs;
        if(count >0){
            state = noQuarterState;
        }
    }

    public void isertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrunk();
        state.dispense();
    }

    void seetState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("Ball rolls down the slot...");
        if(count !=0){
            count--;
        }
    }

    public String getLocation(){
        return location;
    }

    public State getSoldOutState() {
        System.out.println("four");
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "GumbleMachine2{" +
                "soldOutState=" + soldOutState +
                ", noQuarterState=" + noQuarterState +
                ", hasQuarterState=" + hasQuarterState +
                ", soldState=" + soldState +
                ", winnerState=" + winnerState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
