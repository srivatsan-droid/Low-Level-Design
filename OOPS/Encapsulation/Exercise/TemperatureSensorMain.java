package OOPS.Encapsulation.Exercise;

import java.util.ArrayList;
import java.util.List;

class TemperatureSensor {
    private List<Double> readings = new ArrayList<>();

    public void addReading(double value) {
        if (value >= -50 && value <= 150) {
            readings.add(value);
        }
    }

    public double getAverage() {
        if (readings.isEmpty())
            return 0.0;
        double sum = 0.0;
        for (double val : readings) {
            sum += val;
        }
        return sum / readings.size();
    }

    public int getReadingCount() {
        return readings.size();
    }

    public List<Double> getReadings() {
        return new ArrayList<>(readings);
    }
}

public class TemperatureSensorMain {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.addReading(22.5);
        sensor.addReading(23.1);
        sensor.addReading(200.0); // rejected
        sensor.addReading(-10.0);

        System.out.println("Count: " + sensor.getReadingCount());
        System.out.println("Average: " + sensor.getAverage());
    }
}
