package Adapter;


public class DuckTestDrive {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();

        WildTurkry wildTurkry = new WildTurkry();

        Duck tukreyAdapter = new TurkeyAdapter(wildTurkry);
        System.out.println("Duck");
        mallarDuck.quack();

        System.out.println("Turkey");
        wildTurkry.qobble();

        System.out.println("Adapter");
        tukreyAdapter.quack();

        Turkey turkeyAdapter = new DuckAdapter(mallarDuck);
        turkeyAdapter.qobble();
        turkeyAdapter.fly();


    }
}
