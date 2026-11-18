package OOPS.ClassObjects;

public class Main {
    public static void main(String[] args) {
        ParkingSpot spotA = new ParkingSpot("A-01", SpotType.COMPACT);
        System.out.println("Created Sport A-01");

        try {
            ParkingSpot invalid = new ParkingSpot("", SpotType.COMPACT);
            System.out.println("Created spot with an empty ID");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected empty ID");
        }
    }
}
