package LibraryManagmentSystemOOP;
public class Book {
	    private String bookID;
	    private String title;
	    private String author;
	    private boolean isAvailable;
	    private BookGenre genre;
	
	//Constructor
	    public Book(String bookID, String title, String author, boolean isAvailable, BookGenre genre) {
	        this.bookID = bookID;
	        this.title = title;
	        this.author = author;
	        this.isAvailable = isAvailable;
	        this.genre = genre;
	    }

		//overloaded constructor
	    public Book(String bookID, String title, String author) {
	        this(bookID, title, author, true, BookGenre.OTHER);
	    }
	 
	 //getters and setters
	    public String getBookID() {
	        return bookID;
	    }

	    public void setBookID(String bookID) {
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
	        this.isAvailable = isAvailable;
	    }

	    public BookGenre getGenre() {
	        return genre;
	    }

	    public void setGenre(BookGenre genre) {
	        this.genre = genre;
	    }
	    
	    //
	    public boolean returnBook() {
	        if (isAvailable) {
	            return false;
	        }
	        this.isAvailable = true;
	        return true;
	    }
	    
	    public boolean borrowBook() {
	        if (!isAvailable) {
	            return false;
	        }
	        this.isAvailable = false;
	        return true;
	    }
	
	    public void displayBookInfo() {
	        System.out.println("Book ID: " + bookID + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
	    }
	}
