package demos;

import behavioral.observer.*;

import java.util.logging.Logger;

public class ObserverDemo {
    private static final Logger logger = Logger.getLogger(ObserverDemo.class.getName());

    public static void run() {
        try {
            System.out.println("\n--- Observer Pattern Demo: Satellite Battery Notifications ---");
            Satellite sat = new Satellite();
            GroundStation gs1 = new GroundStation("Ground Station 1");
            GroundStation gs2 = new GroundStation("Ground Station 2");
            sat.addObserver(gs1);
            sat.addObserver(gs2);

            sat.setBatteryLevel(50); // No notification
            System.out.println("Battery set to 50 - No alerts");
            sat.setBatteryLevel(10); // Notification
            logger.info("Observer demo completed successfully.");
        } catch (Exception e) {
            logger.severe("Unexpected error in observer demo: " + e.getMessage());
        }
    }
}
