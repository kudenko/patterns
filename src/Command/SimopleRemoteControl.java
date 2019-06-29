package Command;

public class SimopleRemoteControl {
    Command slot;

    public void setSlot(Command commanmd){
        slot = commanmd;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
