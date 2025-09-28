package creational.singleton;

public class MissionControl {
    private static MissionControl instance;

    private MissionControl() {
    }

    public static synchronized MissionControl getInstance() {
        if (instance == null) {
            instance = new MissionControl();
        }
        return instance;
    }

    public void sendCommand(String command) {
        if (command == null || command.isEmpty()) {
            throw new IllegalArgumentException("Command cannot be empty");
        }
        System.out.println("Mission Control sending: " + command);
    }
}
