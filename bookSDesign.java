package LowLevelDesign;
/*
 * Title : S Single Responsibility in Solid 
 * We have basically a single class with the Multiple responsibility then we can have seperate method for each and every step which can make a design more functional and scalable 
 */
class Book {
	private String title;
	private String author;
	private int daysOverdue;
	private int timeTaken;
	//Constructor of the Class Defiened
	public Book(String title,String author,int daysOverdue,int timeTaken) {
		this.title = title;
		this.author = author;
		this.daysOverdue = daysOverdue;
		this.timeTaken = timeTaken;
	}
	public void printBooksDetails() {
		System.out.println("Title : "+ title);
		System.out.println("Author : "+ author);
	}
	//Calculate fine 
	public int calculateFine() {
		return daysOverdue * 5;
	}
	public String getTitle() {
		return title;
	}
	public int timeTake() {
		return timeTaken -daysOverdue;
	}
}

//Main Class
public class bookSDesign {

	//Driver Code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Harry Potter","J.k Rowling",5,10);
		obj.printBooksDetails();
		System.out.println(obj.calculateFine());
		System.out.println(obj.getTitle());
		System.out.println(obj.timeTake());
	}

}
