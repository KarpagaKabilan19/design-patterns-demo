package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Satellite {
    private final List<Observer> observers = new ArrayList<>();
    private int batteryLevel = 100;

    public void addObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setBatteryLevel(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100");
        }
        batteryLevel = level;
        if (batteryLevel < 20) {
            notifyObservers("Battery low: " + batteryLevel + "%");
        }
    }

    private void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}