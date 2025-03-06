package Book;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable = true;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		}
	
	public void borrow() {
		isAvailable = false;
		System.out.println("Book borrowed...");
	}
	
	public void returnBook() {
		isAvailable = true;
		System.out.println("Book returned...");
	}
	
	public void getStatus() {
		String available = "";
		if (isAvailable == true) {
			available = "Available";
		}
		else {
			available = "Not Available";
		}
		System.out.print(
				"Title: " + title + "\n"
				+ "Author: " + author + "\n"
				+ "ISBN: " + isbn + "\n"
				+ "Output: " + available);
	}
}
