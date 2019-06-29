package Adapter;

public class WildTurkry implements Turkey {
    @Override
    public void fly() {
        System.out.println("Short distance fly");
    }

    @Override
    public void qobble() {
        System.out.println("Qobble");
    }
}
