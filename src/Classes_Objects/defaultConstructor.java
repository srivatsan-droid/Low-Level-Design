package Classes_Objects;
class Movie {
    String title;
    int duration;
    public Movie() {
        this.title = title;
        this.duration = duration;
    }
    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public void displayDetails() {
        System.out.println("Title : " + title + "\nDuration : " + duration);
    }
}
public class defaultConstructor {
    public static void main(String[] args) {
        Movie obj = new Movie("F1" , 2);
        obj.displayDetails();
        Movie obj1 = new Movie();
        obj1.title = "King";
        obj1.duration = 2;
        obj1.displayDetails();
    }
}
