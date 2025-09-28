package structural.adapter;

public class SensorAdapter implements NewSensor {
    private final OldSensor oldSensor;

    public SensorAdapter(OldSensor oldSensor) {
        if (oldSensor == null) {
            throw new IllegalArgumentException("Old sensor cannot be null");
        }
        this.oldSensor = oldSensor;
    }

    @Override
    public int getData() {
        String dataStr = oldSensor.getDataAsString();
        if (!dataStr.startsWith("Data: ")) {
            throw new IllegalStateException("Invalid data format from old sensor");
        }
        return Integer.parseInt(dataStr.substring(6));
    }
}
