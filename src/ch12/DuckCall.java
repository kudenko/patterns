package ch12;

public class DuckCall implements Quackable {
    Observable obs;

    @Override
    public void quack() {
        System.out.println("KWAK");
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
