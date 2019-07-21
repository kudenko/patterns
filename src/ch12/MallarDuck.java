package ch12;

public class MallarDuck implements Quackable{
    Observable obs;

    public MallarDuck(){
        obs = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("QUACK mallarduck");
        notifyObservees();
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
