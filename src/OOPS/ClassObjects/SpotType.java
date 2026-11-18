package OOPS.ClassObjects;

public enum SpotType {
    COMPACT,
    LARGE;

    public boolean fits(Vehicle vehicle) {
        return this == LARGE || vehicle.getType() == VehicleType.CAR;
    }
}
