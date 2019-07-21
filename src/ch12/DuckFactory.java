package ch12;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseAsADuck() {
        return new GooseAdapter(new Goose());
    }
}
