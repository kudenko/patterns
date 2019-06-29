package Adapter;

public class DuckAdapter implements Turkey {
    Duck duck;
    DuckAdapter(Duck duck){
        this.duck = duck;
    }
    @Override
    public void fly() {
        System.out.println("I'm fly from Duck Adapter for Turkey Object");
    }

    @Override
    public void qobble() {
        System.out.println("I'm said method from DuckAdapter");
        duck.quack();
    }
}
