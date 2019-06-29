package Command;

public class RemoteControllerTest {
    public static void main(String[] args) {
        Light light = new Light();
        SimopleRemoteControl remote = new SimopleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor gDoor = new GarageDoor();
        GarageDoorOpenCommand openDoor = new GarageDoorOpenCommand(gDoor);
        remote.setSlot(lightOn);
        remote.buttonWasPressed();
        remote.setSlot(openDoor);
        remote.buttonWasPressed();

    }
}
