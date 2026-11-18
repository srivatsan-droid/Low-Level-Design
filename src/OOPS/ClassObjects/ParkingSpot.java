package OOPS.ClassObjects;

public class ParkingSpot {
    private final String id;
    private final SpotType type;
    private Vehicle vehicle;

    public ParkingSpot(String id,SpotType type) {
        if(id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Spot ID cannot be Empty");
        }
        this.id = id;
        this.type = type;
        this.vehicle = null;
    }
}
