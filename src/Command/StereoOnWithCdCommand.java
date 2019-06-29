package Command;

public class StereoOnWithCdCommand implements Command{

    Stereo stereo;

    StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("CHRISTMAS");
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
