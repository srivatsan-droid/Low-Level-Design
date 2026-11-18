package OOPS.ClassObjects.Exercise;

class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public boolean borrow() {
        if (!available) {
            return false;
        }
        available = false;
        return true;
    }

    public boolean returnBook() {
        if (available) {
            return false;
        }
        available = true;
        return true;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getInfo() {
        String status = available ? "Available" : "Borrowed";
        return title + " by " + author + " (ISBN: " + isbn + ") - " + status;
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Book obj = new Book("The Pragmatic Programmer","David Thomas","978-0135957059");
        String getInfo = obj.getInfo();
        System.out.println(getInfo);
        boolean borrow = obj.borrow();
        System.out.println(borrow);
        boolean ans = obj.returnBook();
        System.out.println(ans);
        String getInfo1 = obj.getInfo();
        System.out.println(getInfo1);
    }
}
