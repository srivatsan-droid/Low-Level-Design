package Classes_Objects;

public class carClass {
    String manufacturer;
    String model;
    int year;
    public carClass(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }
    //Methods :
    public void startEngine() {
        System.out.println("The " + year + " " + manufacturer + " " + model + " engine has started in" + year);
    }
    public void displayInfo() {
        System.out.println("Car info " + manufacturer + " " + model + " ( " + year + " ) ");
    }
    public static void main(String[] args) {
        carClass obj = new carClass("Honda" , "City" , 2000);
        obj.startEngine();
        obj.displayInfo();
    }
}
