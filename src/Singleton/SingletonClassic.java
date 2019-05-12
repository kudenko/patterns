package Singleton;

public class SingletonClassic {
    private static SingletonClassic singleton;
    static SingletonClassic getInstance(){
        if(singleton == null){
            singleton = new SingletonClassic();
        }
        return singleton;
    }

    private SingletonClassic(){}
}
