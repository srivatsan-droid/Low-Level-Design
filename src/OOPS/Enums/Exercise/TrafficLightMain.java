package OOPS.ClassObjects.Exercise;

enum Color {
    RED(30),
    GREEN(25),
    YELLOW(5);

    private final int duration;
    Color(int duration) {
        this.duration = duration;
    }

    int duration() {
        return duration;
    }

    Color next() {
        switch(this) {
            case RED :
                return GREEN;
            case GREEN :
                return YELLOW;
            default :
                return RED;
        }
    }
}
class trafficLight {
    private Color current;

    public trafficLight(String startColor) {
        Color parsed = Color.RED;
        for (Color color : Color.values()) {
            if (color.name().equalsIgnoreCase(startColor)) {
                parsed = color;
                break;
            }
        }
        this.current = parsed;
    }

    public String getColor() {
        return current.name();
    }

    public int getDuration() {
        return current.duration();
    }

    public String next() {
        current = current.next();
        return current.name();
    }

    public String describe() {
        return current.name() + " (" + current.duration() + "s)";
    }
}
public class TrafficLightMain {
    public static void main(String[] args) {
        trafficLight obj = new trafficLight("RED");
        System.out.println(obj.getColor());
        System.out.println(obj.getDuration());
        System.out.println(obj.next());
        System.out.println(obj.describe());
    }
}
