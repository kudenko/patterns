package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    Quackable duck;

    public Observable(Quackable duck){
        this.duck = duck;
    }


    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void notifyObservees() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer o = (Observer)iterator.next();
            o.update(duck);
        }
    }
}
