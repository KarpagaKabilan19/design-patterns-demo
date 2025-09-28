package structural.decorator;

public abstract class SpaceshipDecorator implements Spaceship {
    protected final Spaceship decoratedSpaceship;

    public SpaceshipDecorator(Spaceship spaceship) {
        if (spaceship == null) {
            throw new IllegalArgumentException("Decorated spaceship cannot be null");
        }
        this.decoratedSpaceship = spaceship;
    }

    @Override
    public String getDescription() {
        return decoratedSpaceship.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedSpaceship.getCost();
    }
}
