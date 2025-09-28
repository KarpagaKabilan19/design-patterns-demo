package demos;

import structural.decorator.*;

import java.util.logging.Logger;

public class DecoratorDemo {
    private static final Logger logger = Logger.getLogger(DecoratorDemo.class.getName());

    public static void run() {
        try {
            System.out.println("\n--- Decorator Pattern Demo: Spaceship Feature Enhancer ---");
            Spaceship spaceship = new BasicSpaceship();
            spaceship = new ShieldDecorator(spaceship);
            spaceship = new WeaponDecorator(spaceship);
            System.out.println(spaceship.getDescription() + " costs $" + spaceship.getCost());
            logger.info("Decorator demo completed successfully.");
        } catch (Exception e) {
            logger.severe("Unexpected error in decorator demo: " + e.getMessage());
        }
    }
}
