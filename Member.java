package libraryManagementSystem;
import java.util.ArrayList;
public class Member {
	
		//declaring the private fields
	private int id;
	private String name;
	private ArrayList<Book> borrowedBooks;

		//declaring the constructor
	public Member(int id,String name) {
		this.id=id;
		this.name=name;
		this.borrowedBooks=new ArrayList<>();
	}
		// creating the setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
		//creating the getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
	
	//borrowing books method
	public boolean borrowBook(Book book) {
		if (book==null) {
			System.out.println("The book reference is invalid.");
			return false;
		}
		if (!book.isAvailable()) {
			System.out.println("The book: " + book.getTitle() + " is not available right now.");
			return false;
		}
		borrowedBooks.add(book);
		book.setAvailable(false);
		System.out.println(name + " borrowed " + book.getTitle() + " and it's marked as borrowed now.");
		return true;
	}
	// returning books method

	
	
	
	
}

