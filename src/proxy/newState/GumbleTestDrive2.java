package proxy.newState;

public class GumbleTestDrive2 {
    public static void main(String[] args) {
        GumbleMachine2 gumbleMachine2 = new GumbleMachine2(5, "North dacota");
        System.out.println( gumbleMachine2);

        gumbleMachine2.isertQuarter();
        gumbleMachine2.turnCrank();

        System.out.println( gumbleMachine2);

        gumbleMachine2.isertQuarter();
        gumbleMachine2.turnCrank();
        gumbleMachine2.isertQuarter();
        gumbleMachine2.turnCrank();
        gumbleMachine2.isertQuarter();
        gumbleMachine2.turnCrank();

        System.out.println( gumbleMachine2);

    }
}
