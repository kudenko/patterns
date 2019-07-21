package ch12;

public class QuackCounter implements Quackable {
    Quackable q;
    static int quackNumber;
    Observable obs;

    public QuackCounter(Quackable q){
        this.q = q;
        obs = new Observable(q);
    }

    public void quack(){
        q.quack();
        quackNumber++;
        notifyObservees();
    }

    public static int getQuacks(){
        return quackNumber;
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
