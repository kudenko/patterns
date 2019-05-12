package Singleton;

import FactoryRework.CheesePizza;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    public static synchronized ChocolateBoiler getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

}
