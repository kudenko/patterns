package Command;

public class GarageDoorOpenCommand implements Command {

    GarageDoor gDoor;


    GarageDoorOpenCommand (GarageDoor gDoor){
        this.gDoor = gDoor;
    }

    @Override
    public void execute() {
        gDoor.up();
    }

    @Override
    public void undo() {
        gDoor.down();
    }
}
