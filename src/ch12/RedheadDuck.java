package ch12;

public class RedheadDuck implements Quackable {
    Observable obs;

    public RedheadDuck(){
        obs = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("QUACK FROM ReadHead Duck");
        obs.notifyObservees();
    }

    @Override
    public void registerObserver(Observer o) {
        obs.registerObserver(o);
    }

    @Override
    public void notifyObservees() {
        obs.notifyObservees();
    }
}
