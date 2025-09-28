package creational.factory;

public class CargoRocketFactory implements RocketFactory {
    @Override
    public Rocket createRocket() {
        return new CargoRocket();
    }
}
