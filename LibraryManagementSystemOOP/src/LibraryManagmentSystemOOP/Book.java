package LibraryManagmentSystemOOP;
public class Book {
	private int bookID;
	private String title;
	private String author;
	private static boolean isAvailable;
	private BookGenre genre;
	
	//Constructor
	public Book(int bookID, String title ,String author, boolean isAvailable, BookGenre genre) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		Book.isAvailable = true;
		this.genre = genre;
	}
		//overloaded constructor
	 public Book(int bookID, String title, String author) {
	        this(bookID, title, author, isAvailable, BookGenre.OTHER);
	    }
	 
	 //getters and setters
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		Book.isAvailable = isAvailable;
	}
	
	public BookGenre getGenre() {
		return genre;
	}
	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}
	
	//
	public boolean returnBook() {
        if (isAvailable) return false;
        Book.isAvailable = true;
        return true;
    }
	
	//override
	   public String toString() {
	        return String.format("ID:%d | %s by %s | Genre:%s | Available:%s",
	                bookID, title, author, genre, isAvailable ? "Yes" : "No");
	    }
	   

	}
