package day23;

public class Book {
	private String title;
	private String author;
	private double price;
	private int id;
	
	
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public double getprice() {
		return price;
		
	}
	public int getid() {
		return id;
	}
	
	public void settitle(String title) {
		this.title=title;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setid(int id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", id=" + id
				+ "]";
	}

	public Book(String title, String author, double price, int id) {
		super();
	
		this.title = title;
		this.author = author;
		this.price = price;
		this.id = id;
	}

	public Book() {
		super();
		
	}


	
	
	

}
