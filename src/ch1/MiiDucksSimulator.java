package ch1;

public class MiiDucksSimulator {
    public static void main(String[] args){
        Duck mallarduck = new MullardDuck();
        mallarduck.performFly();
        mallarduck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
