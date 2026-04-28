package OOPS.ClassesObjects.Exercise;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // check if the book is borrowed
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // Method to Define for Returning the books
    public void returnBook() {
        isAvailable = true;
    }

    public void displayInfo() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ") - " + status);
    }
}

public class MainLibraryManagement {
    public static void main(String[] args) {
        Book book = new Book("The Pragmatic Programmer", "David Thomas", "978-0135957059");
        book.displayInfo();

        boolean success = book.borrowBook();
        System.out.println("Borrow successful: " + success);
        book.displayInfo();

        success = book.borrowBook();
        System.out.println("Borrow successful: " + success);

        book.returnBook();
        book.displayInfo();
    }
}
