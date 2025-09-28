package demos;

import creational.factory.*;

import java.util.logging.Logger;

public class FactoryDemo {
    private static final Logger logger = Logger.getLogger(FactoryDemo.class.getName());

    public static void run() {
        try {
            System.out.println("\n--- Factory Method Pattern Demo: Rocket Creation ---");
            RocketFactory cargoFactory = new CargoRocketFactory();
            Rocket cargoRocket = cargoFactory.createRocket();
            cargoRocket.launch();

            RocketFactory passengerFactory = new PassengerRocketFactory();
            Rocket passengerRocket = passengerFactory.createRocket();
            passengerRocket.launch();
            logger.info("Factory demo completed successfully.");
        } catch (Exception e) {
            logger.severe("Unexpected error in factory demo: " + e.getMessage());
        }
    }
}
