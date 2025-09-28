package structural.decorator;

public class WeaponDecorator extends SpaceshipDecorator {
    public WeaponDecorator(Spaceship spaceship) {
        super(spaceship);
    }

    @Override
    public String getDescription() {
        return decoratedSpaceship.getDescription() + ", with Weapons";
    }

    @Override
    public double getCost() {
        return decoratedSpaceship.getCost() + 300000.0;
    }
}