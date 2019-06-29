package Command;

public class Stereo {
    public void on(){
        System.out.println("Stereo On");
    }
    public void off(){
        System.out.println("Stereo OFF");
    }
    public void setCd(String cdName){
        System.out.println("Cd Set " + cdName);
    }
    public void setDvd(String dvdName){
        System.out.println("DVD set " + dvdName);
    }
    public void setRadio(){
        System.out.println("Radio setted");
    }
    public void setVolume(){
        System.out.println("Radio Volume");
    }
}
