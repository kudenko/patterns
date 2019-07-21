package ch12;


public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist " + duck + " jusc quacked");
    }
}
