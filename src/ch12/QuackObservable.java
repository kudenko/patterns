package ch12;

public interface QuackObservable {
    public void registerObserver(Observer o);
    public void notifyObservees();
}
