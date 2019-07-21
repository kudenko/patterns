package proxy.newState;

public class GumbleMonitor {
    GumbleMachine2 gumbleMachine2;

    public GumbleMonitor(GumbleMachine2 gumbleMachine2){
        this.gumbleMachine2 = gumbleMachine2;
    }

    public void report(){
        System.out.println("Gumble machine is " + gumbleMachine2.getLocation());
        System.out.println("Current inventory " + gumbleMachine2.getCount() + " gumballs");
        System.out.println("Current state " + gumbleMachine2.getState());
    }
}
