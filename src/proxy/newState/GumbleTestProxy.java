package proxy.newState;

public class GumbleTestProxy {
    public static void main(String[] args) {
        int count = 0;
        if(args.length < 2){
            System.out.println("Gumble macchine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);
        GumbleMachine2 gumbleMachine2 = new GumbleMachine2(count, args[0]);

        GumbleMonitor gmonitor = new GumbleMonitor(gumbleMachine2);
        gmonitor.report();
    }


}
