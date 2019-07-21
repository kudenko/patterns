package ch12;

public class RubberDuck  implements Quackable{
    Observable obs;

    public RubberDuck(){
        obs = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("SQUEAK");
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
