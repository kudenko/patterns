package Singleton;

public class SingletonClassicImprove {
    private static SingletonClassicImprove singleton = new SingletonClassicImprove();
    static SingletonClassicImprove getInstance(){
        return singleton;
    }

    private SingletonClassicImprove(){}
}
