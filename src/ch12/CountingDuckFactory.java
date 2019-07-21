package ch12;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallarDuck());

    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseAsADuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
