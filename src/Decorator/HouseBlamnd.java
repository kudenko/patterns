package Decorator;

public class HouseBlamnd extends Beverage {
    public HouseBlamnd(){
        description ="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
