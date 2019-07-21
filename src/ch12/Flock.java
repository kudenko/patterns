package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }


    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void notifyObservees() {

    }
}
