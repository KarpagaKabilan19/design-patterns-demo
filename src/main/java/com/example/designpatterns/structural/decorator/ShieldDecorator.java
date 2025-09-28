package structural.decorator;

public class ShieldDecorator extends SpaceshipDecorator {
    public ShieldDecorator(Spaceship spaceship) {
        super(spaceship);
    }

    @Override
    public String getDescription() {
        return decoratedSpaceship.getDescription() + ", with Shield";
    }

    @Override
    public double getCost() {
        return decoratedSpaceship.getCost() + 200000.0;
    }
}
