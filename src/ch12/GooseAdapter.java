package ch12;

public class GooseAdapter implements Quackable {
    Observable obs;

    Goose g;
    public GooseAdapter(Goose g){
        this.g = g;
        obs = new Observable(this);
    }

    @Override
    public void quack() {
        g.honk();
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
