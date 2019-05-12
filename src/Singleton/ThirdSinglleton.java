package Singleton;

public class ThirdSinglleton {
    private volatile static ThirdSinglleton singleton;
    public static ThirdSinglleton getInstance(){
        if (singleton == null) {
            synchronized (ThirdSinglleton.class){
                if(singleton == null){
                    singleton = new ThirdSinglleton();
                }
            }
        }
        return singleton;
    }

    private ThirdSinglleton(){}


}
