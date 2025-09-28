package demos;

import structural.adapter.*;

import java.util.logging.Logger;

public class AdapterDemo {
    private static final Logger logger = Logger.getLogger(AdapterDemo.class.getName());

    public static void run() {
        try {
            System.out.println("\n--- Adapter Pattern Demo: Sensor Interface Adapter ---");
            OldSensor oldSensor = new OldSensor();
            NewSensor adaptedSensor = new SensorAdapter(oldSensor);
            System.out.println("Adapted sensor data: " + adaptedSensor.getData());
            logger.info("Adapter demo completed successfully.");
        } catch (NumberFormatException e) {
            logger.warning("Data parsing error: " + e.getMessage());
            System.out.println("Error parsing sensor data.");
        } catch (Exception e) {
            logger.severe("Unexpected error in adapter demo: " + e.getMessage());
        }
    }
}
