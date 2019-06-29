package Command;

public class RemoteLoader2 {
    public static void main(String[] args) {
        RemoteControlWithUndo rcwu = new RemoteControlWithUndo();

        Light lightInRoom = new Light();

        LightOnCommand inKitchen = new LightOnCommand(lightInRoom);
        LightOffCommand lightOff = new LightOffCommand(lightInRoom);

        rcwu.serCommand(0, inKitchen, lightOff);

        rcwu.onButtonWasPushed(0);
        rcwu.offButtonWasPushed(0);
        System.out.println(rcwu);

        rcwu.undeCommand();

        rcwu.onButtonWasPushed(0);
        rcwu.offButtonWasPushed(0);
        System.out.println(rcwu);
    }
}
