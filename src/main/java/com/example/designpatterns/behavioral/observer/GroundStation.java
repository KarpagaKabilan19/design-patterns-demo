package behavioral.observer;

public class GroundStation implements Observer {
    private final String name;

    public GroundStation(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received alert: " + message);
    }
}
