import demos.*;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        logger.setLevel(Level.ALL);

        while (running) {
            System.out.println("\nDesign Patterns Demo (Space-Themed Use Cases)");
            System.out.println("1. Behavioral - Strategy: Rover Navigation Strategies");
            System.out.println("2. Behavioral - Observer: Satellite Battery Notifications");
            System.out.println("3. Creational - Singleton: Mission Control Center");
            System.out.println("4. Creational - Factory Method: Rocket Creation");
            System.out.println("5. Structural - Adapter: Sensor Interface Adapter");
            System.out.println("6. Structural - Decorator: Spaceship Feature Enhancer");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        StrategyDemo.run();
                        break;
                    case 2:
                        ObserverDemo.run();
                        break;
                    case 3:
                        SingletonDemo.run();
                        break;
                    case 4:
                        FactoryDemo.run();
                        break;
                    case 5:
                        AdapterDemo.run();
                        break;
                    case 6:
                        DecoratorDemo.run();
                        break;
                    case 0:
                        running = false;
                        logger.info("Exiting application.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        logger.warning("Invalid menu choice: " + choice);
                }
            } catch (java.util.InputMismatchException e) {
                logger.warning("Invalid input format: " + e.getMessage());
                System.out.println("Please enter a valid number.");
                scanner.next();
            } catch (Exception e) {
                logger.severe("Unexpected error: " + e.getMessage());
                System.out.println("An error occurred. Continuing...");
            }
        }
        scanner.close();
    }
}