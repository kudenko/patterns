package ch12;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory d){
        Quackologist q = new Quackologist();

        Quackable mallarDucl = d.createMallarDuck();
        mallarDucl.registerObserver(q);

        Quackable redhead = d.createRedHeadDuck();
        Quackable duckCall = d.createDuckCall();
        Quackable rubber = d.createRubberDuck();
        Quackable qoose = d.createGooseAsADuck();

        Flock flock = new Flock();
        flock.add(redhead);
        flock.add(mallarDucl);
        flock.add(duckCall);
        flock.add(rubber);
        flock.add(qoose);

        flock.add(redhead);
        flock.add(mallarDucl);
        flock.add(duckCall);
        flock.add(rubber);
        flock.add(qoose);

        Flock flockOfMallar = new Flock();
        flockOfMallar.registerObserver(q);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);
        flockOfMallar.add(mallarDucl);


        System.out.println("DUCK SIMULATOR\n");
        simulate(mallarDucl);
        simulate(redhead);
        simulate(duckCall);
        simulate(rubber);
        simulate(qoose);
        System.out.println(QuackCounter.getQuacks() + " QUACKS");

        System.out.println("ALL ducks");
        simulate(flock);
        System.out.println("\nMallars only ducks");
        simulate(flockOfMallar);
    }

    private void simulate(Quackable q) {
        q.quack();
    }
}
