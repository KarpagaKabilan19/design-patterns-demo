package structural.decorator;

public class BasicSpaceship implements Spaceship {
    @Override
    public String getDescription() {
        return "Basic Spaceship";
    }

    @Override
    public double getCost() {
        return 1000000.0;
    }
}
