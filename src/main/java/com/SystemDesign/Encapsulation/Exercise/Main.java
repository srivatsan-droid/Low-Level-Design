    package com.SystemDesign.Encapsulation.Exercise;

    import java.util.ArrayList;
    import java.util.List;

    class TemperatureSensor {
        private List<Double> readings = new ArrayList<>();

        public void addReading(double value) {
            // Only add if value is between -50 and 150 (inclusive)
            if(value >= -50 && value <= 150) {
                readings.add(value);
            }
        }

        public double getAverage() {
            // Return the average of all readings, or 0.0 if no readings exist
            if (readings.isEmpty())
                return 0.0;
            double sum = 0.0;
            for (double val : readings) {
                sum += val;
            }
            return sum / readings.size();
        }

        public int getReadingCount() {
            // Return how many readings have been recorded
            return readings.size();
        }

        public List<Double> getReadings() {
            // Return a defensive copy of the readings list (not the original)
            return new ArrayList<>(readings);
        }
    }

    // Test your implementation
    public class Main {
        public static void main(String[] args) {
            TemperatureSensor sensor = new TemperatureSensor();
            sensor.addReading(22.5);
            sensor.addReading(23.1);
            sensor.addReading(200.0);  // Should be rejected
            sensor.addReading(-10.0);

            System.out.println("Count: " + sensor.getReadingCount());  // 3
            System.out.printf("Average: %.2f\n", sensor.getAverage());     // 11.87
        }
    }
