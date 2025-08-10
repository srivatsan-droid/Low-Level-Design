package Classes_Objects;
class room {
    String name;
    room(String name) {
        this.name = name;
    }
}
class House {
    private room LivingRoom;
    private room kitchen;
    House() {
        LivingRoom = new room("Living Room");
        kitchen = new room("Kitchen");
    }
    void showHouse() {
        System.out.println("House Contains " + LivingRoom.name + " and " + kitchen.name);
    }
}
public class MainComposition {
    public static void main(String[] args) {
        House house = new House();
        house.showHouse();
    }
}
