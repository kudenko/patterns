package Command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();


    Light livingRoom = new Light();
    Light kitchenLight = new Light();

    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo();

    LightOnCommand livingRoomOnLight = new LightOnCommand(livingRoom);
    LightOffCommand livingRoomOff = new LightOffCommand(livingRoom);

    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
    StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);

    remoteControl.serCommand(0, livingRoomOnLight, livingRoomOff);
    remoteControl.serCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);

    remoteControl.serCommand(2, stereoOnWithCdCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }


}
