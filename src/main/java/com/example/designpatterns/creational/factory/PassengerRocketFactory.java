package creational.factory;

public class PassengerRocketFactory implements RocketFactory {
    @Override
    public Rocket createRocket() {
        return new PassengerRocket();
    }
}
