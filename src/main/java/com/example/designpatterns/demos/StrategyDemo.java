package demos;

import behavioral.strategy.*;

import java.util.logging.Logger;

public class StrategyDemo {
    private static final Logger logger = Logger.getLogger(StrategyDemo.class.getName());

    public static void run() {
        try {
            System.out.println("\n--- Strategy Pattern Demo: Rover Navigation ---");
            Rover rover = new Rover();
            rover.setStrategy(new DirectNavigation());
            rover.performNavigation(5, 5);

            rover.setStrategy(new AvoidObstacleNavigation());
            rover.performNavigation(5, 5);
            logger.info("Strategy demo completed successfully.");
        } catch (IllegalStateException e) {
            logger.warning("Strategy error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            logger.severe("Unexpected error in strategy demo: " + e.getMessage());
        }
    }
}
