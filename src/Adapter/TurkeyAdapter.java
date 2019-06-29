package Adapter;

public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        System.out.println("Duck like Turkey");
    }

    @Override
    public void fly() {
        turkey.qobble();
    }
}
