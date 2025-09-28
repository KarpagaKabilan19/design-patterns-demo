package demos;

import creational.singleton.MissionControl;

import java.util.logging.Logger;

public class SingletonDemo {
    private static final Logger logger = Logger.getLogger(SingletonDemo.class.getName());

    public static void run() {
        System.out.println("\n--- Singleton Pattern Demo: Mission Control Center ---");
        MissionControl mc1 = MissionControl.getInstance();
        MissionControl mc2 = MissionControl.getInstance();
        System.out.println("Instances are the same: " + (mc1 == mc2));
        mc1.sendCommand("Initiate launch sequence");
        logger.info("Singleton demo completed successfully.");
    }
}